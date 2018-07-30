package Salones.vista;

import Salones.controlador.SalonControlador;
import Salones.modelo.Salon;
import javax.swing.SpinnerNumberModel;

public class frm_ModificarSalon extends javax.swing.JFrame {

    public frm_ModificarSalon() {
        initComponents();
    }

    SalonControlador sc = new SalonControlador();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgInstructor = new javax.swing.ButtonGroup();
        btgProyector = new javax.swing.ButtonGroup();
        btgPizarron = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdbPcIns1 = new javax.swing.JRadioButton();
        rdbPcIns0 = new javax.swing.JRadioButton();
        rdbProyector1 = new javax.swing.JRadioButton();
        rdbProyector0 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rdbPizarron1 = new javax.swing.JRadioButton();
        rdbPizarron0 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        spnPcParticipantes = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Salon"));

        jLabel6.setText("Codigo:");

        txtCodigo.setEditable(false);

        jLabel2.setText(" Nombre:");

        txtNombre.setText(" ");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Capacidad:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre)
                    .addComponent(txtCapacidad))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipamiento de Salones"));
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N

        jLabel7.setText("PC Instructor:");

        jLabel8.setText("Proyector:");

        btgInstructor.add(rdbPcIns1);
        rdbPcIns1.setText("Si");

        btgInstructor.add(rdbPcIns0);
        rdbPcIns0.setText("No");

        btgProyector.add(rdbProyector1);
        rdbProyector1.setText("Si");

        btgProyector.add(rdbProyector0);
        rdbProyector0.setText("No");

        jLabel9.setText("Pizarron:");

        btgPizarron.add(rdbPizarron1);
        rdbPizarron1.setText("Si");

        btgPizarron.add(rdbPizarron0);
        rdbPizarron0.setText("No");

        jLabel10.setText("PC Participantes:");

        jLabel11.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbPcIns1)
                        .addGap(7, 7, 7)
                        .addComponent(rdbPcIns0)
                        .addGap(31, 31, 31)
                        .addComponent(rdbProyector1)
                        .addGap(7, 7, 7)
                        .addComponent(rdbProyector0))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbPizarron1)
                        .addGap(7, 7, 7)
                        .addComponent(rdbPizarron0)
                        .addGap(31, 31, 31)
                        .addComponent(spnPcParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbPcIns1)
                    .addComponent(rdbPcIns0)
                    .addComponent(rdbProyector1)
                    .addComponent(rdbProyector0))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbPizarron1)
                    .addComponent(rdbPizarron0)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(spnPcParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICACIÓN DE SALONES");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Botones"));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(38, 38, 38)
                .addComponent(txtLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(txtLimpiar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Salon salon = new Salon();
        salon.setCodigo(Integer.parseInt(txtCodigo.getText()));
        salon.setNombre_salon(txtNombre.getText());
        salon.setCapacidad_salon(Integer.parseInt(txtCapacidad.getText()));
        if (rdbPcIns1.isSelected()==true){
            salon.setPc_instructor(1);
        } else if (rdbPcIns0.isSelected()==true){
            salon.setPc_instructor(0);
        }
        if (rdbPizarron1.isSelected()==true){
            salon.setPizarron(1);
        } else if (rdbPizarron0.isSelected()==true){
            salon.setPizarron(0);
        }
        if (rdbProyector1.isSelected()==true){
            salon.setProyector(1);
        } else if (rdbProyector0.isSelected()==true){
            salon.setProyector(0);
        }
        salon.setPc_participantes(spnPcParticipantes.getValue().toString());
        salon.setObservaciones(txtObservaciones.getText());
        sc.modificarSalon(salon);
        dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
        txtCapacidad.setText("");
        txtNombre.setText("");
        txtObservaciones.setText("");
        spnPcParticipantes.setValue(0);
    }//GEN-LAST:event_txtLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ModificarSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ModificarSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ModificarSalon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgInstructor;
    private javax.swing.ButtonGroup btgPizarron;
    private javax.swing.ButtonGroup btgProyector;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbPcIns0;
    private javax.swing.JRadioButton rdbPcIns1;
    private javax.swing.JRadioButton rdbPizarron0;
    private javax.swing.JRadioButton rdbPizarron1;
    private javax.swing.JRadioButton rdbProyector0;
    private javax.swing.JRadioButton rdbProyector1;
    private javax.swing.JSpinner spnPcParticipantes;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(String dato) {
        this.txtCodigo.setText(dato);
    }

    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String dato) {
        this.txtNombre.setText(dato);
    }

    public javax.swing.JTextField getTxtCapacidad() {
        return txtCapacidad;
    }

    public void setTxtCapacidad(String dato) {
        this.txtCapacidad.setText(dato);
    }

    public javax.swing.JRadioButton getRdbPcIns1() {
        return rdbPcIns1;
    }

    public void setrdbPcIns1() {
        this.rdbPcIns1.setSelected(true);
    }
    
    public javax.swing.JRadioButton getRdbPcIns0() {
        return rdbPcIns0;
    }

    public void setrdbPcIns0() {
        this.rdbPcIns0.setSelected(true);
    }
    
    public javax.swing.JRadioButton getPizarron0() {
        return rdbPizarron0;
    }

    public void setrdbPizarron0() {
        this.rdbPizarron0.setSelected(true);
    }
    
    public javax.swing.JRadioButton getPizarron1() {
        return rdbPizarron1;
    }

    public void setrdbPizarron1() {
        this.rdbPizarron1.setSelected(true);
    }
    
    public javax.swing.JRadioButton getProyector0() {
        return rdbProyector0;
    }

    public void setrdbProyector0() {
        this.rdbProyector0.setSelected(true);
    }
    
    public javax.swing.JRadioButton getProyector1() {
        return rdbProyector1;
    }

    public void setrdbProyector1() {
        this.rdbProyector1.setSelected(true);
    }
    
    public javax.swing.JSpinner getPcParticipantes() {
        return spnPcParticipantes;
    }

    public void setspnPcParticipantes(int dato) {
        SpinnerNumberModel snm = new SpinnerNumberModel();
        spnPcParticipantes.setValue(dato);
        
    }
    
    public javax.swing.JTextArea getTxtObservaciones() {
        return txtObservaciones;
    }

    public void setTxtObservaciones(String dato) {
        this.txtObservaciones.setText(dato);
    }
}