
package Salones.controlador;

import Salones.datos.ConectorJosh;
import Salones.modelo.Feriados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FeriadosControlador {
    public ArrayList<Feriados> obtenerDatos() {
        ConectorJosh db = new ConectorJosh();
        db.conectar();
        ArrayList<Feriados> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("select * from tbl_feriados");
        try {
            while (resultado.next()) {
                Feriados aux = new Feriados();
                aux.setCodigo(resultado.getInt(1));
                aux.setDia(resultado.getInt(2));
                aux.setMes(resultado.getInt(3));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

    public void insertarDatos(Feriados datosF) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        //String sql = ("INSERT INTO tbl_feriados (dia, mes)" + "VALUES ("+  datosF.getDia()+"," +datosF.getMes()+ ");" );
        //System.out.println(sql);
        c.insertar("INSERT INTO tbl_feriados (dia, mes)" + "VALUES ("+  datosF.getDia()+"," +datosF.getMes()+ ");");

        c.desconectar();
    }

    public void updateDatos(Feriados datosI) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        c.insertar("UPDATE tbl_feriados SET dia="+datosI.getDia()+", mes="+datosI.getMes()+" WHERE codigo="+datosI.getCodigo()+";");
       /* String sql =("UPDATE tbl_feriados SET dia="+datosI.getDia()+", mes="+datosI.getMes()+" WHERE codigo="+datosI.getCodigo()+";");
        System.out.println(sql);*/
    }

    public void borrarDatos(Feriados delFeriados) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        String sql = "DELETE FROM tbl_feriados WHERE codigo =" + delFeriados.getCodigo() + ";";
        c.delDatos(sql);

    }

    public ArrayList<Feriados> buscarDatos(String codigo) {
        ConectorJosh db = new ConectorJosh();
        db.conectar();
        ArrayList<Feriados> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("SELECT * FROM tbl_feriados WHERE codigo LIKE '%" + codigo + "%'");
        try {
            while (resultado.next()) {
                Feriados aux = new Feriados();
                aux.setCodigo(resultado.getInt(1));
                aux.setDia(resultado.getInt(2));
                aux.setMes(resultado.getInt(3));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }  
}
