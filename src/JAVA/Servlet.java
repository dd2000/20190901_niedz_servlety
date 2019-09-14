import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nameUser;
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            Connection connection = driver.connect("jdbc:mysql://localhost:3306/sda?user=root&password=&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", null);
            Statement statement = connection.createStatement();
            if(statement.execute("SELECT * from user")) {
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()){
                    nameUser = resultSet.getString("imie") + " " + resultSet.getString("nazwisko");
                    response.getWriter().println(nameUser);
                }
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}