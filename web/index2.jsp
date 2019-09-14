<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 14.09.2019
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<!--[if IE 9]>
<html class="lt-ie10" lang="en"> <![endif]-->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSTL</title>
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
<c:out value="${user.imie}" escapeXml="true" />
<c:out value="${user.wiek}" escapeXml="true" />
<c:out value="${user.nazwisko}" escapeXml="true" />
<c:set value="${user.imie}" var="imieUsera" scope="request" />
${imieUsera}
<c:set value="tekst" var="zmiennaUsera" scope="request" />
<c:if test="${zmiennaUsera eq 'tekst'}" >
    OK`
</c:if>
<c:if test="${user.imie eq 'Sylwia'}" >
    OK
</c:if>
<c:set target="${user}" property="imie" value="Dawid" />
${user.imie}
<c:catch var="catchException">
    <% int x = 5/0; %>
</c:catch>
<c:if test="${catchException != null}">
    <p>The exception is: ${catchException} <br>
        There is an exception ${catchException.message}
    </p>
</c:if>
</body>
</html>

