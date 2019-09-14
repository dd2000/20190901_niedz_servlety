<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 14.09.2019
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--[if IE 9]>
<html class="lt-ie10" lang="en"> <![endif]-->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Servlet HOME współpracuje z home.class</title>
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.3/css/normalize.min.
css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.3/css/foundation.min
.css">
    <link
            href='https://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-
icons.css' rel='stylesheet'
            type='text/css'>
    <script
            src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
</head>
<body>
<table>
    <tbody>
        <tr><th>ID</th><th>name</th><th>Role</th></tr>
        <c:forEach items="${requestScope.studentList}" var="stu">
            <tr>
                <td><c:out value="${stu.id"}<c:out></td>
                <td><c:out value="${stu.name"}<c:out></td>
                <td><c:out value="${stu.role"}<c:out></td>
            </tr>
        </c:forEach>

    <c:if test="${requestScope.tresc ne null}">
        <c:out value="${requestScope.tresc}" escapeXml="true"></c:out>
    </c:if>
    <br>

    <c:set var="id" value="5" scope="request"></c:set>
    <c:out value="${requestScope.id}"></c:out>

    <a href="<c:url value="${requestScope.url}"><c:/url>">Url_Url_Url</a>
    </tbody>
</table>
</body>
</html>
