
import java.text.SimpleDateFormat;
import java.util.Date;


public class MODULO extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MODULO.class.getName());

    /**
     * Creates new form MODULO
     */
    public MODULO() {
        initComponents();
         setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TXTMODULO = new javax.swing.JLabel();
        TXTLABORATORIO = new javax.swing.JLabel();
        TXTFACULTAD = new javax.swing.JLabel();
        txtcurso = new javax.swing.JLabel();
        CURSO = new javax.swing.JComboBox<>();
        FACULTAD = new javax.swing.JComboBox<>();
        txtlaboratorio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TXTFECHA = new javax.swing.JTextField();
        TXTHORAINICIO = new javax.swing.JLabel();
        TXTHORAFIN = new javax.swing.JLabel();
        txthorainicio = new javax.swing.JTextField();
        txthorafin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXTDOCENTE = new javax.swing.JTextField();
        BTNREGRESAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TXTSEDES = new javax.swing.JComboBox<>();
        BNTVALIDA = new javax.swing.JButton();
        BTNREPORTE = new javax.swing.JButton();
        btnHoraIni = new javax.swing.JButton();
        btnHoraFin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTMODULO.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TXTMODULO.setForeground(new java.awt.Color(255, 255, 255));
        TXTMODULO.setText("MÓDULO DE REPORTE");
        getContentPane().add(TXTMODULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        TXTLABORATORIO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTLABORATORIO.setForeground(new java.awt.Color(255, 255, 255));
        TXTLABORATORIO.setText("SELECCIONE LABORATORIO");
        getContentPane().add(TXTLABORATORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        TXTFACULTAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTFACULTAD.setForeground(new java.awt.Color(255, 255, 255));
        TXTFACULTAD.setText("SELECCIONE FACULTAD");
        getContentPane().add(TXTFACULTAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        txtcurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcurso.setForeground(new java.awt.Color(255, 255, 255));
        txtcurso.setText("SELECCIONE CURSO");
        getContentPane().add(txtcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        CURSO.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CURSO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taller De Programación I", "Informatica Para La Toma de Desiciones", "Actividades De Proyección Social II", "Modelamiento De Datos", "Quimica", "Estaditica-Probabilidades", " ", " ", " " }));
        CURSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CURSOActionPerformed(evt);
            }
        });
        getContentPane().add(CURSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 210, 30));

        FACULTAD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FACULTAD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria De Sistemas", "Ingenieria Industrial", "Derecho", "Administración" }));
        FACULTAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FACULTADActionPerformed(evt);
            }
        });
        getContentPane().add(FACULTAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 230, 30));

        txtlaboratorio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtlaboratorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "402-D", "202-D", "305-D", "602-D" }));
        txtlaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlaboratorioActionPerformed(evt);
            }
        });
        getContentPane().add(txtlaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        TXTFECHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFECHAActionPerformed(evt);
            }
        });
        getContentPane().add(TXTFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, 30));

        TXTHORAINICIO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTHORAINICIO.setForeground(new java.awt.Color(255, 255, 255));
        TXTHORAINICIO.setText("HORA INICIO");
        getContentPane().add(TXTHORAINICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        TXTHORAFIN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTHORAFIN.setForeground(new java.awt.Color(255, 255, 255));
        TXTHORAFIN.setText("HORA FIN");
        getContentPane().add(TXTHORAFIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        txthorainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthorainicioActionPerformed(evt);
            }
        });
        getContentPane().add(txthorainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 110, 30));

        txthorafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthorafinActionPerformed(evt);
            }
        });
        getContentPane().add(txthorafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DOCENTE A CARGO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, -1));

        TXTDOCENTE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TXTDOCENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDOCENTEActionPerformed(evt);
            }
        });
        getContentPane().add(TXTDOCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 270, 30));

        BTNREGRESAR.setBackground(new java.awt.Color(51, 204, 255));
        BTNREGRESAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BTNREGRESAR.setForeground(new java.awt.Color(255, 255, 255));
        BTNREGRESAR.setText("REGRESAR");
        BTNREGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNREGRESARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNREGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SEDE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        TXTSEDES.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTSEDES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHINCHA ", "SUNAMPE", "ICA", "HUARAL" }));
        TXTSEDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTSEDESActionPerformed(evt);
            }
        });
        getContentPane().add(TXTSEDES, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 150, -1));

        BNTVALIDA.setBackground(new java.awt.Color(102, 153, 255));
        BNTVALIDA.setForeground(new java.awt.Color(255, 255, 255));
        BNTVALIDA.setText("VALIDA");
        BNTVALIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTVALIDAActionPerformed(evt);
            }
        });
        getContentPane().add(BNTVALIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        BTNREPORTE.setBackground(new java.awt.Color(102, 153, 255));
        BTNREPORTE.setForeground(new java.awt.Color(255, 255, 255));
        BTNREPORTE.setText("GENERAR REPORTE");
        BTNREPORTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNREPORTEActionPerformed(evt);
            }
        });
        getContentPane().add(BTNREPORTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 160, 50));

        btnHoraIni.setBackground(new java.awt.Color(102, 153, 255));
        btnHoraIni.setForeground(new java.awt.Color(255, 255, 255));
        btnHoraIni.setText("Agregar");
        btnHoraIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraIniActionPerformed(evt);
            }
        });
        getContentPane().add(btnHoraIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        btnHoraFin.setBackground(new java.awt.Color(102, 153, 255));
        btnHoraFin.setForeground(new java.awt.Color(255, 255, 255));
        btnHoraFin.setText("Agregar");
        btnHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraFinActionPerformed(evt);
            }
        });
        getContentPane().add(btnHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 900, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CURSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CURSOActionPerformed
        String mensaje= null;
        mensaje = CURSO.getSelectedItem().toString();

    }//GEN-LAST:event_CURSOActionPerformed

    private void FACULTADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FACULTADActionPerformed
        String mensaje= null;
        mensaje = FACULTAD.getSelectedItem().toString();
    }//GEN-LAST:event_FACULTADActionPerformed

    private void txtlaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlaboratorioActionPerformed
        String mensaje= null;
        mensaje = txtlaboratorio.getSelectedItem().toString();

    }//GEN-LAST:event_txtlaboratorioActionPerformed

    private void TXTFECHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFECHAActionPerformed

    }//GEN-LAST:event_TXTFECHAActionPerformed

    private void BTNREGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNREGRESARActionPerformed
        //permite que el boton regresar, regrese a modulo de roles
        MODULO_ROL newframe= new MODULO_ROL();

        newframe.setVisible(true);
        //this evita que las ventanas se acumulen
        this.dispose();
        //this evitar que las ventanas se acumulen

    }//GEN-LAST:event_BTNREGRESARActionPerformed

    private void BNTVALIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTVALIDAActionPerformed

        //formarto para que registre la fecha
        Date sisfecha= new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd-MMM-YYYY");
        //formato para que muestre la fecha en que caja de texto
        TXTFECHA.setText(formato.format(sisfecha));
    }//GEN-LAST:event_BNTVALIDAActionPerformed

    private void BTNREPORTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNREPORTEActionPerformed
        // 1. OBTENER LOS VALORES DE LOS CAMPOS (con los nombres CORRECTOS)

        // De los JComboBox
        String laboratorio = txtlaboratorio.getSelectedItem().toString();
        String facultad = FACULTAD.getSelectedItem().toString();
        String curso = CURSO.getSelectedItem().toString();
        String sede = TXTSEDES.getSelectedItem().toString();

        // De los campos de texto
        String fecha = TXTFECHA.getText();
        String horaInicio = txthorainicio.getText();
        String horaFin = txthorafin.getText();
        String docente = TXTDOCENTE.getText();

        // 2. VALIDAR QUE NO ESTÉN VACÍOS
        if (laboratorio.isEmpty() || facultad.isEmpty() || curso.isEmpty() || sede.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Por favor complete todos los campos obligatorios:\n- Laboratorio\n- Facultad\n- Curso\n- Sede",
                "Campos incompletos",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (fecha.isEmpty() || horaInicio.isEmpty() || horaFin.isEmpty() || docente.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Por favor complete todos los campos de la sesión:\n- Fecha\n- Hora Inicio\n- Hora Fin\n- Docente",
                "Campos incompletos",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 3. CREAR LA VENTANA DE REPORTES
        reportes ventanaReporte = new reportes();

        // 4. AGREGAR LOS DATOS A LA TABLA
        ventanaReporte.agregarRegistroTabla(laboratorio, sede, facultad, curso,
            fecha, horaInicio, horaFin, docente);

        // 5. CENTRAR LA VENTANA
        ventanaReporte.setLocationRelativeTo(null);

        // 6. MOSTRAR LA VENTANA
        ventanaReporte.setVisible(true);

        // 7. CERRAR LA VENTANA ACTUAL
        this.dispose();
    }//GEN-LAST:event_BTNREPORTEActionPerformed

    private void btnHoraIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraIniActionPerformed
        txthorainicio.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));

    }//GEN-LAST:event_btnHoraIniActionPerformed

    private void btnHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraFinActionPerformed
        txthorafin.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }//GEN-LAST:event_btnHoraFinActionPerformed

    private void txthorainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthorainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthorainicioActionPerformed

    private void txthorafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthorafinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthorafinActionPerformed

    private void TXTDOCENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDOCENTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDOCENTEActionPerformed

    private void TXTSEDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTSEDESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTSEDESActionPerformed

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MODULO().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNTVALIDA;
    private javax.swing.JButton BTNREGRESAR;
    private javax.swing.JButton BTNREPORTE;
    private javax.swing.JComboBox<String> CURSO;
    private javax.swing.JComboBox<String> FACULTAD;
    private javax.swing.JTextField TXTDOCENTE;
    private javax.swing.JLabel TXTFACULTAD;
    private javax.swing.JTextField TXTFECHA;
    private javax.swing.JLabel TXTHORAFIN;
    private javax.swing.JLabel TXTHORAINICIO;
    private javax.swing.JLabel TXTLABORATORIO;
    private javax.swing.JLabel TXTMODULO;
    private javax.swing.JComboBox<String> TXTSEDES;
    private javax.swing.JButton btnHoraFin;
    private javax.swing.JButton btnHoraIni;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtcurso;
    private javax.swing.JTextField txthorafin;
    private javax.swing.JTextField txthorainicio;
    private javax.swing.JComboBox<String> txtlaboratorio;
    // End of variables declaration//GEN-END:variables
}
