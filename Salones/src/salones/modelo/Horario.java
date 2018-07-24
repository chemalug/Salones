/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salones.modelo;

import java.sql.Time;

/**
 *
 * @author efiapp
 */
public class Horario {
    private int codigo;
    private Time hora_inicio;
    private Time hora_fin;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }

    public Horario() {
    }

    public Horario(int codigo, Time hora_inicio, Time hora_fin) {
        this.codigo = codigo;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    @Override
    public String toString() {
        return hora_inicio.toString();
    }
}