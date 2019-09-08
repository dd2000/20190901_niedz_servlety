<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 08.09.2019
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Pierwsza strona JSP</p>
<p>Aktywny użytkownik, ${param.user}</p>

<jsp:include page="/menu.jsp">
    <jsp:param name="nameUser" value="${param.user}"/>
</jsp:include>

</body>
</html>
