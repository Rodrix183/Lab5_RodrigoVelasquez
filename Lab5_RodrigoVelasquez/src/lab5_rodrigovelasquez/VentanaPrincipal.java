package lab5_rodrigovelasquez;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Sistema = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_cine1 = new javax.swing.JTree();
        jButton2 = new javax.swing.JButton();
        jd_registro = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        tf_nombreR = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_userR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_passwordR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_emailR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jdc_nacimiento = new com.toedter.calendar.JDateChooser();
        rb4 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pp_CRUD = new javax.swing.JPopupMenu();
        jd_DULCE = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Dulce = new javax.swing.JTree();
        cb_categoriaDulces = new javax.swing.JComboBox<>();
        jb_meterDulce = new javax.swing.JButton();
        tf_nombreDulce = new javax.swing.JTextField();
        tf_saborDulce = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_Dulces = new javax.swing.JList<>();
        jb_GuardarDulce = new javax.swing.JButton();
        jd_BOLETO = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jb_GuardarDulce1 = new javax.swing.JButton();
        tf_nombrePelicula = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_duracionPelicula = new javax.swing.JTextField();
        cb_categoriaPeliculas = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_Peliculas = new javax.swing.JList<>();
        jb_meterPelicula = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jt_Pelicula = new javax.swing.JTree();
        jLabel22 = new javax.swing.JLabel();
        tf_clasificacionPelicula = new javax.swing.JTextField();
        jd_ASEO = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        tf_nombreArticulo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cb_categoriaFunciones = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jl_Limpieza = new javax.swing.JList<>();
        jb_GuardarArt = new javax.swing.JButton();
        jb_meterArt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_Limpieza = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_Descripcion = new javax.swing.JTextArea();
        pp_DULCE = new javax.swing.JPopupMenu();
        jmi_AddDulce = new javax.swing.JMenuItem();
        jmi_modificarDulce = new javax.swing.JMenuItem();
        jmi_eliminarDulce = new javax.swing.JMenuItem();
        pp_Boleto = new javax.swing.JPopupMenu();
        jmi_AddBoleto = new javax.swing.JMenuItem();
        jmi_modificarPeli = new javax.swing.JMenuItem();
        jmi_eliminarPeli = new javax.swing.JMenuItem();
        pp_limpio = new javax.swing.JPopupMenu();
        jmi_AddArticulo = new javax.swing.JMenuItem();
        jmi_modificarArticulo = new javax.swing.JMenuItem();
        jmi_eliminarArticulo = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jb_login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_loginUser = new javax.swing.JTextField();
        pf_loginPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("CineEshta");

        jLabel4.setText("Sistema Cine");

        jt_cine1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Cine");
        jt_cine1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_cine1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_cine1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_cine1);

        jButton2.setText("jButton1");

        javax.swing.GroupLayout jd_SistemaLayout = new javax.swing.GroupLayout(jd_Sistema.getContentPane());
        jd_Sistema.getContentPane().setLayout(jd_SistemaLayout);
        jd_SistemaLayout.setHorizontalGroup(
            jd_SistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(38, 38, 38)
                .addGroup(jd_SistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_SistemaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(98, 98, 98))
        );
        jd_SistemaLayout.setVerticalGroup(
            jd_SistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_SistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton3.setText("Registrar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Registro");

        jLabel8.setText("Nombre");

        jLabel9.setText("Fecha de Nacimiento");

        jLabel10.setText("Usuario");

        jLabel11.setText("Contraseña");

        jLabel12.setText("Correo");

        jLabel13.setText("Puesto");

        buttonGroup1.add(rb1);
        rb1.setText("Dulces");

        buttonGroup1.add(rb2);
        rb2.setText("Boleteria");

        buttonGroup1.add(rb3);
        rb3.setText("Aseo");

        buttonGroup1.add(rb4);
        rb4.setText("Admin");

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_registroLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel2))
                            .addGroup(jd_registroLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8)
                                .addGap(79, 79, 79)
                                .addComponent(tf_nombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jd_registroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jd_registroLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(79, 79, 79)
                                        .addComponent(tf_passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_registroLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(79, 79, 79)
                                        .addComponent(tf_emailR, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_registroLayout.createSequentialGroup()
                                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(79, 79, 79)
                                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_userR, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jdc_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jd_registroLayout.createSequentialGroup()
                                    .addComponent(rb1)
                                    .addGap(18, 18, 18)
                                    .addComponent(rb2)
                                    .addGap(18, 18, 18)
                                    .addComponent(rb3)
                                    .addGap(26, 26, 26)
                                    .addComponent(rb4)))))
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton3)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jdc_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_userR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_emailR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3)
                    .addComponent(rb4))
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Dulces");
        jt_Dulce.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_Dulce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_DulceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Dulce);

        cb_categoriaDulces.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolates", "Gomitas", "Paletas", "Chicles" }));

        jb_meterDulce.setText("-->");
        jb_meterDulce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_meterDulceMouseClicked(evt);
            }
        });

        jLabel14.setText("Nombre");

        jLabel15.setText("Sabor");

        jl_Dulces.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jl_Dulces);

        jb_GuardarDulce.setText("Guardar Dulce");
        jb_GuardarDulce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarDulceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_DULCELayout = new javax.swing.GroupLayout(jd_DULCE.getContentPane());
        jd_DULCE.getContentPane().setLayout(jd_DULCELayout);
        jd_DULCELayout.setHorizontalGroup(
            jd_DULCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_DULCELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_DULCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(cb_categoriaDulces, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(tf_saborDulce)
                    .addComponent(tf_nombreDulce))
                .addGroup(jd_DULCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_DULCELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jb_meterDulce)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jd_DULCELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_GuardarDulce)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jd_DULCELayout.setVerticalGroup(
            jd_DULCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_DULCELayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_DULCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreDulce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_GuardarDulce))
                .addGap(18, 18, 18)
                .addGroup(jd_DULCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_DULCELayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(5, 5, 5)
                        .addComponent(tf_saborDulce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(cb_categoriaDulces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jd_DULCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_DULCELayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jb_meterDulce))
                            .addGroup(jd_DULCELayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel20.setText("Nombre");

        jb_GuardarDulce1.setText("Guardar Pelicula");
        jb_GuardarDulce1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarDulce1MouseClicked(evt);
            }
        });

        jLabel21.setText("Duracion");

        cb_categoriaPeliculas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terror", "Comedia", "Romance", "Drama", "Accion", "Infantil" }));

        jl_Peliculas.setModel(new DefaultListModel());
        jScrollPane6.setViewportView(jl_Peliculas);

        jb_meterPelicula.setText("-->");
        jb_meterPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_meterPeliculaMouseClicked(evt);
            }
        });

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Peliculas");
        jt_Pelicula.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_Pelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_PeliculaMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jt_Pelicula);

        jLabel22.setText("Clasificacion");

        javax.swing.GroupLayout jd_BOLETOLayout = new javax.swing.GroupLayout(jd_BOLETO.getContentPane());
        jd_BOLETO.getContentPane().setLayout(jd_BOLETOLayout);
        jd_BOLETOLayout.setHorizontalGroup(
            jd_BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_BOLETOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(cb_categoriaPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(tf_nombrePelicula)
                    .addComponent(jLabel22)
                    .addGroup(jd_BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_clasificacionPelicula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(tf_duracionPelicula, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(jd_BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_BOLETOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jb_meterPelicula)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jd_BOLETOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_GuardarDulce1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jd_BOLETOLayout.setVerticalGroup(
            jd_BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_BOLETOLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_GuardarDulce1))
                .addGap(18, 18, 18)
                .addGroup(jd_BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_BOLETOLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGroup(jd_BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_BOLETOLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jb_meterPelicula)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jd_BOLETOLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(tf_duracionPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(5, 5, 5)
                                .addComponent(tf_clasificacionPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_categoriaPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel16.setText("Nombre");

        jLabel17.setText("Descripcion");

        cb_categoriaFunciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpieza de Pisos", "Limpieza de Vidrios", "Limpieza de Mesas" }));

        jl_Limpieza.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(jl_Limpieza);

        jb_GuardarArt.setText("Guardar Articulo Limpieza");
        jb_GuardarArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarArtMouseClicked(evt);
            }
        });

        jb_meterArt.setText("---->");
        jb_meterArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_meterArtMouseClicked(evt);
            }
        });

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Articulos");
        jt_Limpieza.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_Limpieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_LimpiezaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_Limpieza);

        ta_Descripcion.setColumns(20);
        ta_Descripcion.setRows(5);
        jScrollPane4.setViewportView(ta_Descripcion);

        javax.swing.GroupLayout jd_ASEOLayout = new javax.swing.GroupLayout(jd_ASEO.getContentPane());
        jd_ASEO.getContentPane().setLayout(jd_ASEOLayout);
        jd_ASEOLayout.setHorizontalGroup(
            jd_ASEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ASEOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ASEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(cb_categoriaFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(tf_nombreArticulo)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_ASEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_ASEOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_GuardarArt))
                    .addGroup(jd_ASEOLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jb_meterArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jd_ASEOLayout.setVerticalGroup(
            jd_ASEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ASEOLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_ASEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_GuardarArt))
                .addGap(18, 18, 18)
                .addGroup(jd_ASEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ASEOLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jd_ASEOLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_categoriaFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jd_ASEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ASEOLayout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ASEOLayout.createSequentialGroup()
                                .addComponent(jb_meterArt)
                                .addGap(170, 170, 170))))))
        );

        jmi_AddDulce.setText("Agregar");
        jmi_AddDulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AddDulceActionPerformed(evt);
            }
        });
        pp_DULCE.add(jmi_AddDulce);

        jmi_modificarDulce.setText("Modificar");
        jmi_modificarDulce.setToolTipText("");
        jmi_modificarDulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarDulceActionPerformed(evt);
            }
        });
        pp_DULCE.add(jmi_modificarDulce);

        jmi_eliminarDulce.setText("Eliminar");
        pp_DULCE.add(jmi_eliminarDulce);

        jmi_AddBoleto.setText("Agregar");
        jmi_AddBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AddBoletoActionPerformed(evt);
            }
        });
        pp_Boleto.add(jmi_AddBoleto);

        jmi_modificarPeli.setText("Modificar");
        jmi_modificarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarPeliActionPerformed(evt);
            }
        });
        pp_Boleto.add(jmi_modificarPeli);

        jmi_eliminarPeli.setText("Eliminar");
        pp_Boleto.add(jmi_eliminarPeli);

        jmi_AddArticulo.setText("Agregar");
        jmi_AddArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AddArticuloActionPerformed(evt);
            }
        });
        pp_limpio.add(jmi_AddArticulo);

        jmi_modificarArticulo.setText("Modificar");
        jmi_modificarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarArticuloActionPerformed(evt);
            }
        });
        pp_limpio.add(jmi_modificarArticulo);

        jmi_eliminarArticulo.setText("Eliminar");
        pp_limpio.add(jmi_eliminarArticulo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CineEshta");

        jb_login.setText("Login");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });

        jLabel5.setText("Usuario");

        jLabel6.setText("Contraseña");

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Click Aca Para Registrar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_loginUser)
                            .addComponent(pf_loginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jb_login)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pf_loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_login)
                    .addComponent(jLabel7))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
        try {
            for (Empleado emp : lista_empleados) {
                if (tf_loginUser.getText().equals(emp.getUser()) && pf_loginPassword.getText().equals(emp.getPassword())) {
                    if (emp.getPuesto() == "dulces") {
                        jd_DULCE.setModal(true);
                        jd_DULCE.pack();
                        jd_DULCE.setLocationRelativeTo(this);
                        jd_DULCE.setVisible(true);
                    } else if (emp.getPuesto() == "boletos") {
                        jd_BOLETO.setModal(true);
                        jd_BOLETO.pack();
                        jd_BOLETO.setLocationRelativeTo(this);
                        jd_BOLETO.setVisible(true);
                    } else if (emp.getPuesto() == "aseo") {
                        jd_ASEO.setModal(true);
                        jd_ASEO.pack();
                        jd_ASEO.setLocationRelativeTo(this);
                        jd_ASEO.setVisible(true);
                    }
                }
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jb_loginMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        //boton registro
        jd_registro.setModal(true);
        jd_registro.pack();
        jd_registro.setLocationRelativeTo(this);
        jd_registro.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //boton registrar
        String name = tf_nombreR.getText();
        Date f = jdc_nacimiento.getDate();
        String us = tf_userR.getText();
        String pass = tf_passwordR.getText();
        String mail = tf_emailR.getText();
        String puesto = "";
        if (rb1.isSelected()) {
            puesto = "dulces";
            lista_dulceros.add(new EmpleadoDulceria(name, f, us, pass, mail, puesto));
        } else if (rb2.isSelected()) {
            puesto = "boletos";
            lista_boleteros.add(new EmpleadoBoleteria(name, f, us, pass, mail, puesto));
        } else if (rb3.isSelected()) {
            puesto = "aseo";
            lista_aseadores.add(new EmpleadoAseo(name, f, us, pass, mail, puesto));
        } else {
            puesto = null;
        }

        if (rb4.isSelected()) {
            //el admin
            administrador_p.setUser(us);
            administrador_p.setPassword(pass);
        }
        lista_empleados.add(new Empleado(name, f, us, pass, mail, puesto));
        JOptionPane.showMessageDialog(jd_registro, "Registrado exitosamente!");
        jd_registro.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jt_cine1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_cine1MouseClicked
        if (evt.isMetaDown()) {

        }
    }//GEN-LAST:event_jt_cine1MouseClicked

    private void jb_GuardarDulceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarDulceMouseClicked
        // guardar dulces
        String cat_dulce = cb_categoriaDulces.getSelectedItem().toString();
        DefaultListModel modeloLista = (DefaultListModel) jl_Dulces.getModel();
        modeloLista.addElement(new Dulce(tf_nombreDulce.getText(), tf_saborDulce.getText(), cat_dulce));


    }//GEN-LAST:event_jb_GuardarDulceMouseClicked

    private void jb_meterDulceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_meterDulceMouseClicked
        if (jl_Dulces.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloArbol = (DefaultTreeModel) jt_Dulce.getModel();
            DefaultListModel modeloLista = (DefaultListModel) jl_Dulces.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloArbol.getRoot();
            String nombre = ((Dulce) modeloLista.get(jl_Dulces.getSelectedIndex())).getNombre();
            String sabor = ((Dulce) modeloLista.get(jl_Dulces.getSelectedIndex())).getSabor();
            String categoria = ((Dulce) modeloLista.get(jl_Dulces.getSelectedIndex())).getCategoria();
            int centinela = -1;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(categoria)) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Dulce(nombre, sabor, categoria));
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                    centinela = 1;
                }
            }

            if (centinela == -1) {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(categoria);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Dulce(nombre, sabor, categoria));
                n.add(p);
                raiz.add(n);

            }
            modeloArbol.reload();
        }


    }//GEN-LAST:event_jb_meterDulceMouseClicked

    private void jb_GuardarDulce1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarDulce1MouseClicked
        //guardar pelicula
        String cat_peli = cb_categoriaPeliculas.getSelectedItem().toString();
        DefaultListModel modeloLista = (DefaultListModel) jl_Peliculas.getModel();
        modeloLista.addElement(new Pelicula(tf_nombrePelicula.getText(), tf_duracionPelicula.getText(), tf_clasificacionPelicula.getText(), cat_peli));

    }//GEN-LAST:event_jb_GuardarDulce1MouseClicked

    private void jb_meterPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_meterPeliculaMouseClicked
        // meter pelicula
        if (jl_Peliculas.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloArbol = (DefaultTreeModel) jt_Pelicula.getModel();
            DefaultListModel modeloLista = (DefaultListModel) jl_Peliculas.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloArbol.getRoot();
            String nombre = ((Pelicula) modeloLista.get(jl_Peliculas.getSelectedIndex())).getNombre();
            String duracion = ((Pelicula) modeloLista.get(jl_Peliculas.getSelectedIndex())).getDuracion();
            String clasif = ((Pelicula) modeloLista.get(jl_Peliculas.getSelectedIndex())).getClasificacion();
            String categoria = ((Pelicula) modeloLista.get(jl_Peliculas.getSelectedIndex())).getCategoria();
            int centinela = -1;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(categoria)) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Pelicula(nombre, duracion, clasif, categoria));
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                    centinela = 1;
                }
            }

            if (centinela == -1) {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(categoria);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Pelicula(nombre, duracion, clasif, categoria));
                n.add(p);
                raiz.add(n);

            }
            modeloArbol.reload();
        }

    }//GEN-LAST:event_jb_meterPeliculaMouseClicked

    private void jb_GuardarArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarArtMouseClicked
        // guardar articulo
        String cat_funcion = cb_categoriaFunciones.getSelectedItem().toString();
        DefaultListModel modeloLista = (DefaultListModel) jl_Limpieza.getModel();
        modeloLista.addElement(new Funcion(tf_nombreArticulo.getText(), ta_Descripcion.getText(), cat_funcion));
    }//GEN-LAST:event_jb_GuardarArtMouseClicked

    private void jb_meterArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_meterArtMouseClicked
        //meter al arbol
        if (jl_Limpieza.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloArbol = (DefaultTreeModel) jt_Limpieza.getModel();
            DefaultListModel modeloLista = (DefaultListModel) jl_Limpieza.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloArbol.getRoot();
            String nombre = ((Funcion) modeloLista.get(jl_Limpieza.getSelectedIndex())).getNombre();
            String descrip = ((Funcion) modeloLista.get(jl_Limpieza.getSelectedIndex())).getDescripcion();
            String func = ((Funcion) modeloLista.get(jl_Limpieza.getSelectedIndex())).getFuncion();
            int centinela = -1;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(func)) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Funcion(nombre, descrip, func));
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                    centinela = 1;
                }
            }

            if (centinela == -1) {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(func);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Funcion(nombre, descrip, func));
                n.add(p);
                raiz.add(n);

            }
            modeloArbol.reload();
        }
    }//GEN-LAST:event_jb_meterArtMouseClicked

    private void jt_DulceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_DulceMouseClicked
        if (evt.isMetaDown()) {
            pp_DULCE.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_DulceMouseClicked

    private void jmi_AddDulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AddDulceActionPerformed
        String nombre = JOptionPane.showInputDialog("Nombre: ");
        String sabor = JOptionPane.showInputDialog("Sabor: ");
        String cat_dulce = "";
        int categoria = Integer.parseInt(JOptionPane.showInputDialog("1. Chocolates\n"
                + "2. Gomitas\n"
                + "3. Paletas\n"
                + "4. Chicles"));
        switch (categoria) {
            case 1:
                cat_dulce = "Chocolates";
                break;
            case 2:
                cat_dulce = "Gomitas";
                break;
            case 3:
                cat_dulce = "Paletas";
                break;
            case 4:
                cat_dulce = "Chicles";
                break;
            default:
                JOptionPane.showMessageDialog(null, "No hay!");
        }

        DefaultListModel modeloLista = (DefaultListModel) jl_Dulces.getModel();
        modeloLista.addElement(new Dulce(tf_nombreDulce.getText(), tf_saborDulce.getText(), cat_dulce));

    }//GEN-LAST:event_jmi_AddDulceActionPerformed

    private void jt_PeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_PeliculaMouseClicked
        if (evt.isMetaDown()) {
            pp_Boleto.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_PeliculaMouseClicked

    private void jt_LimpiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_LimpiezaMouseClicked
        if (evt.isMetaDown()) {
            pp_limpio.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_LimpiezaMouseClicked

    private void jmi_AddBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AddBoletoActionPerformed
        // agregar boleto
        String nombre = JOptionPane.showInputDialog("Nombre: ");
        String sabor = JOptionPane.showInputDialog("Sabor: ");
        String cat_dulce = "";
        int categoria = Integer.parseInt(JOptionPane.showInputDialog("1. Chocolates\n"
                + "2. Gomitas\n"
                + "3. Paletas\n"
                + "4. Chicles"));
        switch (categoria) {
            case 1:
                cat_dulce = "Chocolates";
                break;
            case 2:
                cat_dulce = "Gomitas";
                break;
            case 3:
                cat_dulce = "Paletas";
                break;
            case 4:
                cat_dulce = "Chicles";
                break;
            default:
                JOptionPane.showMessageDialog(null, "No hay!");
        }
    }//GEN-LAST:event_jmi_AddBoletoActionPerformed

    private void jmi_AddArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AddArticuloActionPerformed
        // add articulo
        String nombre = JOptionPane.showInputDialog("Nombre: ");
        String descripcion = JOptionPane.showInputDialog("Sabor: ");
        String cat_func = "";
        int categoria = Integer.parseInt(JOptionPane.showInputDialog("1. Limpieza de Pisos\n"
                + "2. Limpieza de Vidrios\n"
                + "3. Limpieza de Mesas"));
        switch (categoria) {
            case 1:
                cat_func = "Limpieza de Pisos";
                break;
            case 2:
                cat_func = "Limpieza de Vidrios";
                break;
            case 3:
                cat_func = "Limpieza de Mesas";
                break;
            default:
                JOptionPane.showMessageDialog(null, "No hay!");
        }

        DefaultListModel modeloLista = (DefaultListModel) jl_Limpieza.getModel();
        modeloLista.addElement(new Funcion(nombre, descripcion, cat_func));
    }//GEN-LAST:event_jmi_AddArticuloActionPerformed

    private void jmi_modificarDulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarDulceActionPerformed
        int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea Modificar?"));
        switch (op) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "No Valido");
        }
    }//GEN-LAST:event_jmi_modificarDulceActionPerformed

    private void jmi_modificarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarPeliActionPerformed
        int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea Modificar?"));
        switch (op) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "No Valido");
        }
    }//GEN-LAST:event_jmi_modificarPeliActionPerformed

    private void jmi_modificarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarArticuloActionPerformed
        int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea Modificar?"));
        switch (op) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "No Valido");
        }
    }//GEN-LAST:event_jmi_modificarArticuloActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_categoriaDulces;
    private javax.swing.JComboBox<String> cb_categoriaFunciones;
    private javax.swing.JComboBox<String> cb_categoriaPeliculas;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton jb_GuardarArt;
    private javax.swing.JButton jb_GuardarDulce;
    private javax.swing.JButton jb_GuardarDulce1;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_meterArt;
    private javax.swing.JButton jb_meterDulce;
    private javax.swing.JButton jb_meterPelicula;
    private javax.swing.JDialog jd_ASEO;
    private javax.swing.JDialog jd_BOLETO;
    private javax.swing.JDialog jd_DULCE;
    private javax.swing.JDialog jd_Sistema;
    private javax.swing.JDialog jd_registro;
    private com.toedter.calendar.JDateChooser jdc_nacimiento;
    private javax.swing.JList<String> jl_Dulces;
    private javax.swing.JList<String> jl_Limpieza;
    private javax.swing.JList<String> jl_Peliculas;
    private javax.swing.JMenuItem jmi_AddArticulo;
    private javax.swing.JMenuItem jmi_AddBoleto;
    private javax.swing.JMenuItem jmi_AddDulce;
    private javax.swing.JMenuItem jmi_eliminarArticulo;
    private javax.swing.JMenuItem jmi_eliminarDulce;
    private javax.swing.JMenuItem jmi_eliminarPeli;
    private javax.swing.JMenuItem jmi_modificarArticulo;
    private javax.swing.JMenuItem jmi_modificarDulce;
    private javax.swing.JMenuItem jmi_modificarPeli;
    private javax.swing.JTree jt_Dulce;
    private javax.swing.JTree jt_Limpieza;
    private javax.swing.JTree jt_Pelicula;
    private javax.swing.JTree jt_cine1;
    private javax.swing.JPasswordField pf_loginPassword;
    private javax.swing.JPopupMenu pp_Boleto;
    private javax.swing.JPopupMenu pp_CRUD;
    private javax.swing.JPopupMenu pp_DULCE;
    private javax.swing.JPopupMenu pp_limpio;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTextArea ta_Descripcion;
    private javax.swing.JTextField tf_clasificacionPelicula;
    private javax.swing.JTextField tf_duracionPelicula;
    private javax.swing.JTextField tf_emailR;
    private javax.swing.JTextField tf_loginUser;
    private javax.swing.JTextField tf_nombreArticulo;
    private javax.swing.JTextField tf_nombreDulce;
    private javax.swing.JTextField tf_nombrePelicula;
    private javax.swing.JTextField tf_nombreR;
    private javax.swing.JTextField tf_passwordR;
    private javax.swing.JTextField tf_saborDulce;
    private javax.swing.JTextField tf_userR;
    // End of variables declaration//GEN-END:variables
ArrayList<Empleado> lista_empleados = new ArrayList<>();
    ArrayList<EmpleadoDulceria> lista_dulceros = new ArrayList<>();
    ArrayList<EmpleadoBoleteria> lista_boleteros = new ArrayList<>();
    ArrayList<EmpleadoAseo> lista_aseadores = new ArrayList<>();
    ArrayList<Dulce> lista_dulces = new ArrayList<>();

    Administrador administrador_p;
    DefaultMutableTreeNode nodo_seleccionado, dulce_seleccionado;

}
