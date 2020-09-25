package practica1singleton_avion;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public final class VentanaPrincipal extends javax.swing.JFrame {

    ArrayList<JCheckBox> checkboxes = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Usuario> copy;
    String nombre, apellidos, dni;
    Usuario user;
    Agencia agencia = new Agencia();
    ArrayList<String> asientos;

    public VentanaPrincipal() {
        initComponents();
        deshabilitarChecksbox();
        listarCheckboxs();
    }

    public void deshabilitarChecksbox() {
        for (int i = 0; i < this.jPanel2.getComponentCount(); i++) {
            Component c = this.jPanel2.getComponent(i);
            if (c instanceof JCheckBox) {
                ((JCheckBox) c).setEnabled(false);
            }
        }
    }

    public void habilitarChecksbox() {
        for (int i = 0; i < this.jPanel2.getComponentCount(); i++) {
            Component c = this.jPanel2.getComponent(i);
            if (c instanceof JCheckBox) {
                if (!((JCheckBox) c).getBackground().equals(Color.red)) {
                    ((JCheckBox) c).setEnabled(true);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextDni = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonAsientosAleatorios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextBuscaDni = new javax.swing.JTextField();
        botonBuscarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBilletes = new javax.swing.JList();
        botonDevolverAsientos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox78 = new javax.swing.JCheckBox();
        jCheckBox179 = new javax.swing.JCheckBox();
        jCheckBox180 = new javax.swing.JCheckBox();
        jCheckBox173 = new javax.swing.JCheckBox();
        jCheckBox99 = new javax.swing.JCheckBox();
        jCheckBox113 = new javax.swing.JCheckBox();
        jCheckBox174 = new javax.swing.JCheckBox();
        jCheckBox100 = new javax.swing.JCheckBox();
        jCheckBox114 = new javax.swing.JCheckBox();
        jCheckBox175 = new javax.swing.JCheckBox();
        jCheckBox101 = new javax.swing.JCheckBox();
        jCheckBox115 = new javax.swing.JCheckBox();
        jCheckBox176 = new javax.swing.JCheckBox();
        jCheckBox116 = new javax.swing.JCheckBox();
        jCheckBox89 = new javax.swing.JCheckBox();
        jCheckBox117 = new javax.swing.JCheckBox();
        jCheckBox177 = new javax.swing.JCheckBox();
        jCheckBox118 = new javax.swing.JCheckBox();
        jCheckBox90 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox178 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox91 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox92 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox93 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox94 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox95 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox96 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox70 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox97 = new javax.swing.JCheckBox();
        jCheckBox119 = new javax.swing.JCheckBox();
        jCheckBox71 = new javax.swing.JCheckBox();
        jCheckBox120 = new javax.swing.JCheckBox();
        jCheckBox98 = new javax.swing.JCheckBox();
        jCheckBox121 = new javax.swing.JCheckBox();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox122 = new javax.swing.JCheckBox();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox123 = new javax.swing.JCheckBox();
        jCheckBox74 = new javax.swing.JCheckBox();
        jCheckBox124 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jCheckBox125 = new javax.swing.JCheckBox();
        jCheckBox76 = new javax.swing.JCheckBox();
        jCheckBox126 = new javax.swing.JCheckBox();
        jCheckBox127 = new javax.swing.JCheckBox();
        jCheckBox128 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox129 = new javax.swing.JCheckBox();
        jCheckBox130 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox131 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox132 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox149 = new javax.swing.JCheckBox();
        jCheckBox150 = new javax.swing.JCheckBox();
        jCheckBox151 = new javax.swing.JCheckBox();
        jCheckBox152 = new javax.swing.JCheckBox();
        jCheckBox133 = new javax.swing.JCheckBox();
        jCheckBox134 = new javax.swing.JCheckBox();
        jCheckBox135 = new javax.swing.JCheckBox();
        jCheckBox136 = new javax.swing.JCheckBox();
        botonValidar = new javax.swing.JButton();
        jCheckBox137 = new javax.swing.JCheckBox();
        jCheckBox138 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox153 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox154 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox155 = new javax.swing.JCheckBox();
        jCheckBox156 = new javax.swing.JCheckBox();
        jCheckBox157 = new javax.swing.JCheckBox();
        jCheckBox158 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox139 = new javax.swing.JCheckBox();
        jCheckBox140 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox102 = new javax.swing.JCheckBox();
        jCheckBox141 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox103 = new javax.swing.JCheckBox();
        jCheckBox142 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox104 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox105 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox79 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox106 = new javax.swing.JCheckBox();
        jCheckBox159 = new javax.swing.JCheckBox();
        jCheckBox80 = new javax.swing.JCheckBox();
        jCheckBox160 = new javax.swing.JCheckBox();
        jCheckBox107 = new javax.swing.JCheckBox();
        jCheckBox161 = new javax.swing.JCheckBox();
        jCheckBox81 = new javax.swing.JCheckBox();
        jCheckBox162 = new javax.swing.JCheckBox();
        jCheckBox108 = new javax.swing.JCheckBox();
        jCheckBox143 = new javax.swing.JCheckBox();
        jCheckBox144 = new javax.swing.JCheckBox();
        jCheckBox145 = new javax.swing.JCheckBox();
        jCheckBox146 = new javax.swing.JCheckBox();
        jCheckBox147 = new javax.swing.JCheckBox();
        jCheckBox148 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox163 = new javax.swing.JCheckBox();
        jCheckBox82 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox164 = new javax.swing.JCheckBox();
        jCheckBox83 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox165 = new javax.swing.JCheckBox();
        jCheckBox84 = new javax.swing.JCheckBox();
        jCheckBox166 = new javax.swing.JCheckBox();
        jCheckBox85 = new javax.swing.JCheckBox();
        jCheckBox167 = new javax.swing.JCheckBox();
        jCheckBox86 = new javax.swing.JCheckBox();
        jCheckBox168 = new javax.swing.JCheckBox();
        jCheckBox87 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox88 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox67 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox169 = new javax.swing.JCheckBox();
        jCheckBox109 = new javax.swing.JCheckBox();
        jCheckBox170 = new javax.swing.JCheckBox();
        jCheckBox110 = new javax.swing.JCheckBox();
        jCheckBox171 = new javax.swing.JCheckBox();
        jCheckBox111 = new javax.swing.JCheckBox();
        jCheckBox172 = new javax.swing.JCheckBox();
        jCheckBox112 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DNI:");

        jTextDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextDni.setText("123456");

        jTextApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextApellidos.setText("Perez");
        jTextApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidosActionPerformed(evt);
            }
        });
        jTextApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidosKeyTyped(evt);
            }
        });

        jTextNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextNombre.setText("Juan");
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Elegir asientos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Nuevo Usuario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("INTRODUCIR LOS DATOS DEL USUARIO");

        botonAsientosAleatorios.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonAsientosAleatorios.setText("Comprar asientos aleatorios");
        botonAsientosAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsientosAleatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNombre)
                            .addComponent(jTextApellidos)
                            .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(botonAsientosAleatorios))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(51, 51, 51)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(botonAsientosAleatorios)
                .addGap(72, 72, 72))
        );

        jTabbedPane1.addTab("Usuarios", jPanel3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Introduce el DNI:");

        jTextBuscaDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBuscaDni.setText("123456");

        botonBuscarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonBuscarUsuario.setText("Buscar usuario");
        botonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarUsuarioActionPerformed(evt);
            }
        });

        jListBilletes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jListBilletes);

        botonDevolverAsientos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonDevolverAsientos.setText("Eliminar seleccionados");
        botonDevolverAsientos.setEnabled(false);
        botonDevolverAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolverAsientosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("AGENCIA DE VUELOS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setText("Seleccionar billetes para devolver:");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Nombre: ");

        jLabel11.setText("Apellidos:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(33, 33, 33)
                                    .addComponent(jTextBuscaDni, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(botonBuscarUsuario))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(botonDevolverAsientos)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextBuscaDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonBuscarUsuario)
                .addGap(31, 31, 31)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonDevolverAsientos)
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Agencia", jPanel4);

        jCheckBox77.setName("77"); // NOI18N

        jCheckBox78.setName("78"); // NOI18N

        jCheckBox179.setName("179"); // NOI18N

        jCheckBox180.setName("180"); // NOI18N

        jCheckBox173.setName("173"); // NOI18N

        jCheckBox99.setName("99"); // NOI18N

        jCheckBox113.setName("113"); // NOI18N

        jCheckBox174.setName("174"); // NOI18N

        jCheckBox100.setName("100"); // NOI18N

        jCheckBox114.setName("114"); // NOI18N

        jCheckBox175.setName("175"); // NOI18N

        jCheckBox101.setName("101"); // NOI18N

        jCheckBox115.setName("115"); // NOI18N

        jCheckBox176.setName("176"); // NOI18N

        jCheckBox116.setName("116"); // NOI18N

        jCheckBox89.setName("89"); // NOI18N

        jCheckBox117.setName("117"); // NOI18N

        jCheckBox177.setName("177"); // NOI18N

        jCheckBox118.setName("118"); // NOI18N

        jCheckBox90.setName("90"); // NOI18N

        jCheckBox9.setName("9"); // NOI18N

        jCheckBox178.setName("178"); // NOI18N

        jCheckBox10.setName("10"); // NOI18N

        jCheckBox91.setName("91"); // NOI18N

        jCheckBox11.setName("11"); // NOI18N

        jCheckBox92.setName("92"); // NOI18N

        jCheckBox12.setName("12"); // NOI18N

        jCheckBox93.setName("93"); // NOI18N

        jCheckBox13.setName("13"); // NOI18N

        jCheckBox94.setName("94"); // NOI18N

        jCheckBox14.setName("14"); // NOI18N

        jCheckBox95.setName("95"); // NOI18N

        jCheckBox15.setName("15"); // NOI18N

        jCheckBox69.setName("69"); // NOI18N

        jCheckBox16.setName("16"); // NOI18N

        jCheckBox96.setName("96"); // NOI18N

        jCheckBox17.setName("17"); // NOI18N

        jCheckBox70.setName("70"); // NOI18N

        jCheckBox18.setName("18"); // NOI18N

        jCheckBox97.setName("97"); // NOI18N

        jCheckBox119.setName("119"); // NOI18N

        jCheckBox71.setName("71"); // NOI18N

        jCheckBox120.setName("120"); // NOI18N

        jCheckBox98.setName("98"); // NOI18N

        jCheckBox121.setName("121"); // NOI18N

        jCheckBox72.setName("72"); // NOI18N

        jCheckBox122.setName("122"); // NOI18N

        jCheckBox73.setName("73"); // NOI18N

        jCheckBox123.setName("123"); // NOI18N

        jCheckBox74.setName("74"); // NOI18N

        jCheckBox124.setName("124"); // NOI18N

        jCheckBox75.setName("75"); // NOI18N

        jCheckBox125.setName("125"); // NOI18N

        jCheckBox76.setName("76"); // NOI18N

        jCheckBox126.setName("126"); // NOI18N

        jCheckBox127.setName("127"); // NOI18N

        jCheckBox128.setName("128"); // NOI18N

        jCheckBox19.setName("19"); // NOI18N

        jCheckBox20.setName("20"); // NOI18N

        jCheckBox21.setName("21"); // NOI18N

        jCheckBox22.setName("22"); // NOI18N

        jCheckBox23.setName("23"); // NOI18N

        jCheckBox24.setName("24"); // NOI18N

        jCheckBox25.setName("25"); // NOI18N

        jCheckBox26.setName("26"); // NOI18N

        jCheckBox27.setName("27"); // NOI18N

        jCheckBox28.setName("28"); // NOI18N

        jCheckBox129.setName("129"); // NOI18N

        jCheckBox130.setName("130"); // NOI18N

        jCheckBox43.setName("43"); // NOI18N

        jCheckBox131.setName("131"); // NOI18N

        jCheckBox44.setName("44"); // NOI18N

        jCheckBox132.setName("132"); // NOI18N

        jCheckBox45.setName("45"); // NOI18N

        jCheckBox46.setName("46"); // NOI18N

        jCheckBox47.setName("47"); // NOI18N

        jCheckBox48.setName("48"); // NOI18N

        jCheckBox149.setName("149"); // NOI18N

        jCheckBox150.setName("150"); // NOI18N

        jCheckBox151.setName("151"); // NOI18N

        jCheckBox152.setName("152"); // NOI18N

        jCheckBox133.setName("133"); // NOI18N

        jCheckBox134.setName("134"); // NOI18N

        jCheckBox135.setName("135"); // NOI18N

        jCheckBox136.setName("136"); // NOI18N

        botonValidar.setText("Comprar");
        botonValidar.setEnabled(false);
        botonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonValidarActionPerformed(evt);
            }
        });

        jCheckBox137.setName("137"); // NOI18N

        jCheckBox138.setName("138"); // NOI18N

        jCheckBox29.setName("29"); // NOI18N

        jCheckBox30.setName("30"); // NOI18N

        jCheckBox153.setName("153"); // NOI18N

        jCheckBox31.setName("31"); // NOI18N

        jCheckBox154.setName("154"); // NOI18N

        jCheckBox32.setName("32"); // NOI18N

        jCheckBox155.setName("155"); // NOI18N

        jCheckBox156.setName("156"); // NOI18N

        jCheckBox157.setName("157"); // NOI18N

        jCheckBox158.setName("158"); // NOI18N

        jCheckBox49.setName("49"); // NOI18N

        jCheckBox50.setName("50"); // NOI18N

        jCheckBox51.setName("51"); // NOI18N

        jCheckBox52.setName("52"); // NOI18N

        jCheckBox33.setName("33"); // NOI18N

        jCheckBox34.setName("34"); // NOI18N

        jCheckBox35.setName("35"); // NOI18N

        jCheckBox36.setName("36"); // NOI18N

        jCheckBox37.setName("37"); // NOI18N

        jCheckBox38.setName("38"); // NOI18N

        jCheckBox139.setName("139"); // NOI18N

        jCheckBox140.setName("140"); // NOI18N

        jCheckBox53.setName("53"); // NOI18N

        jCheckBox102.setName("102"); // NOI18N

        jCheckBox141.setName("141"); // NOI18N

        jCheckBox54.setName("54"); // NOI18N

        jCheckBox103.setName("103"); // NOI18N

        jCheckBox142.setName("142"); // NOI18N

        jCheckBox55.setName("55"); // NOI18N

        jCheckBox104.setName("104"); // NOI18N

        jCheckBox56.setName("56"); // NOI18N

        jCheckBox105.setName("105"); // NOI18N

        jCheckBox57.setName("57"); // NOI18N

        jCheckBox79.setName("79"); // NOI18N

        jCheckBox58.setName("58"); // NOI18N

        jCheckBox106.setName("106"); // NOI18N

        jCheckBox159.setName("159"); // NOI18N

        jCheckBox80.setName("80"); // NOI18N

        jCheckBox160.setName("160"); // NOI18N

        jCheckBox107.setName("107"); // NOI18N

        jCheckBox161.setName("161"); // NOI18N

        jCheckBox81.setName("81"); // NOI18N

        jCheckBox162.setName("162"); // NOI18N

        jCheckBox108.setName("108"); // NOI18N

        jCheckBox143.setName("143"); // NOI18N

        jCheckBox144.setName("144"); // NOI18N

        jCheckBox145.setName("145"); // NOI18N

        jCheckBox146.setName("146"); // NOI18N

        jCheckBox147.setName("147"); // NOI18N

        jCheckBox148.setName("148"); // NOI18N

        jCheckBox39.setName("39"); // NOI18N

        jCheckBox40.setName("40"); // NOI18N

        jCheckBox163.setName("163"); // NOI18N

        jCheckBox82.setName("82"); // NOI18N

        jCheckBox41.setName("41"); // NOI18N

        jCheckBox164.setName("164"); // NOI18N

        jCheckBox83.setName("83"); // NOI18N

        jCheckBox42.setName("42"); // NOI18N

        jCheckBox165.setName("165"); // NOI18N

        jCheckBox84.setName("84"); // NOI18N

        jCheckBox166.setName("166"); // NOI18N

        jCheckBox85.setName("85"); // NOI18N

        jCheckBox167.setName("167"); // NOI18N

        jCheckBox86.setName("86"); // NOI18N

        jCheckBox168.setName("168"); // NOI18N

        jCheckBox87.setName("87"); // NOI18N

        jCheckBox59.setName("59"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Distribucion de asientos:");

        jCheckBox60.setName("60"); // NOI18N

        jCheckBox88.setName("88"); // NOI18N

        jCheckBox61.setName("61"); // NOI18N

        jCheckBox1.setName("1"); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox62.setName("62"); // NOI18N

        jCheckBox2.setName("2"); // NOI18N

        jCheckBox63.setName("63"); // NOI18N

        jCheckBox3.setName("3"); // NOI18N

        jCheckBox64.setName("64"); // NOI18N

        jCheckBox4.setName("4"); // NOI18N

        jCheckBox65.setName("65"); // NOI18N

        jCheckBox5.setName("5"); // NOI18N

        jCheckBox66.setName("66"); // NOI18N

        jCheckBox6.setName("6"); // NOI18N

        jCheckBox67.setName("67"); // NOI18N

        jCheckBox7.setName("7"); // NOI18N

        jCheckBox68.setName("68"); // NOI18N

        jCheckBox8.setName("8"); // NOI18N

        jCheckBox169.setName("169"); // NOI18N

        jCheckBox109.setName("109"); // NOI18N

        jCheckBox170.setName("170"); // NOI18N

        jCheckBox110.setName("110"); // NOI18N

        jCheckBox171.setName("171"); // NOI18N

        jCheckBox111.setName("111"); // NOI18N

        jCheckBox172.setName("172"); // NOI18N

        jCheckBox112.setName("112"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox161)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox162)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox163)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox164)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox165))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox151)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox152)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox153)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox154)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox155))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox25))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox131)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox132)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox133)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox134)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox135))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox141)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox142)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox143)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox144)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox145))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox121)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox122)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox123)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox124)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox125)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox113)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox115))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox101)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox105))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox95))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox85))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox65))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox75))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox55))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox45))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox35))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox171)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox172)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox173)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox174)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox175)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox30))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox136)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox138)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox139)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox140))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox126)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox127)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox128)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox129)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox130))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox166)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox167)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox168)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox169)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox170))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox156)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox157)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox158)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox159)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox160))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox146)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox147)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox148)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox149)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox150)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox176)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox177)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox178)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox179)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox180)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox117)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox120))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox106)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox107)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox108)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox109)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox110))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox96)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox97)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox99)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox100))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox89)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox90))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox70))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox80))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox60))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox50))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox40))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(botonValidar)))
                .addGap(32, 32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox29)
                    .addComponent(jCheckBox30)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox24)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox39)
                    .addComponent(jCheckBox40)
                    .addComponent(jCheckBox31)
                    .addComponent(jCheckBox32)
                    .addComponent(jCheckBox33)
                    .addComponent(jCheckBox34)
                    .addComponent(jCheckBox35)
                    .addComponent(jCheckBox36)
                    .addComponent(jCheckBox37)
                    .addComponent(jCheckBox38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox49)
                    .addComponent(jCheckBox50)
                    .addComponent(jCheckBox41)
                    .addComponent(jCheckBox42)
                    .addComponent(jCheckBox43)
                    .addComponent(jCheckBox44)
                    .addComponent(jCheckBox45)
                    .addComponent(jCheckBox46)
                    .addComponent(jCheckBox47)
                    .addComponent(jCheckBox48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox59)
                    .addComponent(jCheckBox60)
                    .addComponent(jCheckBox51)
                    .addComponent(jCheckBox52)
                    .addComponent(jCheckBox53)
                    .addComponent(jCheckBox54)
                    .addComponent(jCheckBox55)
                    .addComponent(jCheckBox56)
                    .addComponent(jCheckBox57)
                    .addComponent(jCheckBox58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox69)
                    .addComponent(jCheckBox70)
                    .addComponent(jCheckBox61)
                    .addComponent(jCheckBox62)
                    .addComponent(jCheckBox63)
                    .addComponent(jCheckBox64)
                    .addComponent(jCheckBox65)
                    .addComponent(jCheckBox66)
                    .addComponent(jCheckBox67)
                    .addComponent(jCheckBox68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox79)
                    .addComponent(jCheckBox80)
                    .addComponent(jCheckBox71)
                    .addComponent(jCheckBox72)
                    .addComponent(jCheckBox73)
                    .addComponent(jCheckBox74)
                    .addComponent(jCheckBox75)
                    .addComponent(jCheckBox76)
                    .addComponent(jCheckBox77)
                    .addComponent(jCheckBox78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox89)
                    .addComponent(jCheckBox90)
                    .addComponent(jCheckBox81)
                    .addComponent(jCheckBox82)
                    .addComponent(jCheckBox83)
                    .addComponent(jCheckBox84)
                    .addComponent(jCheckBox85)
                    .addComponent(jCheckBox86)
                    .addComponent(jCheckBox87)
                    .addComponent(jCheckBox88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox99)
                    .addComponent(jCheckBox100)
                    .addComponent(jCheckBox91)
                    .addComponent(jCheckBox92)
                    .addComponent(jCheckBox93)
                    .addComponent(jCheckBox94)
                    .addComponent(jCheckBox95)
                    .addComponent(jCheckBox96)
                    .addComponent(jCheckBox97)
                    .addComponent(jCheckBox98))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox109)
                    .addComponent(jCheckBox110)
                    .addComponent(jCheckBox101)
                    .addComponent(jCheckBox102)
                    .addComponent(jCheckBox103)
                    .addComponent(jCheckBox104)
                    .addComponent(jCheckBox105)
                    .addComponent(jCheckBox106)
                    .addComponent(jCheckBox107)
                    .addComponent(jCheckBox108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox119)
                    .addComponent(jCheckBox120)
                    .addComponent(jCheckBox111)
                    .addComponent(jCheckBox112)
                    .addComponent(jCheckBox113)
                    .addComponent(jCheckBox114)
                    .addComponent(jCheckBox115)
                    .addComponent(jCheckBox116, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox117)
                    .addComponent(jCheckBox118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox121)
                            .addComponent(jCheckBox122)
                            .addComponent(jCheckBox123)
                            .addComponent(jCheckBox124)
                            .addComponent(jCheckBox125))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox131)
                            .addComponent(jCheckBox132)
                            .addComponent(jCheckBox133)
                            .addComponent(jCheckBox134)
                            .addComponent(jCheckBox135))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox141)
                            .addComponent(jCheckBox142)
                            .addComponent(jCheckBox143)
                            .addComponent(jCheckBox144)
                            .addComponent(jCheckBox145))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox151)
                            .addComponent(jCheckBox152)
                            .addComponent(jCheckBox153)
                            .addComponent(jCheckBox154)
                            .addComponent(jCheckBox155))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox161)
                            .addComponent(jCheckBox162)
                            .addComponent(jCheckBox163)
                            .addComponent(jCheckBox164)
                            .addComponent(jCheckBox165))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox171)
                            .addComponent(jCheckBox172)
                            .addComponent(jCheckBox173)
                            .addComponent(jCheckBox174)
                            .addComponent(jCheckBox175)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox129)
                            .addComponent(jCheckBox130)
                            .addComponent(jCheckBox126)
                            .addComponent(jCheckBox127)
                            .addComponent(jCheckBox128))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox139)
                            .addComponent(jCheckBox140)
                            .addComponent(jCheckBox136)
                            .addComponent(jCheckBox137)
                            .addComponent(jCheckBox138))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox149)
                            .addComponent(jCheckBox150)
                            .addComponent(jCheckBox146)
                            .addComponent(jCheckBox147)
                            .addComponent(jCheckBox148))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox159)
                            .addComponent(jCheckBox160)
                            .addComponent(jCheckBox156)
                            .addComponent(jCheckBox157)
                            .addComponent(jCheckBox158))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox169)
                            .addComponent(jCheckBox170)
                            .addComponent(jCheckBox166)
                            .addComponent(jCheckBox167)
                            .addComponent(jCheckBox168))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox179)
                            .addComponent(jCheckBox180)
                            .addComponent(jCheckBox176)
                            .addComponent(jCheckBox177)
                            .addComponent(jCheckBox178))))
                .addGap(18, 18, 18)
                .addComponent(botonValidar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Asientos disponibles:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("180");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel15.setText("Práctica 1: Singleton - Arquitectura Software Dirigida por Modelos");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel16.setText("Jonathan Jiménez Reina (3º Ingeniería Informática de Software)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator3))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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

    public void listarCheckboxs() {
        for (int i = 0; i < this.jPanel2.getComponentCount(); i++) {
            Component c = this.jPanel2.getComponent(i);
            if (c instanceof JCheckBox) {
                checkboxes.add((JCheckBox) c);
            }
        }
    }

    public void comprobarAsientos() {
        asientos = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            if (checkboxes.get(i).isSelected()) {
                if (checkboxes.get(i).isEnabled() && !checkboxes.get(i).getBackground().equals(Color.red)) {
                    asientos.add(checkboxes.get(i).getName());
                }
                checkboxes.get(i).setEnabled(false);
                checkboxes.get(i).setBackground(Color.red);
            }
        }
    }

    public void gestionarCompraBilletes() {
        if (usuarios.isEmpty()) {
            user = new Usuario(nombre, apellidos, dni, asientos);
            user.QuieroComprarBilletes(asientos.size());
            usuarios.add(user);
            System.out.println(user);
        } else {
            copy = new ArrayList<>();
            for (Usuario us : usuarios) {
                copy.add(us);
            }
            copy.stream().forEach((u) -> {
                if (u.getDni().equals(dni)) {
                    u.QuieroComprarBilletes(asientos.size());
                    usuarios.get(copy.indexOf(u)).setBilletes(asientos);
                    System.out.println(u);
                } else {
                    user = new Usuario(nombre, apellidos, dni, asientos);
                    user.QuieroComprarBilletes(asientos.size());
                    usuarios.add(user);
                    System.out.println(user);
                }
            });
        }
    }

    private void botonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonValidarActionPerformed
        comprobarAsientos();
        gestionarCompraBilletes();
        JOptionPane.showMessageDialog(null, nombre + ", has comprado los asientos: " + asientos.toString());
        jLabel14.setText(String.valueOf(Avion.get_Avion().CuantosAsientosQuedan()));
        nuevoUsuario();
    }//GEN-LAST:event_botonValidarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidosActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    public void recogerDatosEtiquetas() {
        nombre = jTextNombre.getText();
        apellidos = jTextApellidos.getText();
        dni = jTextDni.getText();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (comprobarCampos()) {
            habilitarChecksbox();
            botonValidar.setEnabled(true);
            recogerDatosEtiquetas();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public boolean existeUsuario(String dni) {
        return usuarios.stream().anyMatch((u) -> (u.getDni().equals(dni)));
    }

    public boolean tieneBilletes(String dni) {
        if (!usuarios.stream().filter((u) -> (u.getDni().equals(dni))).noneMatch((u) -> (u.getBilletes().isEmpty()))) {
            return false;
        } else {
            return true;
        }
    }

    private void botonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarUsuarioActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        jListBilletes.setModel(modelo);

        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningun usuario en la base de datos");
        } else if (jTextBuscaDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes rellenar el campo DNI");
        } else if (!existeUsuario(jTextBuscaDni.getText())) {
            JOptionPane.showMessageDialog(this, "DNI " + jTextBuscaDni.getText() + " no encontrado");
        } else if (existeUsuario(jTextBuscaDni.getText()) && !tieneBilletes(jTextBuscaDni.getText())) {
            JOptionPane.showMessageDialog(this, "DNI " + jTextBuscaDni.getText() + " existe pero no tiene billetes");
        } else {
            for (Usuario u : usuarios) {
                if (u.getDni().equals(jTextBuscaDni.getText())) {
                    user = u;
                    for (String b : u.getBilletes()) {
                        modelo.addElement("Billete con asiento numero " + b);
                    }
                }
            }
            jLabel10.setText(user.getNombre());
            jLabel12.setText(user.getApellidos());
            botonDevolverAsientos.setEnabled(true);
        }
    }//GEN-LAST:event_botonBuscarUsuarioActionPerformed

    public void nuevoUsuario() {
        deshabilitarChecksbox();
        jTextNombre.setText("");
        jTextApellidos.setText("");
        jTextDni.setText("");
        botonValidar.setEnabled(false);
    }

    public boolean comprobarCampos() {
        if (jTextNombre.getText().isEmpty() || jTextNombre.getText().isEmpty() || jTextApellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tienes que rellenar los campos");
            return false;
        } else {
            return true;
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        nuevoUsuario();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void botonDevolverAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolverAsientosActionPerformed
        int[] numeros = jListBilletes.getSelectedIndices();
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("posicion " + numeros[i]);
        }
        agencia.QuieroDevolverBilletes(numeros.length);

        ArrayList<String> aux = user.devolverBilletes(numeros);
        for (JCheckBox c : checkboxes) {
            for (String s : aux) {
                if (c.getName().equals(s)) {
                    c.setBackground(jPanel1.getBackground());
                    c.setSelected(false);
                }
            }
        }

        DefaultListModel modelo = new DefaultListModel();
        jListBilletes.setModel(modelo);
        user.getBilletes().stream().forEach((b) -> {
            modelo.addElement("Billete con asiento numero " + b);
        });
        jLabel14.setText(String.valueOf(Avion.get_Avion().CuantosAsientosQuedan()));
    }//GEN-LAST:event_botonDevolverAsientosActionPerformed

    private void botonAsientosAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsientosAleatoriosActionPerformed
        if (comprobarCampos()) {
            habilitarChecksbox();
            recogerDatosEtiquetas();
            int input = 0;
            do {
                input = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos asientos quiere?: "));
            } while (input > Avion.get_Avion().CuantosAsientosQuedan());

            for (int i = 0; i < input; i++) {
                int numero = (int) Math.floor(Math.random() * (1 - 180 + 1) + 180);;
                while (checkboxes.get(numero).isSelected()) {
                    numero = (int) Math.floor(Math.random() * (1 - 180 + 1) + 180);;
                }
                System.out.println("Numero aleatorio: " + numero);
                checkboxes.get(numero).setSelected(true);
            }
            comprobarAsientos();
            gestionarCompraBilletes();
            JOptionPane.showMessageDialog(null, nombre + ", has comprado los asientos: " + asientos.toString());
            jLabel14.setText(String.valueOf(Avion.get_Avion().CuantosAsientosQuedan()));
            nuevoUsuario();
        }
    }//GEN-LAST:event_botonAsientosAleatoriosActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellidosKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextApellidosKeyTyped
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAsientosAleatorios;
    private javax.swing.JButton botonBuscarUsuario;
    private javax.swing.JButton botonDevolverAsientos;
    private javax.swing.JButton botonValidar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox100;
    private javax.swing.JCheckBox jCheckBox101;
    private javax.swing.JCheckBox jCheckBox102;
    private javax.swing.JCheckBox jCheckBox103;
    private javax.swing.JCheckBox jCheckBox104;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox107;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox109;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox110;
    private javax.swing.JCheckBox jCheckBox111;
    private javax.swing.JCheckBox jCheckBox112;
    private javax.swing.JCheckBox jCheckBox113;
    private javax.swing.JCheckBox jCheckBox114;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox116;
    private javax.swing.JCheckBox jCheckBox117;
    private javax.swing.JCheckBox jCheckBox118;
    private javax.swing.JCheckBox jCheckBox119;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox120;
    private javax.swing.JCheckBox jCheckBox121;
    private javax.swing.JCheckBox jCheckBox122;
    private javax.swing.JCheckBox jCheckBox123;
    private javax.swing.JCheckBox jCheckBox124;
    private javax.swing.JCheckBox jCheckBox125;
    private javax.swing.JCheckBox jCheckBox126;
    private javax.swing.JCheckBox jCheckBox127;
    private javax.swing.JCheckBox jCheckBox128;
    private javax.swing.JCheckBox jCheckBox129;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox130;
    private javax.swing.JCheckBox jCheckBox131;
    private javax.swing.JCheckBox jCheckBox132;
    private javax.swing.JCheckBox jCheckBox133;
    private javax.swing.JCheckBox jCheckBox134;
    private javax.swing.JCheckBox jCheckBox135;
    private javax.swing.JCheckBox jCheckBox136;
    private javax.swing.JCheckBox jCheckBox137;
    private javax.swing.JCheckBox jCheckBox138;
    private javax.swing.JCheckBox jCheckBox139;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox140;
    private javax.swing.JCheckBox jCheckBox141;
    private javax.swing.JCheckBox jCheckBox142;
    private javax.swing.JCheckBox jCheckBox143;
    private javax.swing.JCheckBox jCheckBox144;
    private javax.swing.JCheckBox jCheckBox145;
    private javax.swing.JCheckBox jCheckBox146;
    private javax.swing.JCheckBox jCheckBox147;
    private javax.swing.JCheckBox jCheckBox148;
    private javax.swing.JCheckBox jCheckBox149;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox150;
    private javax.swing.JCheckBox jCheckBox151;
    private javax.swing.JCheckBox jCheckBox152;
    private javax.swing.JCheckBox jCheckBox153;
    private javax.swing.JCheckBox jCheckBox154;
    private javax.swing.JCheckBox jCheckBox155;
    private javax.swing.JCheckBox jCheckBox156;
    private javax.swing.JCheckBox jCheckBox157;
    private javax.swing.JCheckBox jCheckBox158;
    private javax.swing.JCheckBox jCheckBox159;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox160;
    private javax.swing.JCheckBox jCheckBox161;
    private javax.swing.JCheckBox jCheckBox162;
    private javax.swing.JCheckBox jCheckBox163;
    private javax.swing.JCheckBox jCheckBox164;
    private javax.swing.JCheckBox jCheckBox165;
    private javax.swing.JCheckBox jCheckBox166;
    private javax.swing.JCheckBox jCheckBox167;
    private javax.swing.JCheckBox jCheckBox168;
    private javax.swing.JCheckBox jCheckBox169;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox170;
    private javax.swing.JCheckBox jCheckBox171;
    private javax.swing.JCheckBox jCheckBox172;
    private javax.swing.JCheckBox jCheckBox173;
    private javax.swing.JCheckBox jCheckBox174;
    private javax.swing.JCheckBox jCheckBox175;
    private javax.swing.JCheckBox jCheckBox176;
    private javax.swing.JCheckBox jCheckBox177;
    private javax.swing.JCheckBox jCheckBox178;
    private javax.swing.JCheckBox jCheckBox179;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox180;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox84;
    private javax.swing.JCheckBox jCheckBox85;
    private javax.swing.JCheckBox jCheckBox86;
    private javax.swing.JCheckBox jCheckBox87;
    private javax.swing.JCheckBox jCheckBox88;
    private javax.swing.JCheckBox jCheckBox89;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox91;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox95;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox98;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListBilletes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextBuscaDni;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
