/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones.controlador;

import Salones.datos.ConectorLourdes;
import Salones.modelo.Tipo_Evento;

/**
 *
 * @author EFI
 */
public class Tipo_EventoControlador {
    
    
    //INSERTAR DATOS
    public void Insertar(Tipo_Evento modCarrera){


 ConectorLourdes c = new ConectorLourdes();
     c.conectar();

  c.insertar( "INSERT INTO  tbl_tipo_evento (codigo, descripcion) VALUE  ("+modCarrera.getCodigo()+", '"+modCarrera.getDescripcion()+"');");
  

} 
}
