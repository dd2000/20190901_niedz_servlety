import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class DataServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession hs = request.getSession();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter pw = response.getWriter();

        Date date = (Date) hs.getAttribute("date");
        if (date != null){
            pw.println("Ostatni dostęp do strony: "+ date + "<br>");
        } //if

        date = new Date();
        hs.setAttribute("date", date);
        pw.println("Aktualna data:"+date);
        pw.println("<br />");

        pw.close();
    }
}
