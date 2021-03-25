package test;

import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class Register_user extends javax.swing.JFrame {

    public Register_user() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("../image/icon.png")).getImage());
        for (int i = 18; i <= 100; i++) {
            combo_edad.addItem(String.valueOf(i));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        field_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        field_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo_edad = new javax.swing.JComboBox<>();
        combo_estado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        field_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        field_direccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        field_nacimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        field_documento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        field_profesion = new javax.swing.JTextField();
        field_trabat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        field_empresa = new javax.swing.JTextField();
        buttom_guardar = new javax.swing.JButton();
        combo_profesion = new javax.swing.JComboBox<>();
        combo_estudio = new javax.swing.JComboBox<>();

        jLabel5.setText("jLabel5");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de personas");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 153, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Nombre:");

        field_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_nombre.setForeground(new java.awt.Color(153, 153, 255));
        field_nombre.setPreferredSize(new java.awt.Dimension(5, 21));
        field_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_nombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Apellido:");

        field_apellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_apellido.setForeground(new java.awt.Color(153, 153, 255));
        field_apellido.setPreferredSize(new java.awt.Dimension(5, 21));
        field_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_apellidoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Edad:");

        combo_edad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo_edad.setForeground(new java.awt.Color(153, 153, 255));
        combo_edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_edad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_edadItemStateChanged(evt);
            }
        });
        combo_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_edadActionPerformed(evt);
            }
        });

        combo_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo_estado.setForeground(new java.awt.Color(153, 153, 255));
        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Soltero", "Casado" }));
        combo_estado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_estadoItemStateChanged(evt);
            }
        });
        combo_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_estadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Telefono:");

        field_telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_telefono.setForeground(new java.awt.Color(153, 153, 255));
        field_telefono.setPreferredSize(new java.awt.Dimension(5, 21));
        field_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_telefonoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Direccion:");
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });

        field_direccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_direccion.setForeground(new java.awt.Color(153, 153, 255));
        field_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_direccionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Ciudad de nacimiento:");

        field_nacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_nacimiento.setForeground(new java.awt.Color(153, 153, 255));
        field_nacimiento.setPreferredSize(new java.awt.Dimension(5, 21));
        field_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_nacimientoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Documento:");

        field_documento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_documento.setForeground(new java.awt.Color(153, 153, 255));
        field_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_documentoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Estudios realizados:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Profesion:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Experiencia ejerciendo la profesión:");

        field_profesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_profesion.setForeground(new java.awt.Color(153, 153, 255));
        field_profesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_profesionKeyTyped(evt);
            }
        });

        field_trabat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_trabat.setForeground(new java.awt.Color(153, 153, 255));
        field_trabat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_trabatKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("Anterior trabajo:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 255));
        jLabel14.setText("Anterior empresa:");

        field_empresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        field_empresa.setForeground(new java.awt.Color(153, 153, 255));
        field_empresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_empresaKeyTyped(evt);
            }
        });

        buttom_guardar.setBackground(new java.awt.Color(224, 224, 224));
        buttom_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/diskette (1).png"))); // NOI18N
        buttom_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_guardarActionPerformed(evt);
            }
        });

        combo_profesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo_profesion.setForeground(new java.awt.Color(153, 153, 255));
        combo_profesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "1 año", "2 años", "3 años ", "4 años ", "5 años", "5+ años" }));
        combo_profesion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_profesionItemStateChanged(evt);
            }
        });
        combo_profesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_profesionActionPerformed(evt);
            }
        });

        combo_estudio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo_estudio.setForeground(new java.awt.Color(153, 153, 255));
        combo_estudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona ", "Primaria ", "Bachillerato", "Técnic(a)", "Tecnologo", "Universitari(a)", "Especialización", "Maestria ", "Doctorado", " " }));
        combo_estudio.setToolTipText("");
        combo_estudio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_estudioItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(field_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(field_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(field_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(combo_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(field_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel11)))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(field_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(246, 246, 246)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(field_documento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(field_direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(field_trabat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(field_empresa, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttom_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(combo_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(field_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(field_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(field_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(field_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(field_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(field_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(field_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field_trabat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(27, 27, 27)
                        .addComponent(buttom_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_edadActionPerformed

    }//GEN-LAST:event_combo_edadActionPerformed

    private void combo_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_estadoActionPerformed

    private void buttom_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_guardarActionPerformed
        //Atributos generales para el cliente
        // JTextField
        String valor_dire = field_direccion.getText().trim();
        String valor_nombre = field_nombre.getText().trim();
        String valor_apellido = field_apellido.getText().trim();
        String valor_nacimiento = field_nacimiento.getText().trim();
        String valor_profesion = field_profesion.getText().trim();
        String valor_trabat = field_trabat.getText().trim();
        String valor_empresa = field_empresa.getText().trim();
        String valordos_tele = field_telefono.getText().trim();
        String valortres_id = field_documento.getText().trim();
        int valor_combo_estudio = combo_estudio.getSelectedIndex();
        int valor_combo_profesion = combo_profesion.getSelectedIndex();
        int valor_combo_estado = combo_estado.getSelectedIndex();
        int valor_combo_edad = combo_edad.getSelectedIndex();
        try {

            // Comprobar si todos los campos estan vacíos
            if (valor_dire.isEmpty() && valortres_id.isEmpty() && valordos_tele.isEmpty() && valor_nombre.isEmpty()
                    && valor_apellido.isEmpty() && valor_nacimiento.isEmpty() && valor_profesion.isEmpty()
                    && valor_trabat.isEmpty() && valor_empresa.isEmpty() && valor_combo_estudio  == 0
                    && valor_combo_profesion == 0  && valor_combo_estado == 0 && valor_combo_edad == 0 ) {
                field_nombre.setBackground(Color.red);
                field_apellido.setBackground(Color.red);
                field_nacimiento.setBackground(Color.red);
                field_trabat.setBackground(Color.red);
                field_empresa.setBackground(Color.red);
                field_direccion.setBackground(Color.red);
                field_documento.setBackground(Color.red);
                field_telefono.setBackground(Color.red);
                field_profesion.setBackground(Color.red);
                combo_estudio.setBackground(Color.red);
                combo_profesion.setBackground(Color.red);
                combo_estado.setBackground(Color.red);
                combo_edad.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "¡Todos los campos son obligatorios!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
                    
            } else {

                // combo_profesion.setBackground(Color.green);
                int valor_telefono = Integer.parseInt(valordos_tele);
                int valor_id = Integer.parseInt(valortres_id);

                Pattern pattern_text = Pattern.compile("^[cC]r.*"); // Establecimos esa regla (regex) | // Simbolo: La cadena String(JTextfield) empieza por "cr" o "CR"
                Matcher value_valid = pattern_text.matcher(valor_dire);
                if (value_valid.matches()) {
                    field_direccion.setBackground(Color.green);
                    People instancia_clase = People.obtener_instancia_unica();
                    instancia_clase.añadir_datos(valor_dire, valor_nombre, valor_apellido,
                            valor_nacimiento, valor_profesion, valor_trabat,
                            valor_empresa, valordos_tele, valortres_id, valor_combo_estudio,
                            valor_combo_profesion, valor_combo_edad, valor_combo_estado);

                } else {
                    field_direccion.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "¡Debes iniciar en el campo Dirección con: Cr!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "¡Todos los campos son obligatorios!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
            if (valor_combo_estudio == 0) {
                combo_estudio.setBackground(Color.red);
            } else {
                combo_estudio.setBackground(Color.green);
            }
            
             if (valor_combo_profesion == 0) {
                combo_profesion.setBackground(Color.red);
            } else {
                combo_profesion.setBackground(Color.green);
            }
              if (valor_combo_edad == 0) {
                combo_edad.setBackground(Color.red);
            } else {
                combo_edad.setBackground(Color.green);
            }
               if (valor_combo_estado == 0) {
                combo_estado.setBackground(Color.red);
            } else {
                combo_estado.setBackground(Color.green);
            }
             
            if (valortres_id.isEmpty()) {
                field_documento.setBackground(Color.red);
            } else {
                field_documento.setBackground(Color.green);

            }
            if (valordos_tele.isEmpty()) {
                field_telefono.setBackground(Color.red);

            } else {
                field_telefono.setBackground(Color.green);

            }
            if (valor_nombre.isEmpty()) {
                field_nombre.setBackground(Color.red);

            } else {
                field_nombre.setBackground(Color.green);

            }
            if (valor_apellido.isEmpty()) {
                field_apellido.setBackground(Color.red);
            } else {
                field_apellido.setBackground(Color.green);

            }
            if (valor_nacimiento.isEmpty()) {
                field_nacimiento.setBackground(Color.red);
            } else {
                field_nacimiento.setBackground(Color.green);
            }
            if (valor_profesion.isEmpty()) {
                field_profesion.setBackground(Color.red);

            } else {
                field_profesion.setBackground(Color.green);

            }
            if (valor_trabat.isEmpty()) {
                field_trabat.setBackground(Color.red);

            } else {
                field_trabat.setBackground(Color.green);

            }
            if (valor_empresa.isEmpty()) {
                field_empresa.setBackground(Color.red);

            } else {
                field_trabat.setBackground(Color.green);
            }

            if (valor_dire.isEmpty()) {
                field_direccion.setBackground(Color.red);
            } else {
                Pattern pattern_text = Pattern.compile("^[cC]r.*"); // Establecimos esa regla (regex) | // Simbolo: La cadena String(JTextfield) empieza por "cr" o "CR"
                Matcher value_valid = pattern_text.matcher(valor_dire);
                if (value_valid.matches()) {
                    field_direccion.setBackground(Color.green);
                } else {
                    field_direccion.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "¡Debes iniciar con: Cr!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_buttom_guardarActionPerformed

    private void field_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_nombreKeyTyped
        char clic_validar = evt.getKeyChar();
        if (Character.isDigit(clic_validar)) {
            getToolkit().beep();
            evt.consume();
            field_nombre.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "¡Debes ingresar texto plano!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
        } else {
            field_nombre.setBackground(Color.green);
        }
    }//GEN-LAST:event_field_nombreKeyTyped

    private void field_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_apellidoKeyTyped
        char clic_validar = evt.getKeyChar();
        if (Character.isDigit(clic_validar)) {
            getToolkit().beep();
            evt.consume();
            field_apellido.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "¡Debes ingresar texto plano!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
        } else {
            field_apellido.setBackground(Color.green);
        }
    }//GEN-LAST:event_field_apellidoKeyTyped

    private void field_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_telefonoKeyTyped
        char clic_validar = evt.getKeyChar();
        if (Character.isLetter(clic_validar)) {
            getToolkit().beep();
            evt.consume();
            field_telefono.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "¡Debes ingresar valores númericos!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
        } else {
            field_telefono.setBackground(Color.green);
        }
    }//GEN-LAST:event_field_telefonoKeyTyped

    private void field_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_nacimientoKeyTyped
        char clic_validar = evt.getKeyChar();
        if (Character.isDigit(clic_validar)) {
            getToolkit().beep();
            evt.consume();
            field_nacimiento.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "¡Debes ingresar texto plano!", " Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        } else {
            field_nacimiento.setBackground(Color.green);
        }
    }//GEN-LAST:event_field_nacimientoKeyTyped

    private void combo_profesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_profesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_profesionActionPerformed

    private void field_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_documentoKeyTyped
        char clic_validar = evt.getKeyChar();
        if (Character.isLetter(clic_validar)) {
            getToolkit().beep();
            evt.consume();
            field_documento.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "¡Debes ingresar valores numericos!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        } else {
            field_documento.setBackground(Color.green);
        }
    }//GEN-LAST:event_field_documentoKeyTyped

    private void field_profesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_profesionKeyTyped
        char clic_validafr = evt.getKeyChar();
        if (Character.isDigit(clic_validafr)) {
            getToolkit().beep();
            evt.consume();
            field_profesion.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "¡Debes ingresar texto plano!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        } else {
            field_profesion.setBackground(Color.green);
        }
    }//GEN-LAST:event_field_profesionKeyTyped

    private void field_trabatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_trabatKeyTyped
        char clic_validar = evt.getKeyChar();
        if (Character.isDigit(clic_validar)) {
            getToolkit().beep();
            evt.consume();
            field_trabat.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Debes ingresar texto plano", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        } else {
            field_trabat.setBackground(Color.green);
        }
    }//GEN-LAST:event_field_trabatKeyTyped

    private void field_empresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_empresaKeyTyped
        char clic_validar = evt.getKeyChar();
        if (Character.isDigit(clic_validar)) {
            getToolkit().beep();
            evt.consume();
            field_empresa.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Debes ingresar texto plano", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        } else {
            field_empresa.setBackground(Color.green);
        }
    }//GEN-LAST:event_field_empresaKeyTyped

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

    }//GEN-LAST:event_jLabel7KeyPressed

    private void combo_estudioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_estudioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.combo_estudio.getSelectedIndex() > 0) {
                combo_estudio.setBackground(Color.green);
            } else {
                combo_estudio.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_combo_estudioItemStateChanged

    private void combo_profesionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_profesionItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.combo_profesion.getSelectedIndex() > 0) {
                combo_profesion.setBackground(Color.green);
            } else {
                combo_profesion.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_combo_profesionItemStateChanged

    private void combo_edadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_edadItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.combo_edad.getSelectedIndex() > 0) {
                combo_edad.setBackground(Color.green);
            } else {
                combo_edad.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_combo_edadItemStateChanged

    private void combo_estadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_estadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.combo_estado.getSelectedIndex() > 0) {
                combo_estado.setBackground(Color.green);
            } else {
                combo_estado.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_combo_estadoItemStateChanged

    private void field_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_direccionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttom_guardar;
    private javax.swing.JComboBox<String> combo_edad;
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JComboBox<String> combo_estudio;
    private javax.swing.JComboBox<String> combo_profesion;
    private javax.swing.JTextField field_apellido;
    private javax.swing.JTextField field_direccion;
    private javax.swing.JTextField field_documento;
    private javax.swing.JTextField field_empresa;
    private javax.swing.JTextField field_nacimiento;
    private javax.swing.JTextField field_nombre;
    private javax.swing.JTextField field_profesion;
    private javax.swing.JTextField field_telefono;
    private javax.swing.JTextField field_trabat;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
