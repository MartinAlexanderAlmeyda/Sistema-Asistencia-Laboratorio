
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import javax.swing.table.DefaultTableModel;


public class Reporte_Alumnos extends javax.swing.JFrame {
    // EN REPORTES.JAVA
public void recibirListaAlumnos(javax.swing.table.DefaultTableModel modeloOrigen) {
    DefaultTableModel modeloReporte = (DefaultTableModel) tblReporte.getModel(); // Tu tabla del reporte final
    modeloReporte.setRowCount(0); // Limpiar
    
    // Recorremos el modelo que nos llega de la ventana anterior
    for (int i = 0; i < modeloOrigen.getRowCount(); i++) {
        Object numero = modeloOrigen.getValueAt(i, 0);
        Object apellidos = modeloOrigen.getValueAt(i, 1);
        Object nombres = modeloOrigen.getValueAt(i, 2);
        Boolean asistencia = (Boolean) modeloOrigen.getValueAt(i, 3);
        
        // Aquí decides cómo mostrarlo en el reporte. 
        // Si quieres que salga igual con check, pasas el Boolean.
        // Si quieres que diga "ASISTIÓ" o "FALTA", usas un if:
        String estado = asistencia ? "ASISTIÓ" : "FALTA"; 
        
        modeloReporte.addRow(new Object[]{ numero, apellidos, nombres, estado });
    }
}

    public Reporte_Alumnos() {
        initComponents();
        setLocationRelativeTo(null);  
    // Centramos la ventana (opcional pero se ve bien)
    this.setLocationRelativeTo(null);

    // OBLIGAMOS a las cajas de texto a tener fondo INVISIBLE.
    // El cuarto número '0' en Color(0,0,0,0) es la clave de la transparencia.
    
    // Datos de cabecera
    txtFacultad.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtProgramaAcademico.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtCurso.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtSeccion.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtDocente.setBackground(new java.awt.Color(0, 0, 0, 0));
    
    // Datos del medio
    txtNPractica.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtTitulo.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtCiclo.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtLaboratorio.setBackground(new java.awt.Color(0, 0, 0, 0));
    
    // Datos de fecha/hora
    txtFecha.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtHoraInicio.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtHoraFin.setBackground(new java.awt.Color(0, 0, 0, 0));

    }
// --- MÉTODO EN Reporte_Alumnos.java PARA RECIBIR LA IMAGEN ---
    public void setFirmaDocente(java.awt.Image imagenRecibida) {
        if (imagenRecibida != null && lblFirmaImagen != null) {
            // 1. Obtener el tamaño del label destino
            int ancho = lblFirmaImagen.getWidth();
            int alto = lblFirmaImagen.getHeight();
            
            // (Seguro por si el label aún no tiene tamaño al iniciarse)
            if (ancho == 0 || alto == 0) { ancho = 200; alto = 100; }

            // 2. Redimensionar la imagen recibida para que quepa exactamente en el label
            java.awt.Image imagenEscalada = imagenRecibida.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH);
            
            // 3. Convertir a icono y ponerlo en el label
            javax.swing.ImageIcon icono = new javax.swing.ImageIcon(imagenEscalada);
            lblFirmaImagen.setIcon(icono);
            lblFirmaImagen.setText(""); // Asegurar que no haya texto
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        Fondo2 = new javax.swing.JScrollPane();
        panelReporteCompleto = new javax.swing.JPanel();
        txtfondo2 = new javax.swing.JPanel();
        txtFcu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        txtHoraFin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtProgramaAcademico = new javax.swing.JTextField();
        txtDocente = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtNPractica = new javax.swing.JTextField();
        txtFacultad = new javax.swing.JTextField();
        txtCiclo = new javax.swing.JTextField();
        txtSeccion = new javax.swing.JTextField();
        txtLaboratorio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        FirmaDocente = new javax.swing.JLabel();
        lblFirmaImagen = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField5.setText("jTextField1");

        jTextField8.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo2.setBackground(new java.awt.Color(111, 172, 192));
        Fondo2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE DE ASISTENCIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 36))); // NOI18N
        Fondo2.setForeground(new java.awt.Color(111, 172, 192));

        txtfondo2.setBackground(new java.awt.Color(255, 255, 255));
        txtfondo2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Swis721 Lt BT", 1, 18))); // NOI18N

        txtFcu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFcu.setText("FACULTAD:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DOCENTE:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TITULO DE LA PRÁCTICA:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("PROGRAMA ACADEMICO:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("FECHA DE PRACTICA:");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFecha.setBorder(null);
        txtFecha.setEnabled(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("CICLO:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("CURSO:");

        txtCurso.setEditable(false);
        txtCurso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCurso.setBorder(null);
        txtCurso.setEnabled(false);
        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("SECCIÓN:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("N° PRACTICA:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("HORA INICIO:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("HORA FIN:");

        txtHoraInicio.setEditable(false);
        txtHoraInicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtHoraInicio.setBorder(null);
        txtHoraInicio.setEnabled(false);
        txtHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraInicioActionPerformed(evt);
            }
        });

        txtHoraFin.setEditable(false);
        txtHoraFin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtHoraFin.setBorder(null);
        txtHoraFin.setEnabled(false);
        txtHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFinActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("LABORATORIO  TALLER SOLICITADO:");

        txtProgramaAcademico.setEditable(false);
        txtProgramaAcademico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtProgramaAcademico.setBorder(null);
        txtProgramaAcademico.setEnabled(false);

        txtDocente.setEditable(false);
        txtDocente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDocente.setBorder(null);
        txtDocente.setEnabled(false);
        txtDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocenteActionPerformed(evt);
            }
        });

        txtTitulo.setEditable(false);
        txtTitulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTitulo.setBorder(null);
        txtTitulo.setEnabled(false);

        txtNPractica.setEditable(false);
        txtNPractica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNPractica.setBorder(null);
        txtNPractica.setEnabled(false);

        txtFacultad.setEditable(false);
        txtFacultad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFacultad.setForeground(new java.awt.Color(255, 255, 255));
        txtFacultad.setBorder(null);
        txtFacultad.setEnabled(false);
        txtFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultadActionPerformed(evt);
            }
        });

        txtCiclo.setEditable(false);
        txtCiclo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCiclo.setBorder(null);
        txtCiclo.setEnabled(false);

        txtSeccion.setEditable(false);
        txtSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtSeccion.setBorder(null);
        txtSeccion.setEnabled(false);

        txtLaboratorio.setEditable(false);
        txtLaboratorio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtLaboratorio.setBorder(null);
        txtLaboratorio.setEnabled(false);

        jScrollPane1.setBorder(null);

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Apellidos", "Nombres", "Asistencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblReporte.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblReporte.setAutoscrolls(false);
        tblReporte.setEnabled(false);
        tblReporte.setFillsViewportHeight(true);
        tblReporte.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblReporteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblReporte);
        if (tblReporte.getColumnModel().getColumnCount() > 0) {
            tblReporte.getColumnModel().getColumn(0).setMinWidth(60);
            tblReporte.getColumnModel().getColumn(0).setPreferredWidth(65);
            tblReporte.getColumnModel().getColumn(0).setMaxWidth(70);
            tblReporte.getColumnModel().getColumn(1).setMinWidth(200);
            tblReporte.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblReporte.getColumnModel().getColumn(1).setMaxWidth(220);
            tblReporte.getColumnModel().getColumn(2).setMinWidth(150);
            tblReporte.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblReporte.getColumnModel().getColumn(2).setMaxWidth(170);
            tblReporte.getColumnModel().getColumn(3).setMinWidth(90);
            tblReporte.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblReporte.getColumnModel().getColumn(3).setMaxWidth(110);
        }

        FirmaDocente.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        FirmaDocente.setText("FIRMA DOCENTE");

        lblFirmaImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout txtfondo2Layout = new javax.swing.GroupLayout(txtfondo2);
        txtfondo2.setLayout(txtfondo2Layout);
        txtfondo2Layout.setHorizontalGroup(
            txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtfondo2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtfondo2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtProgramaAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtfondo2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSeccion)
                                .addGap(124, 124, 124))
                            .addGroup(txtfondo2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(txtfondo2Layout.createSequentialGroup()
                        .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtfondo2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtfondo2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtfondo2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9)
                                .addGap(17, 17, 17)
                                .addComponent(txtNPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtfondo2Layout.createSequentialGroup()
                                .addComponent(txtFcu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 40, Short.MAX_VALUE))))
            .addGroup(txtfondo2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel12)
                .addGap(20, 20, 20)
                .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(txtfondo2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txtfondo2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtfondo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFirmaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirmaDocente))
                .addGap(147, 147, 147))
        );
        txtfondo2Layout.setVerticalGroup(
            txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtfondo2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFcu)
                    .addComponent(jLabel6)
                    .addComponent(txtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProgramaAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNPractica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(txtfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(34, 34, 34)
                .addComponent(lblFirmaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirmaDocente)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelReporteCompletoLayout = new javax.swing.GroupLayout(panelReporteCompleto);
        panelReporteCompleto.setLayout(panelReporteCompletoLayout);
        panelReporteCompletoLayout.setHorizontalGroup(
            panelReporteCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReporteCompletoLayout.createSequentialGroup()
                .addComponent(txtfondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelReporteCompletoLayout.setVerticalGroup(
            panelReporteCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReporteCompletoLayout.createSequentialGroup()
                .addComponent(txtfondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        Fondo2.setViewportView(panelReporteCompleto);

        getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 770, 310));

        btnImprimir.setBackground(new java.awt.Color(51, 102, 255));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 110, 40));

        btnVolverInicio.setBackground(new java.awt.Color(51, 102, 255));
        btnVolverInicio.setText("NUEVO REGISTRO");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_uai123456789.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraInicioActionPerformed

    private void txtHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraFinActionPerformed

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void tblReporteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblReporteAncestorAdded

    }//GEN-LAST:event_tblReporteAncestorAdded

    private void txtFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultadActionPerformed

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed

    REGISTRAR_PRACTICA nuevaVentana = new REGISTRAR_PRACTICA(); 
    nuevaVentana.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
    
        // ... (resto del código del botón: if (job.printDialog()) ...) ...
    try {
        // 1. FORZAR LÍNEAS NEGRAS EN LA TABLA
        tblReporte.setShowGrid(true);
        tblReporte.setGridColor(java.awt.Color.BLACK);
        
        tblReporte.getTableHeader().setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 12));

        // 2. PREPARAR LA IMPRESIÓN DEL PANEL COMPLETO
        java.awt.print.PrinterJob job = java.awt.print.PrinterJob.getPrinterJob();
        job.setJobName("Reporte Académico");
        
        final javax.swing.JPanel panelAImprimir = panelReporteCompleto; 

         // --- CÓDIGO DE IMPRESIÓN ROBUSTO (COMO IMAGEN DE ALTA RESOLUCIÓN) ---
        job.setPrintable(new java.awt.print.Printable() {
            @Override
            public int print(java.awt.Graphics graphics, java.awt.print.PageFormat pageFormat, int pageIndex) throws java.awt.print.PrinterException {
                if (pageIndex > 0) return NO_SUCH_PAGE;

                java.awt.Graphics2D g2dPrinter = (java.awt.Graphics2D) graphics;

                // 1. CONFIGURACIÓN DE ALTA RESOLUCIÓN
                // Factor de escala: 2.0 o 3.0 para que se vea nítido al imprimir.
                // Si pones 1.0 se verá borroso. Probemos con 2.5 para buena calidad.
                double escalaAltaResolucion = 2.5;

                int anchoPanel = panelAImprimir.getWidth();
                int altoPanel = panelAImprimir.getHeight();

                // 2. CREAR UNA IMAGEN GIGANTE EN MEMORIA
                // Creamos un "lienzo" en memoria que es 2.5 veces más grande que el panel real.
                java.awt.image.BufferedImage imagenAltaRes = new java.awt.image.BufferedImage(
                        (int)(anchoPanel * escalaAltaResolucion), 
                        (int)(altoPanel * escalaAltaResolucion), 
                        java.awt.image.BufferedImage.TYPE_INT_ARGB);

                // 3. PREPARAR EL PINCEL PARA LA IMAGEN
                java.awt.Graphics2D g2dImage = imagenAltaRes.createGraphics();
                
                // Configuraciones para que el dibujo en la imagen sea perfecto
                g2dImage.setRenderingHint(java.awt.RenderingHints.KEY_TEXT_ANTIALIASING, java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2dImage.setRenderingHint(java.awt.RenderingHints.KEY_RENDERING, java.awt.RenderingHints.VALUE_RENDER_QUALITY);
                g2dImage.setRenderingHint(java.awt.RenderingHints.KEY_FRACTIONALMETRICS, java.awt.RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                
                // ¡EL TRUCO! Escalamos el pincel. Todo lo que dibuje el panel será gigante.
                g2dImage.scale(escalaAltaResolucion, escalaAltaResolucion);

                // --- FONDO BLANCO (Tu truco para asegurar fondo limpio) ---
                g2dImage.setColor(java.awt.Color.WHITE);
                g2dImage.fillRect(-50, -50, anchoPanel + 100, altoPanel + 100);
                // ---------------------------------------------------------

                // 4. ¡FOTO! EL PANEL SE DIBUJA EN LA IMAGEN DE ALTA RES
                // El panel piensa que dibuja en pantalla, pero dibuja en nuestra imagen gigante.
                panelAImprimir.printAll(g2dImage);
                g2dImage.dispose(); // Liberamos el pincel de la imagen


                // 5. ENVIAR LA IMAGEN A LA IMPRESORA
                // Ahora toca poner esa imagen gigante en la hoja de papel.
                g2dPrinter.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                double anchoPaginaUtil = pageFormat.getImageableWidth();
                double altoPaginaUtil = pageFormat.getImageableHeight();

                // Calculamos cuánto tenemos que reducir la imagen gigante para que quepa en la hoja
                double escalaAncho = anchoPaginaUtil / imagenAltaRes.getWidth();
                double escalaAlto = altoPaginaUtil / imagenAltaRes.getHeight();
                // Usamos la escala menor para que no se salga por ningún lado y mantenga proporción
                double escalaFinalImpresion = Math.min(escalaAncho, escalaAlto);

                // Aplicamos la escala a la impresora y dibujamos la imagen
                g2dPrinter.scale(escalaFinalImpresion, escalaFinalImpresion);
                g2dPrinter.drawImage(imagenAltaRes, 0, 0, null);

                return PAGE_EXISTS;
            }
        });

        if (job.printDialog()) {
            job.print();
            javax.swing.JOptionPane.showMessageDialog(this, "Impresión enviada.");
        }

    } catch (Exception e) {
         javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e);
    }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocenteActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_Alumnos().setVisible(true);
            }
        });

 }
    public void cargarDatosReporte(int idPractica) {
        try {
            MODULOSTAREAMODELAMIENTO.CConexion objetoConexion = new MODULOSTAREAMODELAMIENTO.CConexion();
            java.sql.Connection cn = objetoConexion.establecerConexion();
            
            // 1. LLENAR DATOS DE LA CABECERA
            String sql1 = "SELECT * FROM practicas_laboratorio WHERE id_practica = ?";
            java.sql.PreparedStatement pst1 = cn.prepareStatement(sql1);
            pst1.setInt(1, idPractica);
            java.sql.ResultSet rs1 = pst1.executeQuery();
            
            if (rs1.next()) {
          
                txtProgramaAcademico.setText(rs1.getString("Programa"));
                txtFecha.setText(rs1.getString("fecha"));
                txtHoraInicio.setText(rs1.getString("hora_inicio"));
                txtHoraFin.setText(rs1.getString("hora_fin"));
                txtCurso.setText(rs1.getString("curso"));
                txtFacultad.setText(rs1.getString("facultad"));
                txtDocente.setText(rs1.getString("docente"));
                txtTitulo.setText(rs1.getString("titulo_practica"));
                txtCiclo.setText(rs1.getString("ciclo"));
                txtSeccion.setText(rs1.getString("seccion"));
                txtNPractica.setText(rs1.getString("num_practica"));
                txtLaboratorio.setText(rs1.getString("laboratorio"));
                
            }
            
            
            String sql2 = "SELECT nombre_alumno, apellido_alumno, estado_asistencia FROM detalle_asistencia WHERE id_practica = ?";
            java.sql.PreparedStatement pst2 = cn.prepareStatement(sql2);
            pst2.setInt(1, idPractica);
            java.sql.ResultSet rs2 = pst2.executeQuery();
            
           
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblReporte.getModel();
            modelo.setRowCount(0); 
            
          
            int contador = 1;
            
            while (rs2.next()) {
                
                String apellido = rs2.getString("apellido_alumno");
                String nombre = rs2.getString("nombre_alumno");
                String estado = rs2.getString("estado_asistencia");
                
                
                boolean asistenciaBool = estado.equalsIgnoreCase("Presente");
              
                modelo.addRow(new Object[]{
                    contador,       
                    apellido,      
                    nombre,         
                    asistenciaBool  
                });
                
                contador++; 
            }
            
        } catch (Exception e) {
            System.out.println("Error al generar reporte: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirmaDocente;
    private javax.swing.JScrollPane Fondo2;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblFirmaImagen;
    private javax.swing.JPanel panelReporteCompleto;
    private javax.swing.JTable tblReporte;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDocente;
    private javax.swing.JTextField txtFacultad;
    private javax.swing.JLabel txtFcu;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtNPractica;
    private javax.swing.JTextField txtProgramaAcademico;
    private javax.swing.JTextField txtSeccion;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JPanel txtfondo2;
    // End of variables declaration//GEN-END:variables

}
