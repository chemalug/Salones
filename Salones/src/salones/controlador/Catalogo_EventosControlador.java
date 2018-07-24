/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Salones.modelo.Catalogo_Evento;
import Salones.modelo.Tipo_Evento;
import Salones.datos.ConectorLourdes;
import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author LouFlores
 */


// CONSULTA LAS CARRERAS PARA MOSTRARLAS EN EL JTABLE
public class Catalogo_EventosControlador {
    public ArrayList<Catalogo_Evento> ConsultarCarrera() {
 //establecer conexion con bd
  ConectorLourdes conex = new ConectorLourdes();
  conex.conectar();
  ArrayList<Catalogo_Evento> miLista = new ArrayList<Catalogo_Evento>();
  //crear consulta SQL mediante Resulset
 ResultSet rs = conex.consulta("SELECT codigo, nombre_evento, codigo_tipo_evento, duracion FROM tbl_catalogo_eventos;");
 //crear Try catch con bucle while para que agregre los datos 
  try {
   while (rs.next()) {
   Catalogo_Evento aux = new Catalogo_Evento();
    aux.setCodigo(rs.getString("codigo"));
    aux.setNombre_evento(rs.getString("nombre_evento"));
     aux.setCodigo_tipo_evento(rs.getString("codigo_tipo_evento"));
    aux.setDuracion(rs.getString("duracion"));
    
    
    miLista.add(aux);
   }
   rs.close();
   
   conex.desconectar();
 
  } catch (SQLException e) {
   System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
     JOptionPane.ERROR_MESSAGE);
 
  }
  return miLista;
 }
   //INSERTAR DATOS

public void Insertar(Catalogo_Evento modCarrera){


 ConectorLourdes c = new ConectorLourdes();
     c.conectar();
//     String prueba="";
//     prueba = ( "INSERT INTO  tbl_carrera (codigo, codigo_tipo_carrera, nombre_carrera, estado_carrera, version) VALUE  ("+modCarrera.getCodigo()+", "+modCarrera.getTipo_carrera()+",'"+modCarrera.getNombre()+"','"+modCarrera.getEstado()+"', "+modCarrera.getVersion()+");");
//    
  c.insertar( "INSERT INTO  tbl_catalogo_eventos(codigo, nombre_evento, codigo_tipo_evento, duracion) VALUE  ('"+modCarrera.getCodigo()+"', '"+modCarrera.getNombre_evento()+"','"+modCarrera.getCodigo_tipo_evento()+"','"+modCarrera.getDuracion()+"');");
  

} 

//CONSULTA LOS TIPOS DE DATO PARA LLENAR EL JCOMBOBOX
public void consultar_tipo(JComboBox cbxTipocarrera){

//Creamos objeto tipo Connection  para establecer conexion con bd  
java.sql.Connection conectar = null;    
PreparedStatement pst = null;

ConectorLourdes conex = new ConectorLourdes();
  conex.conectar();
//Creamos la Consulta SQL

   ResultSet rs = conex.consulta("SELECT codigo, descripcion FROM tbl_tipo_evento ORDER BY descripcion ASC;");
//Establecemos bloque try-catch-finally
try {      
   //LLenamos nuestro ComboBox
   cbxTipocarrera.removeAllItems();
   cbxTipocarrera.addItem("Seleccione un tipo de evento");
    Tipo_Evento tipoCarrera;
   while(rs.next()){   
       
       cbxTipocarrera.addItem(new Tipo_Evento(rs.getInt(1), rs.getString(2)));
   }    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);   
}finally{
    if(conectar!=null){        
        try {       
            conectar.close();
            rs.close();            
            conectar=null;
            rs=null;
            
        } catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, ex);    
        }
    }
}
}




//CONSULTA EL CODIGO DE LA TABLA TIPO DE CARRERA PARA LLENAR EL JTXTFIELD
public void llenar_jtxtfield(JTextField txtCodigo){

//Creamos objeto tipo Connection  para establecer conexion con bd  
java.sql.Connection conectar = null;    
PreparedStatement pst = null;

ConectorLourdes conex = new ConectorLourdes();
  conex.conectar();
//Creamos la Consulta SQL

   ResultSet rs = conex.consulta("SELECT MAX(codigo) + 1 FROM tbl_tipo_evento;");
//Establecemos bloque try-catch-finally
try {      
   //LLenamos nuestro ComboBox
 
    Tipo_Evento tipoCarrera;
   while(rs.next()){   
       
       txtCodigo.setText(rs.getString(1));
   }    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);   
}finally{
    if(conectar!=null){        
        try {       
            conectar.close();
            rs.close();            
            conectar=null;
            rs=null;
            
        } catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, ex);    
        }
    }
}
}

//MODIFICA LOS DATOS DE LA CARRERA SELECCIONADA

public void Actualizar(Catalogo_Evento modCarrera){


 ConectorLourdes c = new ConectorLourdes();
     c.conectar();
     String prueba="";
   c.insertar( "UPDATE tbl_catalogo_eventos SET  codigo= '"+modCarrera.getCodigo()+"',nombre_evento= '"+modCarrera.getNombre_evento()+"',codigo_tipo_evento='"+modCarrera.getCodigo_tipo_evento()+"', duracion= '"+modCarrera.getDuracion()+"' WHERE codigo ='"+modCarrera.getCodigo()+"';");
  

}



//BUSCAR POR CODIGO EN JTABLE

public ArrayList<Catalogo_Evento> buscarCarrera(String codigo) {
 //establecer conexion con bd
  ConectorLourdes conex = new ConectorLourdes();
  conex.conectar();
  ArrayList<Catalogo_Evento> miLista = new ArrayList<Catalogo_Evento>();
  //crear consulta SQL mediante Resulset
  
 ResultSet rs = conex.consulta("SELECT * FROM tbl_catalogo_eventos WHERE codigo LIKE '%"+ codigo +"%'");

 //crear Try catch con bucle while para que agregre los datos 
  try {
   while (rs.next()) {
   Catalogo_Evento aux = new Catalogo_Evento();
    aux.setCodigo(rs.getString("codigo"));
    aux.setNombre_evento(rs.getString("nombre_evento"));
     aux.setCodigo_tipo_evento(rs.getString("codigo_tipo_evento"));
    aux.setDuracion(rs.getString("duracion"));
   
    
    miLista.add(aux);
  
   }
   rs.close();
   
   conex.desconectar();
 
  } catch (SQLException e) {
   System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
     JOptionPane.ERROR_MESSAGE);
 
  }
  return miLista;
 }
// ELIMINA DATOS DE LA TABLA CARRERA


public void Eliminar(Catalogo_Evento deCarrera){
    ConectorLourdes c = new ConectorLourdes();
     c.conectar();
     String sql = "DELETE FROM tbl_catalogo_eventos WHERE codigo ='"+deCarrera.getCodigo()+"';";
     c.delDatos(sql);
     
 }







}
