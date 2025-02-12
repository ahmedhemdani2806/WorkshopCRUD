package utile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datasource {
    private String url="jdbc:mysql://51.254.126.228:3306/GeekHub";
    private String username="Ahmed";
    private String pwd="Ahmed";
    private static Datasource  instance;
    private Connection connection;
    private Datasource() {
        try {
            connection=DriverManager.getConnection(url, username, pwd);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Datasource getInstance ()
    {
        if (instance == null)
            instance = new Datasource();

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}




