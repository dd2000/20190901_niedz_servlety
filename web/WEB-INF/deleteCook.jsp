<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 08.09.2019
  Time: 09:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        if(cookie.getName().compareTo("first_name")==0){
            cookie.setMaxAge(0);
            cookie.setValue(null);
            response.addCookie(cookie);
            out.print("usunięto ciasteczko " + cookie.getName()+ "<br>");
        }
        out.print("<br> Name: " + cookie.getName() + ", ");
        out.print("<br> Value: " + cookie.getValue() + "<br>");
    }
%>
</body>
</html>
