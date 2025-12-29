package MODULOSTAREAMODELAMIENTO; // <--- CAMBIA ESTO si tu paquete se llama diferente

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javax.swing.JOptionPane;

public class CConexion {
    
    Connection conectar = null;
    
    public Connection establecerConexion() {
        try {
            // 1. Buscamos el archivo database.properties en la raíz del proyecto
            Properties p = new Properties();
            p.load(new FileInputStream("database.properties")); 
            
            // 2. Leemos los datos que pegaste antes
            String driver = p.getProperty("db.driver");
            String url = p.getProperty("db.url");
            String user = p.getProperty("db.user");
            String password = p.getProperty("db.password");
            
            // 3. Conectamos
            Class.forName(driver);
            conectar = DriverManager.getConnection(url, user, password);
            
        
        } catch (java.io.FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: Falta el archivo database.properties en la raíz");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexión: " + e.toString());
        }
        return conectar;
    }
   /* public static void main(String[] args) {
        CConexion test = new CConexion();
        test.establecerConexion();
    }*/
}