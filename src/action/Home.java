package action;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Home")
public class Home extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setId(1);
        student.setName("Bogusz");
        student.setRole("Developer");

        Student student1 = new Student();
        student.setId(2);
        student.setName("Adam");
        student.setRole("menager");

        studentList.add(student);
        studentList.add(student1);

        request.setAttribute("studentList", studentList);
        request.setAttribute("tresc", "stworzenie nowej linii");
        request.setAttribute("url", "http://google.pl");

        RequestDispatcher rd= getServletContext().getRequestDispatcher("/home.jsp");
        rd.forward(request, response);

    }

}
