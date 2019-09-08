import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Zadanie2JSP")
public class Zadanie2JSP extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        if (request.getParameterMap().containsKey("id")){
            response.sendRedirect("/stronaBledu.jsp");
        } // if
    }
} // class Zadanie2JSP
