package JAVA;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;


public class ServletJDBC {
protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
        String nameUser;
        Driver driver = new Driver();
        DriverManager. registerDriver((java.sql.Driver) driver);

        Connection connection = driver.connect("jdbc:mysql://localhost:3306/sda?user=root&password=&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", null);
        Statement statement = connection.createStatement();
        if (statement.execute("SELECT * from user")) {
            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {
                nameUser = resultSet.getString("imie") + resultSet.getString("nazwisko");
                response.getWriter().println(nameUser);
            }
        }
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    private class Driver {
        public Connection connect(String s, Object o) {
            return null;
        }
    }
}
