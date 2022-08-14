
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
    
    private static Connection connection;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    //private static final String url ="jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String url ="jdbc:oracle:thin:@//localhost:1521/orcl";
    private static final String username = "cesar";
    private static final String password = "123456";
    
    
    public Connection getConnection() throws ClassNotFoundException{
        
        try {
            Class.forName(driver);
            connection=DriverManager.getConnection(url, username, password);
            System.out.println("Conexion estableciada");
            
            return connection;
        } catch (Exception e) {
            System.out.println("No se puedo connectar");
            System.out.println(e);
            return null;
        }
    }
    
    public void desconnectar(){
    connection=null;
        if (connection==null) {
            System.out.println("Conexion terminada");
            
        }
    }
}
