<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.StudentBean"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Login Success</title>
</head>
<body>
<%
StudentBean ab = (StudentBean) session.getAttribute("abean");
if (ab != null) {
    out.println("Welcome Student Login: " + ab.getRollNo() + "<br>");
} else {
    out.println("Session expired or invalid login! Please try again.");
}
%>
<a href="studentlogout">Logout</a>


</body>
</html>
