package studentLoginTest;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import test.StudentBean;

@WebServlet("/studentlogin")
public class StudentLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public StudentLoginServlet() {
        super();
    }

  
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        doPost(req, res); 
    }

  
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            String rollNo = req.getParameter("rollno");
            StudentLoginDao dao = new StudentLoginDao();
            StudentBean ab = dao.login(rollNo);

            if (ab == null) {
                req.setAttribute("msg", "invalidlogin");
                req.getRequestDispatcher("stu.jsp").forward(req, res);
            } else {
                HttpSession hs = req.getSession();
                hs.setAttribute("abean", ab);
                req.getRequestDispatcher("Studentlogin.jsp").forward(req, res);
            }
        } catch (Exception e) {
            req.setAttribute("msg", "Error occurred during login!");
            req.getRequestDispatcher("stu.jsp").forward(req, res);
        }
    }


    }

