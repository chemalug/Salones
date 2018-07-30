/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author u-jona
 */
public class J_Conector {
    
    //Este es el link del driver cambiado
    private static final String CLASE = "com.mysql.jdbc.Driver";

    private final String host = "35.232.63.100";
    private final String usuario = "efi";
    private final String clave = "Hola1234";
    private final String nombre = "db_salones";
    private final String url;

    private Connection link;
    private Statement st;

    private String mensajeError;


    public J_Conector() {
        this.mensajeError = "";
        this.url = "jdbc:mysql://" + this.host + "/" + this.nombre;
    }

    public boolean conectar() {
        try {
            Class.forName(CLASE).newInstance();
            this.link = DriverManager.getConnection(this.url, this.usuario, this.clave);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return true;
    }
    public boolean consultaG(String consulta) {

        int resultado;

        try {

            this.st = this.link.createStatement();
            resultado = this.st.executeUpdate(consulta);

        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return (resultado > 0);
    }
    
    
    public ResultSet consultar(String sql){
        ResultSet resultado = null;
        this.conectar();
        try {
            this.st = this.link.createStatement();
            resultado = this.st.executeQuery(sql);

        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return resultado ; 
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
    
    
}