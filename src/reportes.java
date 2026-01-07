import java.text.MessageFormat;
import javax.swing.JTable;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;

public class reportes extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(reportes.class.getName());
    
    public void agregarRegistroTabla(String laboratorio, String sede, String facultad, 
                                 String curso, String fecha, String horaInicio, 
                                 String horaFin, String docente) {
    
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblReporte.getModel();
    modelo.setRowCount(0); // Limpiar tabla
    
    String horario = horaInicio + " - " + horaFin;
    String cursoCompleto = curso + " (" + facultad + ")"; 

    modelo.addRow(new Object[]{
        laboratorio,    
        fecha,          
        horario,        
        cursoCompleto,  
        docente,        
        sede            
    });
    
    btnImprimir.setEnabled(true);

    // --- NUEVO: AJUSTE DE ESPACIO VISUAL ---
    
    // 1. Darle más altura a las filas para que el texto respire
    tblReporte.setRowHeight(30);
    
    // 2. Definir anchos específicos para cada columna (Índices 0 a 5)
    // El total depende del ancho de tu tabla, ajusta estos números si es necesario
    tblReporte.getColumnModel().getColumn(0).setPreferredWidth(50);  // Lab (pequeño)
    tblReporte.getColumnModel().getColumn(1).setPreferredWidth(80);  // Fecha
    tblReporte.getColumnModel().getColumn(2).setPreferredWidth(110); // Hora
    tblReporte.getColumnModel().getColumn(3).setPreferredWidth(300); // Curso (MUY ANCHO para que quepa todo)
    tblReporte.getColumnModel().getColumn(4).setPreferredWidth(200); // Docente (ANCHO)
    tblReporte.getColumnModel().getColumn(5).setPreferredWidth(100); // Sede
}

     
    public reportes() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        txtfondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setText("REPORTE GENERADO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 410, 60));

        tblReporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "LAB", "FECHA", "HORA INICIO - FIN", "CURSO / MATERIA", "DOCENTE A CARGO", "SEDE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReporte);
        if (tblReporte.getColumnModel().getColumnCount() > 0) {
            tblReporte.getColumnModel().getColumn(0).setMinWidth(55);
            tblReporte.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblReporte.getColumnModel().getColumn(0).setMaxWidth(65);
            tblReporte.getColumnModel().getColumn(1).setMinWidth(79);
            tblReporte.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblReporte.getColumnModel().getColumn(1).setMaxWidth(81);
            tblReporte.getColumnModel().getColumn(2).setMinWidth(119);
            tblReporte.getColumnModel().getColumn(2).setPreferredWidth(120);
            tblReporte.getColumnModel().getColumn(2).setMaxWidth(121);
            tblReporte.getColumnModel().getColumn(3).setMinWidth(349);
            tblReporte.getColumnModel().getColumn(3).setPreferredWidth(350);
            tblReporte.getColumnModel().getColumn(3).setMaxWidth(351);
            tblReporte.getColumnModel().getColumn(4).setMinWidth(199);
            tblReporte.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblReporte.getColumnModel().getColumn(4).setMaxWidth(201);
            tblReporte.getColumnModel().getColumn(5).setMinWidth(99);
            tblReporte.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblReporte.getColumnModel().getColumn(5).setMaxWidth(101);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 880, 210));

        btnRegresar.setBackground(new java.awt.Color(102, 153, 255));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 140, 40));

        btnImprimir.setBackground(new java.awt.Color(102, 153, 255));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 140, 40));

        txtfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.png"))); // NOI18N
        getContentPane().add(txtfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        //permite que el boton regresar, regrese a modulo de roles
        MODULO newframe= new MODULO();

        newframe.setVisible(true);
        //this evita que las ventanas se acumulen
        this.dispose();
        //this evitar que las ventanas se acumulen
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
      try {
        // 1. Definir encabezado y pie de página
        MessageFormat header = new MessageFormat("Reporte de Laboratorio - SISLAB");
        MessageFormat footer = new MessageFormat("Página {0,number,integer}");

        // 2. Configuración para HORIZONTAL (Landscape)
        PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
        set.add(OrientationRequested.LANDSCAPE); 
        // Si quieres márgenes, puedes agregar: set.add(new MediaPrintableArea(10, 10, 190, 270, MediaPrintableArea.MM));

        // 3. Imprimir usando FIT_WIDTH (Ajustar al ancho)
        // Esto hace que la tabla se "encoja" o "estire" proporcionalmente para caber en la hoja horizontal
        boolean completo = tblReporte.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
        
        
        if (completo) {
            javax.swing.JOptionPane.showMessageDialog(this, "¡Impresión exitosa!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Impresión cancelada.");
        }
    } catch (java.awt.print.PrinterException pe) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al imprimir: " + pe.getMessage());
    }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new reportes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReporte;
    private javax.swing.JLabel txtfondo;
    // End of variables declaration//GEN-END:variables
}
