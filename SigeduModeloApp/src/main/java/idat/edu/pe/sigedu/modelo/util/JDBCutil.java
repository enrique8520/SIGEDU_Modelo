package idat.edu.pe.sigedu.modelo.util;


import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCutil {
    
    private final String usuarioBD = "root";
    
    private final String passwordBD = "12345678 ";
    
    private final String urlConeccion = "jdbc:mysql//localhost:3036/SIGEDU_DB?zeroDateTimeBehavior=convertToNull";
            
    private final String driverClass = "com.mysql.jdbc.Driver";
 
    private Connection coneccion;
    
    private PreparedStatement sentencia;
    
    private ResultSet resultados;
        
    public JDBCutil () {
                
        try {
            Class.forName(driverClass);
            coneccion = DriverManager.getConnection(usuarioBD, usuarioBD, passwordBD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCutil.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
        
    }
    
    
}
    