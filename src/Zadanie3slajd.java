/*
Ćwiczenie 3:
Treść:
Skonstruuj serwlet, który zwróci odpowiedź, jeśli w żądaniu będzie zawarte ciasteczko o pewnej przyjętej nazwie i wartości.
Instrukcja rozwiązania:
1. Dodaj nowy serwlet do aplikacji lub skorzystaj z poprzedniego.
2. Skorzystaj z kolekcji ciasteczek żądania, aby znaleźć zweryfikowa pożądane ciasteczko.
 */

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class Zadanie3slajd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    } //doPost
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html; charset=utf-8");
        for(int i=0; i< request.getCookies().length; i++)
        {
            Cookie cookie = request.getCookies()[i];
            if (cookie.getName().equals("data") && cookie.getValue().equals("45454")) {
                response.getWriter().println("Czad! Jesteś ciachem!");
            } // if
        }// for

    } // doGet()
}
