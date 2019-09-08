<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 07.09.2019
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  Cookie firstName = new Cookie("first_Name", request.getParameter("first_name"));
  Cookie lastName = new Cookie("last_Name", request.getParameter("last_name"));

  firstName.setMaxAge(60*160);
  lastName.setMaxAge(60*160);

  response.addCookie(firstName);
  response.addCookie(lastName);
 %>
<html>
<head>
    <title>TomekCiacho</title>
</head>
<body>
<p>First Name: <%= request.getParameter("first_name")%></p>
<p>Last Name: <%= request.getParameter("last_name")%></p>
</body>
</html>
