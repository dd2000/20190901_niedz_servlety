<%--
  Created by IntelliJ IDEA.
  User: dd2000
  Date: 01.09.2019
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int dzien = 7; %>
<%! int rozmiar ; %>
<%! int zmien; %>



<html>
  <head>
    <title>Test JSP</title>
  </head>
  <body>
  <%!
    int x = 5;
  %>

  <% int sum = 2 + 2;
  out.print(sum);
  %>

  <%="Witajcie w SDA"%>

  <%@page import="java.util.Date" %>
  Dzień jest <%= new Date()%>
  <% if(dzien == 1) { %>
  <p>Jest poniedziałek</p>
  <% } else { %>
  <p>Jest niedziela</p>
  <% } %>

  <% for (rozmiar = 1; rozmiar <=5; rozmiar++){ %>
  <font color = "blue" size="<%= rozmiar %>">
    Przykładowa zmiana rozmiaru i koloru
  </font> <br />
  <% } %>

  <% for (zmien = 9; zmien <=16; zmien++){ %>
  <font color = "<%= zmien %>" size="<%= zmien %>">
    Przykładowa zmiana rozmiaru i koloru
  </font> <br />
  <% } %>

  </body>
</html>
