import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ColorGetServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kolor = request.getParameter("kolor");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();

        printWriter.println("Wybrany kolor (Get): ");
        printWriter.println(kolor);
        printWriter.close();
    }
}
