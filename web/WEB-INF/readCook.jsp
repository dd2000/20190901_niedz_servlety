<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 07.09.2019
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie cookie = null;
    Cookie[] cookies = null;
    cookies = request.getCookies();

    if (cookies != null){
        for (int i = 0; i<cookies.length; i++) {
            cookie = cookies[i];
            out.print("<br>Name: "+cookie.getName());
            out.print("<br>Value: "+cookie.getValue());
        }
    } else {
        out.print("<h1> Nie ma Tomak, naszego ciacha</h1>");
    }
%>

</body>
</html>
