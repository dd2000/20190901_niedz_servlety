<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 08.09.2019
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="text" class="action.TestBean" />
    <jsp:setProperty name="text" property="message" value="Cześć SDA" />
    <jsp:getProperty name="text" property="message"/>
</body>
</html>
