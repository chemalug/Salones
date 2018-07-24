/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salones.controlador;

import Salones.modelo.Catalogo_Evento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import salones.datos.Database;
import salones.modelo.Asignacion_Evento;
import salones.modelo.Feriado;
import salones.modelo.Horario;
import salones.modelo.Salon;

/**
 *
 * @author efiapp
 */
public class Asignacion_EventoControlador {
    public ArrayList<Salon> obtenerSalones() {
        ArrayList<Salon> listado = new ArrayList<>();
        ResultSet st = Database.consultar("Select * from tbl_salon");
        try {
            while (st.next()) {

                Salon aux = new Salon();
                aux.setCodigo(st.getInt(1));
                aux.setNombre_salon(st.getString(2));
                aux.setCapacidad_salon(st.getInt(3));
                aux.setPc_instructor(st.getInt(4));
                aux.setProyector(st.getInt(5));
                aux.setPizarron(st.getInt(6));
                aux.setPc_participantes(st.getString(7));
                aux.setObservaciones(st.getString(8));
                listado.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Asignacion_EventoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.desconectar();
        System.out.println(listado);
        return listado;
    }
    public ArrayList<Horario> obtenerHorario() {
        ArrayList<Horario> listado = new ArrayList<>();
        String sql = "Select * from tbl_horario";
        System.out.println(sql);
        ResultSet rs = Database.consultar(sql);
        try {
            while (rs.next()) {
                Horario aux = new Horario(rs.getInt(1),
                        rs.getTime(2), rs.getTime(3));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(Asignacion_EventoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    public ArrayList<Horario> obtenerHorario(String hora) {
        ArrayList<Horario> listado = new ArrayList<>();
        String sql = "Select * from tbl_horario where hora_inicio = '" + hora + "'";
        System.out.println(sql);
        ResultSet rs = Database.consultar(sql);
        try {
            while (rs.next()) {
                Horario aux = new Horario(rs.getInt(1),
                        rs.getTime(2), rs.getTime(3));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(Asignacion_EventoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    public ArrayList<Catalogo_Evento> obtenerEventos(){
        ArrayList<Catalogo_Evento> listado = new ArrayList<>();
        ResultSet rs = Database.consultar("Select * from tbl_catalogo_eventos");
        try {
            while (rs.next()) {
                Catalogo_Evento aux = new Catalogo_Evento(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4));
                listado.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Asignacion_EventoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    public ArrayList<Feriado> obtenerFeriados(){
        ArrayList<Feriado> listado = new ArrayList<>();
        
        ResultSet rs = Database.consultar("Select * from tbl_feriados");
        try {
            while (rs.next()) {
                Feriado aux = new Feriado(rs.getInt(1), rs.getInt(3),rs.getInt(2),Calendar.getInstance().get(Calendar.YEAR));
                listado.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Asignacion_EventoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    public int insertarAsignacionEvento(Asignacion_Evento ae){
        int respuesta = 0;
        String sql = "INSERT INTO tbl_asignacion_evento (codigo,codigo_salon,codigo_evento,dias_se_inmparte,estado_evento,fecha_inicio,fecha_fin,horas_x_sesion, hora_inicio,hora_fin) VALUES ('" + ae.getCodigo() + "'," 
                + ae.getCodigo_salon() + ",'" + ae.getCodigo_evento() + "','" + ae.getDias_se_inparte() + "'," 
                + ae.getEstado_evento() + ",'" + ae.getFecha_inicio() + "','" + ae.getFecha_fin() + "'," 
                + ae.getHoras_sesion() + "," + ae.getHora_inicio() + "," + ae.getHora_fin() + ")";
        
        Database.insertar(sql);
        return respuesta;
    }
}
