<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
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
        while (headerNames.hasMoreElements()) {
            String paramName = (String) headerNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>");
            String paramValue = request.getHeader(paramName);
            out.print("<td>" + paramValue + "</td></tr>");
        }
    %>
</table>
</body>
</html>

