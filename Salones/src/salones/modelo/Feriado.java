/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salones.modelo;

/**
 *
 * @author efiapp
 */
public class Feriado {
    private int codigo;
    private int mes;
    private int dia;
    private int anio;

    public Feriado() {
    }

    public Feriado(int codigo, int mes, int dia) {
        this.codigo = codigo;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    
    public Feriado(int codigo, int mes, int dia, int anio) {
        this.codigo = codigo;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "" + anio + "-" + String.format("%02d", mes) + "-" + dia;
    }
    
    
}
