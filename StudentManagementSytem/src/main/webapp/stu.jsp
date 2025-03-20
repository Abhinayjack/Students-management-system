<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Login</title>
</head>
<body>
    <h1>Student Login</h1>
    <%
        String msg = (String) request.getAttribute("msg");
        if (msg != null) {
            out.println("<p>" + msg + "</p>");
        }
    %>
    <form action="studentlogin" method="get">
        <label for="rollno">Roll Number:</label>
        <input type="text" name="rollno" id="rollno" required>
        <button type="submit">Login</button>
    </form>
</body>
</html>
