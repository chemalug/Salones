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
public class Calendario_Salon {
    private int codigo_salon;
    private int codigo_fecha;
    private int codigo_horario;
    private String codigo_asignacion;

    public Calendario_Salon() {
    }

    public Calendario_Salon(int codigo_salon, int codigo_fecha, int codigo_horario, String codigo_asignacion) {
        this.codigo_salon = codigo_salon;
        this.codigo_fecha = codigo_fecha;
        this.codigo_horario = codigo_horario;
        this.codigo_asignacion = codigo_asignacion;
    }

    public int getCodigo_salon() {
        return codigo_salon;
    }

    public void setCodigo_salon(int codigo_salon) {
        this.codigo_salon = codigo_salon;
    }

    public int getCodigo_fecha() {
        return codigo_fecha;
    }

    public void setCodigo_fecha(int codigo_fecha) {
        this.codigo_fecha = codigo_fecha;
    }

    public int getCodigo_horario() {
        return codigo_horario;
    }

    public void setCodigo_horario(int codigo_horario) {
        this.codigo_horario = codigo_horario;
    }

    public String getCodigo_asignacion() {
        return codigo_asignacion;
    }

    public void setCodigo_asignacion(String codigo_asignacion) {
        this.codigo_asignacion = codigo_asignacion;
    }

    @Override
    public String toString() {
        return "Calendario_Salon{" + "codigo_salon=" + codigo_salon + ", codigo_fecha=" + codigo_fecha + ", codigo_horario=" + codigo_horario + ", codigo_asignacion=" + codigo_asignacion + '}';
    }
    
}
