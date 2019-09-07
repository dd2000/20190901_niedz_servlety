import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Browser")
public class Browser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String browser = request.getHeader("user-agent");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter printWriter = response.getWriter();

        printWriter.println("Przeglądarka to:");
        printWriter.println("<hr />");

        if (browser.indexOf("Chrome")!=-1){
            printWriter.println("Masz Chrome");
        }// if
        else if (browser.indexOf("Firefox")!=-1){
            printWriter.println("Masz Firefox");
        } else {
            printWriter.println("Masz inną przeglądarkę! ");
        }
    }
} // class Browser
