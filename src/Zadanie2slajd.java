/*
Ćwiczenie 2:
Treść: Skonstruuj serwlet, który pozwoli na odrębną reakcję w zależności od tego,
czy użytkownik odwiedził stronę po raz pierwszy, czy też nie.
Instrukcja rozwiązania:
1. Dodaj nowy serwlet do aplikacji lub skorzystaj z poprzedniego.
2. Skorzystaj z sesji, aby rozróżniezachowanie serwletu.
 */


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Zadanie2slajd")
public class Zadanie2slajd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    } //doPost
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html; charset=utf-8");
        HttpSession httpSession = request.getSession();

        if (httpSession.getAttribute("sesja") != null) {
            response.getWriter().println("Wszystko OK!");
        } // if
        else {
            httpSession.setAttribute("sesja",1);
            response.getWriter().println("Wszystko przed nami...<br />");
        } // else
        response.getWriter().println("... tekst poza if-em: Witajcie SDA!");
        response.getWriter().close();
    } // doGet()
} // class Zadanieslajd


