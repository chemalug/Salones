/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones.modelo;
/**
 *
 * @author EFI
 */
public class Tipo_Evento {
    public int codigo;
    public String descripcion;

    public Tipo_Evento() {
    }

    public Tipo_Evento(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Tipo_Evento(String descripcion ) {
        this.descripcion=descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion ;
    }
    
  
}
