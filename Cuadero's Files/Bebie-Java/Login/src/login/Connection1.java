package login;
import java.sql.Connection;
import java.sql.DriverManager;
public class Connection1 {
    
    public static Connection getConnection()
    {
        Connection cn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriveManager.getConnection("jdbc:mysql://localhost/Lorenfe Cuadero" , "Lorenfe Cuadero", "lorenfe");
        }
        catch(Exception x)
        {
        System.out.println(x.getMessage());
        }
        return cn;
    }
}
