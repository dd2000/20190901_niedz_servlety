/*
Ćwiczenie 3:
Treść:
Skonstruuj serwlet, który zwróci odpowiedź, jeśli w żądaniu będzie zawarte ciasteczko o pewnej przyjętej nazwie i wartości.
Instrukcja rozwiązania:
1. Dodaj nowy serwlet do aplikacji lub skorzystaj z poprzedniego.
2. Skorzystaj z kolekcji ciasteczek żądania, aby znaleźć zweryfikowa pożądane ciasteczko.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/Zadanie3slajd")
public class Zadanie3slajd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    } //doPost
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html; charset=utf-8");
        for(int i=0; i< request.getCookies().length; i++)
        {
            Cookie cookie = request.getCookies()[i];
            // jeśli jest ciasteczko o nazwie "data" i ma wartość 45454 wyświetl "Czad! Jesteś ciachem!"
            if (cookie.getName().equals("data") && cookie.getValue().equals("45454")) {
                response.getWriter().println("Czad! Jesteś ciachem!");
            } else {
                response.getWriter().println("Ciacho nie wyszło!");
            } // if
        }// for

    } // doGet()
}
