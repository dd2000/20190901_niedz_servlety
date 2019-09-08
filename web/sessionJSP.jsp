<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 08.09.2019
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Date crestaTime = new Date(session.getCreationTime());
    Date lastAcessTime = new Date(session.getLastAccessedTime());
    String title = "Witaj z powrotem";
    String visitCountKey = "visitCount";
    Integer visitCount = null;

    String userIDKey = "userID";
    String userID = "javaID";

    if (session.isNew()) {
        title = "Witaj brachu!";
        session.setAttribute(userIDKey, userID);
        session.setAttribute(visitCountKey, visitCount);

    visitCount = (Integer) session.getAttribute(visitCountKey);
    if (visitCount == null) {
        visitCount = 0;
    }
    visitCount = visitCount + 1;
    session.setAttribute(visitCountKey, visitCount);
    }


%>
</body>
</html>
