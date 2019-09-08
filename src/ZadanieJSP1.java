import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ZadanieJSP1")
public class ZadanieJSP1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index2.jsp");
        requestDispatcher.include(request, response);
    }
}
