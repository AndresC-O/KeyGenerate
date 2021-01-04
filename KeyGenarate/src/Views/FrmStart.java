/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Generate.GenerarClave;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class FrmStart extends javax.swing.JFrame {

    /**
     * Creates new form FrmStart
     */
    public FrmStart() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_Clave.setEditable(false);
        txt_Email.setEditable(false);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb_Clave);
        grupo.add(rb_Email);
    }

    public void Copy(String Texto) {

        StringSelection ss = new StringSelection(Texto);
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(ss, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Email1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_Tema = new javax.swing.JLabel();
        sep_Encabezado = new javax.swing.JSeparator();
        lbl_PrimerNombre = new javax.swing.JLabel();
        txt_PrimerNombre = new javax.swing.JTextField();
        sep_PrimerNombre = new javax.swing.JSeparator();
        lbl_SegundoNombre = new javax.swing.JLabel();
        txt_SegundoNombre = new javax.swing.JTextField();
        sep_SegundoNombre = new javax.swing.JSeparator();
        sep_PrimerApellido = new javax.swing.JSeparator();
        lbl_PrimerApellido = new javax.swing.JLabel();
        txt_PrimerApellido = new javax.swing.JTextField();
        sep_SegundoApellido = new javax.swing.JSeparator();
        lbl_SegundoApellido = new javax.swing.JLabel();
        txt_SegundoApellido = new javax.swing.JTextField();
        sep_Edad = new javax.swing.JSeparator();
        lbl_Edad = new javax.swing.JLabel();
        txt_Edad = new javax.swing.JTextField();
        sep_Encabezado1 = new javax.swing.JSeparator();
        lbl_Tema2 = new javax.swing.JLabel();
        btn_Generar = new javax.swing.JButton();
        lbl_Edad1 = new javax.swing.JLabel();
        txt_Clave = new javax.swing.JTextField();
        lbl_Edad2 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        btn_Copiar = new javax.swing.JButton();
        rb_Clave = new javax.swing.JRadioButton();
        rb_Email = new javax.swing.JRadioButton();
        lbl_Eliminar = new javax.swing.JLabel();

        txt_Email1.setBackground(new java.awt.Color(48, 177, 139));
        txt_Email1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_Email1.setForeground(new java.awt.Color(24, 69, 88));
        txt_Email1.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 177, 139));
        jPanel1.setForeground(new java.awt.Color(24, 69, 88));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_Tema.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbl_Tema.setForeground(new java.awt.Color(24, 69, 88));
        lbl_Tema.setText("Generador de Claves.");

        sep_Encabezado.setBackground(new java.awt.Color(24, 69, 88));
        sep_Encabezado.setForeground(new java.awt.Color(24, 69, 88));
        sep_Encabezado.setPreferredSize(new java.awt.Dimension(50, 20));

        lbl_PrimerNombre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_PrimerNombre.setForeground(new java.awt.Color(24, 69, 88));
        lbl_PrimerNombre.setText("Primer Nombre:");

        txt_PrimerNombre.setBackground(new java.awt.Color(48, 177, 139));
        txt_PrimerNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_PrimerNombre.setForeground(new java.awt.Color(24, 69, 88));
        txt_PrimerNombre.setBorder(null);

        sep_PrimerNombre.setBackground(new java.awt.Color(24, 69, 88));
        sep_PrimerNombre.setForeground(new java.awt.Color(24, 69, 88));

        lbl_SegundoNombre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_SegundoNombre.setForeground(new java.awt.Color(24, 69, 88));
        lbl_SegundoNombre.setText("Segundo Nombre:");

        txt_SegundoNombre.setBackground(new java.awt.Color(48, 177, 139));
        txt_SegundoNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_SegundoNombre.setForeground(new java.awt.Color(24, 69, 88));
        txt_SegundoNombre.setBorder(null);

        sep_SegundoNombre.setBackground(new java.awt.Color(24, 69, 88));
        sep_SegundoNombre.setForeground(new java.awt.Color(24, 69, 88));

        sep_PrimerApellido.setBackground(new java.awt.Color(24, 69, 88));
        sep_PrimerApellido.setForeground(new java.awt.Color(24, 69, 88));

        lbl_PrimerApellido.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_PrimerApellido.setForeground(new java.awt.Color(24, 69, 88));
        lbl_PrimerApellido.setText("Primer Apellido:");

        txt_PrimerApellido.setBackground(new java.awt.Color(48, 177, 139));
        txt_PrimerApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_PrimerApellido.setForeground(new java.awt.Color(24, 69, 88));
        txt_PrimerApellido.setBorder(null);

        sep_SegundoApellido.setBackground(new java.awt.Color(24, 69, 88));
        sep_SegundoApellido.setForeground(new java.awt.Color(24, 69, 88));

        lbl_SegundoApellido.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_SegundoApellido.setForeground(new java.awt.Color(24, 69, 88));
        lbl_SegundoApellido.setText("Segundo Apellido:");

        txt_SegundoApellido.setBackground(new java.awt.Color(48, 177, 139));
        txt_SegundoApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_SegundoApellido.setForeground(new java.awt.Color(24, 69, 88));
        txt_SegundoApellido.setBorder(null);

        sep_Edad.setBackground(new java.awt.Color(24, 69, 88));
        sep_Edad.setForeground(new java.awt.Color(24, 69, 88));

        lbl_Edad.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_Edad.setForeground(new java.awt.Color(24, 69, 88));
        lbl_Edad.setText("Edad:");

        txt_Edad.setBackground(new java.awt.Color(48, 177, 139));
        txt_Edad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_Edad.setForeground(new java.awt.Color(24, 69, 88));
        txt_Edad.setBorder(null);

        sep_Encabezado1.setBackground(new java.awt.Color(24, 69, 88));
        sep_Encabezado1.setForeground(new java.awt.Color(24, 69, 88));
        sep_Encabezado1.setPreferredSize(new java.awt.Dimension(50, 20));

        lbl_Tema2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lbl_Tema2.setForeground(new java.awt.Color(24, 69, 88));
        lbl_Tema2.setText("Datos Generados.");

        btn_Generar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_Generar.setForeground(new java.awt.Color(24, 69, 88));
        btn_Generar.setText("GENERAR");
        btn_Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarActionPerformed(evt);
            }
        });

        lbl_Edad1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_Edad1.setForeground(new java.awt.Color(24, 69, 88));
        lbl_Edad1.setText("Clave generada:");

        txt_Clave.setBackground(new java.awt.Color(48, 177, 139));
        txt_Clave.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_Clave.setForeground(new java.awt.Color(24, 69, 88));
        txt_Clave.setBorder(null);

        lbl_Edad2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_Edad2.setForeground(new java.awt.Color(24, 69, 88));
        lbl_Edad2.setText("Correo generado:");

        txt_Email.setBackground(new java.awt.Color(48, 177, 139));
        txt_Email.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_Email.setForeground(new java.awt.Color(24, 69, 88));
        txt_Email.setBorder(null);

        btn_Copiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Copiar.setForeground(new java.awt.Color(24, 69, 88));
        btn_Copiar.setText("Copiar al Portapapeles.");
        btn_Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CopiarActionPerformed(evt);
            }
        });

        rb_Clave.setBackground(new java.awt.Color(48, 177, 139));
        rb_Clave.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rb_Clave.setForeground(new java.awt.Color(24, 69, 88));
        rb_Clave.setText("Clave");

        rb_Email.setBackground(new java.awt.Color(48, 177, 139));
        rb_Email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rb_Email.setForeground(new java.awt.Color(24, 69, 88));
        rb_Email.setText("E-mail");

        lbl_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trash.png"))); // NOI18N
        lbl_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Edad1)
                    .addComponent(lbl_Edad2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Email)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lbl_Tema))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(lbl_Tema2)))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_PrimerNombre)
                                    .addComponent(txt_PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sep_PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_SegundoNombre)
                                    .addComponent(txt_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sep_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(sep_Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_PrimerApellido)
                                    .addComponent(txt_PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sep_PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_SegundoApellido)
                                    .addComponent(txt_SegundoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(sep_SegundoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_Eliminar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Edad)
                                    .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sep_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(sep_Encabezado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Copiar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Tema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep_Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_PrimerNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep_PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_SegundoNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_PrimerApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep_PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_SegundoApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep_SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_Edad)
                                .addGap(12, 12, 12)
                                .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbl_Eliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Tema2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Edad1)
                    .addComponent(txt_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Edad2)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Clave)
                    .addComponent(rb_Email)
                    .addComponent(btn_Copiar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarActionPerformed

        GenerarClave generar = new GenerarClave();
        String PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Clave;
        int Edad;

        if (txt_PrimerNombre.getText().isEmpty() || txt_SegundoNombre.getText().isEmpty() || txt_PrimerApellido.getText().isEmpty()
                || txt_SegundoApellido.getText().isEmpty() || txt_Edad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Por favor rellene todos los campos!");
        } else {
            PrimerNombre = txt_PrimerNombre.getText();
            SegundoNombre = txt_SegundoNombre.getText();
            PrimerApellido = txt_PrimerApellido.getText();
            SegundoApellido = txt_SegundoApellido.getText();
            Edad = Integer.parseInt(txt_Edad.getText());

            Clave = generar.KeyGenerate(PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Edad);

            txt_Clave.setText(Clave);
            txt_Email.setText(Clave + "@unab.edu.sv");
        }
    }//GEN-LAST:event_btn_GenerarActionPerformed

    private void btn_CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CopiarActionPerformed

        if (rb_Clave.isSelected()) {
            Copy(txt_Clave.getText());
        }
        if (rb_Email.isSelected()) {
            Copy(txt_Email.getText());
        }
    }//GEN-LAST:event_btn_CopiarActionPerformed

    private void lbl_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EliminarMouseClicked

        txt_PrimerNombre.setText("");
        txt_SegundoNombre.setText("");
        txt_PrimerApellido.setText("");
        txt_SegundoApellido.setText("");
        txt_Edad.setText("");
        txt_Clave.setText("");
        txt_Email.setText("");
    }//GEN-LAST:event_lbl_EliminarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Copiar;
    private javax.swing.JButton btn_Generar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Edad;
    private javax.swing.JLabel lbl_Edad1;
    private javax.swing.JLabel lbl_Edad2;
    private javax.swing.JLabel lbl_Eliminar;
    private javax.swing.JLabel lbl_PrimerApellido;
    private javax.swing.JLabel lbl_PrimerNombre;
    private javax.swing.JLabel lbl_SegundoApellido;
    private javax.swing.JLabel lbl_SegundoNombre;
    private javax.swing.JLabel lbl_Tema;
    private javax.swing.JLabel lbl_Tema2;
    private javax.swing.JRadioButton rb_Clave;
    private javax.swing.JRadioButton rb_Email;
    private javax.swing.JSeparator sep_Edad;
    private javax.swing.JSeparator sep_Encabezado;
    private javax.swing.JSeparator sep_Encabezado1;
    private javax.swing.JSeparator sep_PrimerApellido;
    private javax.swing.JSeparator sep_PrimerNombre;
    private javax.swing.JSeparator sep_SegundoApellido;
    private javax.swing.JSeparator sep_SegundoNombre;
    private javax.swing.JTextField txt_Clave;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Email1;
    private javax.swing.JTextField txt_PrimerApellido;
    private javax.swing.JTextField txt_PrimerNombre;
    private javax.swing.JTextField txt_SegundoApellido;
    private javax.swing.JTextField txt_SegundoNombre;
    // End of variables declaration//GEN-END:variables
}
