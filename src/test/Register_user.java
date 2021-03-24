package test;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class Register_user extends javax.swing.JFrame {

    public Register_user() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("../image/icon.png")).getImage());
        for (int i = 18; i <= 100; i++) {
            Field_edad.addItem(String.valueOf(i));
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
        Field_edad = new javax.swing.JComboBox<>();
        Field_estado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        field_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        field_direccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Field_nacimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        field_documento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Falied_estudios = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        field_profesion = new javax.swing.JTextField();
        field_trabat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        field_empresa = new javax.swing.JTextField();
        buttom_guardar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

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

        Field_edad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Field_edad.setForeground(new java.awt.Color(153, 153, 255));
        Field_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_edadActionPerformed(evt);
            }
        });

        Field_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Field_estado.setForeground(new java.awt.Color(153, 153, 255));
        Field_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado" }));
        Field_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_estadoActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Ciudad de nacimiento:");

        Field_nacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Field_nacimiento.setForeground(new java.awt.Color(153, 153, 255));
        Field_nacimiento.setPreferredSize(new java.awt.Dimension(5, 21));
        Field_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Field_nacimientoKeyTyped(evt);
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

        Falied_estudios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Falied_estudios.setForeground(new java.awt.Color(153, 153, 255));
        Falied_estudios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Primaria", "Bachillerato", "Técnico", "Tecnologo", "Universidad", "Especializacion", "Maestria", "Doctorado" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Falied_estudios);

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 año", "2 años", "3 años ", "4 años ", "5 años", "5+ años" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(field_documento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                            .addComponent(field_direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(field_trabat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                .addComponent(field_empresa, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(12, 12, 12)
                                        .addComponent(Field_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(field_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(field_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Field_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Field_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(buttom_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Field_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(Field_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(Field_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(jComboBox1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(field_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_trabat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void Field_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_edadActionPerformed

    private void Field_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_estadoActionPerformed

    private void buttom_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_guardarActionPerformed
        String valor_user = field_direccion.getText().trim();

        if (valor_user.isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡El campo: Dirección es obligatorio!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        } else {
            Pattern pattern_text = Pattern.compile("^[cC]r.*"); // Establecimos esa regla (regex) | // Simbolo: La cadena String(JTextfield) empieza por "cr" o "CR"
            Matcher value_valid = pattern_text.matcher(valor_user);
            if (value_valid.matches()) {
                field_direccion.setBackground(Color.green);
            } else {
                field_direccion.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "¡Debes iniciar con: Cr!", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
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

    private void Field_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_nacimientoKeyTyped
        char clic_validar = evt.getKeyChar();
        if (Character.isDigit(clic_validar)) {
            getToolkit().beep();
            evt.consume();
            Field_nacimiento.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "¡Debes ingresar texto plano!", " Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        } else {
            Field_nacimiento.setBackground(Color.green);
        }
    }//GEN-LAST:event_Field_nacimientoKeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Falied_estudios;
    private javax.swing.JComboBox<String> Field_edad;
    private javax.swing.JComboBox<String> Field_estado;
    private javax.swing.JTextField Field_nacimiento;
    private javax.swing.JButton buttom_guardar;
    private javax.swing.JTextField field_apellido;
    private javax.swing.JTextField field_direccion;
    private javax.swing.JTextField field_documento;
    private javax.swing.JTextField field_empresa;
    private javax.swing.JTextField field_nombre;
    private javax.swing.JTextField field_profesion;
    private javax.swing.JTextField field_telefono;
    private javax.swing.JTextField field_trabat;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
