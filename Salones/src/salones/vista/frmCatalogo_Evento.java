/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones.vista;

import Salones.controlador.Catalogo_EventosControlador;
import Salones.datos.ConectorLourdes;
import Salones.modelo.Catalogo_Evento;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author LouFlores
 */
public class frmCatalogo_Evento extends javax.swing.JFrame {

    private TableModel ModeloTabla;
     Catalogo_EventosControlador carrcontrol = new Catalogo_EventosControlador();
  public int codigo;

    /**
     * Creates new form frm_Carrera
     */
    public frmCatalogo_Evento() {
        initComponents();
        
      
 
 
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnRefrescar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnModificar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrera = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setText("Codigo:");

        btnRefrescar.setText("Buscar");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Catálogo de Eventos");

        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        tblCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarreraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarrera);

        btnBuscar1.setText("Refrescar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
        frmIngresar_Evento ingresar = new frmIngresar_Evento();
        ingresar.setVisible(true);
 
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
      frmModificar_Evento modificar = new frmModificar_Evento();
     

   
          
        
        // PASA LOS DATOS DEL JTABLE AL JTEXTFIELD DEL FORM FRM_MOFICIAR_CARRERA
        
     if (tblCarrera.getSelectedRowCount()>0){
   modificar.txtCodigo.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 0).toString());
   modificar.txtNombre.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 1).toString());
   modificar.cbxTipocarrera.setSelectedItem(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 2).toString());
      
      modificar.txtEstado.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 3).toString());
       
         modificar.setVisible(true);
     } else{
         JOptionPane.showMessageDialog(null,
        "Debe seleccionar una fila de la tabla" ); 
     }                                         

    






    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    
        
     
     
    }//GEN-LAST:event_formWindowActivated

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
  Catalogo_EventosControlador car = new Catalogo_EventosControlador();
  car.buscarCarrera(this.txtCodigo.getText());
  buscar();
      
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
     frmEliminar_Evento eliminar = new frmEliminar_Evento();
        if (tblCarrera.getSelectedRowCount()>0){
   eliminar.txtCodigo.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 0).toString());
   eliminar.txtNombre.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 1).toString());
eliminar.setVisible(true);
     } else{
         JOptionPane.showMessageDialog(null,
        "Debe seleccionar una fila de la tabla" ); 
     }                                         
       
     
       
       
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
     Mostrar();

    }//GEN-LAST:event_formWindowGainedFocus

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
Mostrar();          
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void tblCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarreraMouseClicked
       
    }//GEN-LAST:event_tblCarreraMouseClicked
public void buscar() {
       //definir nombres de columna
        Object [] cols = { "codigo", "Nombre Evento", "Tipo Evento", "Duracion"};
        //crear arrayList
      ArrayList<Catalogo_Evento> miLista = new ArrayList<Catalogo_Evento>();
      Catalogo_EventosControlador control = new Catalogo_EventosControlador();
      miLista = control.buscarCarrera(txtCodigo.getText());
      tblCarrera.getModel();
      //creamos Object para agregar las filas de datos 
      Object[][] data = new Object[miLista.size()][cols.length];
        int rowCount = 0;
        for(Catalogo_Evento c : miLista){
            data[rowCount][0] = c.getCodigo();
            data[rowCount][1] = c.getNombre_evento();
            data[rowCount][2] = c.getCodigo_tipo_evento();
            data[rowCount][3] = c.getDuracion();
           
            rowCount++;
        }
        DefaultTableModel model = new DefaultTableModel(data, cols);
        tblCarrera.setModel(model);
        
        model.addTableModelListener(new TableModelListener() {
         @Override
         public void tableChanged(TableModelEvent e) {
             System.out.println(tblCarrera.getModel().getValueAt(tblCarrera.getSelectedRow(), 0));
         }
     });
    
    }

public void Mostrar(){
    Object [] cols = { "codigo", "Nombre Evento", "Tipo Evento", "Duracion"};
        //crear arrayList
      ArrayList<Catalogo_Evento> miLista = new ArrayList<Catalogo_Evento>();
      Catalogo_EventosControlador control = new Catalogo_EventosControlador();
      miLista = control.ConsultarCarrera();
      tblCarrera.getModel();
      //creamos Object para agregar las filas de datos 
      Object[][] data = new Object[miLista.size()][cols.length];
        int rowCount = 0;
        for(Catalogo_Evento c : miLista){
            data[rowCount][0] = c.getCodigo();
            data[rowCount][1] = c.getNombre_evento();
            data[rowCount][2] = c.getCodigo_tipo_evento();
            data[rowCount][3] = c.getDuracion();
           
            rowCount++;
        }
        DefaultTableModel model = new DefaultTableModel(data, cols);
        tblCarrera.setModel(model);
        
        model.addTableModelListener(new TableModelListener() {
         @Override
         public void tableChanged(TableModelEvent e) {
             System.out.println(tblCarrera.getModel().getValueAt(tblCarrera.getSelectedRow(), 0));
         }
     });
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCatalogo_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCatalogo_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCatalogo_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCatalogo_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCatalogo_Evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCarrera;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
