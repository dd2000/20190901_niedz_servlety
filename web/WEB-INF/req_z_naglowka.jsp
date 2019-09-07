<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.*" %>
<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 07.09.2019
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="100%" border="1" align="center">
    <tr bgcolor="#8a2be2">
        <th>Nazwa nagłówka</th>
        <th>Wartość nagłówka</th>
    </tr>
    <%
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String paramName = (String) headerNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>");
            String paramValue = request.getHeader(paramName);
            out.print("</td>" + paramValue + "</td></tr>");
        }
    %>
</table>

</body>
</html>
