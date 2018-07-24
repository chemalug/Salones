package Salones.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectorLourdes {
    private static final String CLASE = "com.mysql.jdbc.Driver";

    private final String host = "35.232.63.100";
    private final String usuario = "efi";
    private final String clave = "Hola1234";
    private final String nombre = "db_salones";
    private final String url;
Connection c = null;
    private Connection link;
    private Statement statement;

    private String mensajeError;
private String cadena ="";

    public ConectorLourdes() {
        this.mensajeError = "";
        this.url = "jdbc:mysql://" + this.host + "/" + this.nombre;
        
    }

    public boolean conectar() {
        try {
            Class.forName(CLASE).newInstance();
            this.link = DriverManager.getConnection(this.url, this.usuario, this.clave);
            cadena += "jdbc:mysql://" + this.host + "/" + this.nombre;
            c = DriverManager.getConnection(cadena, usuario, clave);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return true;
    }
    public boolean insertar(String consulta) {

        int resultado;

        try {

            this.statement = this.link.createStatement();
            resultado = this.statement.executeUpdate(consulta);

        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return (resultado > 0);
    }
 
    public boolean desconectar() {
        try {
            this.link.close();
        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return true;
    }

    public String getMensajeError() {
        return mensajeError;
    }
     public ResultSet consulta(String sql) {
        ResultSet resultado = null;
        this.conectar();
        try {
             this.statement = this.link.createStatement();
            resultado =statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectorLourdes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
      
        return resultado;
    }
     
     
      
      public boolean delDatos (String consulta){
        int resultado;

        try {

            this.statement = this.link.createStatement();
            resultado = this.statement.executeUpdate(consulta);

        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return (resultado > 0);
    }
}
