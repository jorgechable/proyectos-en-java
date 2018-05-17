
package dba;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Mysql {
private static String db="unalm";
private static String user="root";
private static String pass="aquitupassword";
private static String url="jdbc:mysql://localhost:3306/"+db;
private static Connection Conn;

public static Connection getConnection(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Conn=DriverManager.getConnection(url, user, pass);

}catch(Exception e){
    JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
}
    return Conn;
}


}
