/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salones.modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author efiapp
 */
public class Asignacion_Evento {

    private String codigo;
    private int codigo_salon;
    private String codigo_evento;
    private String dias_se_inparte;
    private int estado_evento;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private int horas_sesion;
    private int hora_inicio;
    private int hora_fin;

    public Asignacion_Evento() {
    }

    public Asignacion_Evento(String codigo, int codigo_salon, String codigo_evento, String dias_se_inparte, int estado_evento, LocalDate fecha_inicio, LocalDate fecha_fin, int horas_sesion, int hora_inicio, int hora_fin) {
        this.codigo = codigo;
        this.codigo_salon = codigo_salon;
        this.codigo_evento = codigo_evento;
        this.dias_se_inparte = dias_se_inparte;
        this.estado_evento = estado_evento;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.horas_sesion = horas_sesion;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_salon() {
        return codigo_salon;
    }

    public void setCodigo_salon(int codigo_salor) {
        this.codigo_salon = codigo_salor;
    }

    public String getCodigo_evento() {
        return codigo_evento;
    }

    public void setCodigo_evento(String codigo_evento) {
        this.codigo_evento = codigo_evento;
    }

    public String getDias_se_inparte() {
        return dias_se_inparte;
    }

    public void setDias_se_inparte(String dias_se_inparte) {
        this.dias_se_inparte = dias_se_inparte;
    }

    public int getEstado_evento() {
        return estado_evento;
    }

    public void setEstado_evento(int estado_evento) {
        this.estado_evento = estado_evento;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getHoras_sesion() {
        return horas_sesion;
    }

    public void setHoras_sesion(int horas_sesion) {
        this.horas_sesion = horas_sesion;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }

    @Override
    public String toString() {
        return "Asignacion_Evento{" + "codigo=" + codigo + ", codigo_salon=" + codigo_salon + ", codigo_evento=" + codigo_evento + ", dias_se_inparte=" + dias_se_inparte + ", estado_evento=" + estado_evento + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", horas_sesion=" + horas_sesion + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + '}';
    }
    
    
}
