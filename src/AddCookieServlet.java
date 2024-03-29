import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String data = request.getParameter("data");

        Cookie cookie = new Cookie("MyCookie", data);
        cookie.setMaxAge(3600);

        response.addCookie(cookie);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter pw = response.getWriter();
        pw.println("W znaczniku MyCookie zostanie umieszczona wartość:");
        pw.println(data);
        pw.close();

    } // doPost

}
