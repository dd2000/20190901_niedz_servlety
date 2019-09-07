/*
Ćwiczenie 1:
Treść: Utwórz serwlet, który zwróci do klienta zdanie w formacie text/plain z zachowaniem polskich znaków.
Instrukcja rozwiązania:
1. Utwórz klasę dziedziczącą po klasie HttpServlet.
2. Zadeklaruj w niej metodę doGet(), w której znajdzie się treść odpowiedzi.
3. Wygeneruj odpowiedź korzystając z obiektu typu PrintWriter (res.getWriter()), pamiętając o ustawieniu nagłówków.
4. Nie zapomnij o wpisie w pliku konfiguracyjnym web.xml lub adnotacji.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Zadanie1slajd")
public class Zadanie1slajd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    } //doPost
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html; charset=utf-8");
        response.getWriter().println("Witajcie SDA!");
        response.getWriter().close();
    } // doGet()
} // class Zadanie1slajd
