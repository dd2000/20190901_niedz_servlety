<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 08.09.2019
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %><html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Integer liczbaWejsc = (Integer) application.getAttribute("liczbaWejsc");
    if (liczbaWejsc == null || liczbaWejsc == 0) {
     out.println("Pierwszy raz...");
    } else {
        out.println("Witamy z powrotem!");
        liczbaWejsc +=1;
    }
    application.setAttribute("liczbaWejsc", liczbaWejsc);
%>
<p><b>Liczba wejść: </b><%= liczbaWejsc %></p>
</body>
</html>
