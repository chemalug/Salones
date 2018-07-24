/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones.modelo;

/**
 * 
 *
 * @author EFI
 */
public class Catalogo_Evento {
    public String codigo;
    public String nombre_evento;
    public String codigo_tipo_evento;
     public String duracion;

    public Catalogo_Evento() {
    }

    public Catalogo_Evento(String codigo, String nombre_evento, String codigo_tipo_evento, String duracion) {
        this.codigo = codigo;
        this.nombre_evento = nombre_evento;
        this.codigo_tipo_evento = codigo_tipo_evento;
        this.duracion = duracion;
    }
     
     
     

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getCodigo_tipo_evento() {
        return codigo_tipo_evento;
    }

    public void setCodigo_tipo_evento(String codigo_tipo_evento) {
        this.codigo_tipo_evento = codigo_tipo_evento;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }      
  
    @Override
    public String toString() {
        return nombre_evento;
    }
      

   
    
}
