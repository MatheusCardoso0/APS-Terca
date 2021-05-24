package bd.visual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Matheus Cardoso
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    public Buscar() {
        initComponents();
        this.setLocationRelativeTo(null); //aparece no meio da tela

        //ordena a tabela
        DefaultTableModel modelo = (DefaultTableModel) tblBusca.getModel();
        tblBusca.setRowSorter(new TableRowSorter(modelo));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaBusca = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBusca = new javax.swing.JTable();
        txtBsuca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCliente2 = new javax.swing.JTextField();
        btnSeguradora2 = new javax.swing.JComboBox<String>();
        btnSeguro2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEnderecoNumero2 = new javax.swing.JTextField();
        txtComplemento2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nascimento2 = new com.toedter.calendar.JDateChooser();
        vigencia2 = new com.toedter.calendar.JDateChooser();
        txtTelefone2 = new javax.swing.JFormattedTextField();
        txtCpf2 = new javax.swing.JFormattedTextField();
        txtCnpj2 = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tabelaBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "CNPJ", "Data Nascimento", "Endereço", "Número", "Complemento", "E-mail", "Telefone", "Tipo Seguro", "Seguradora", "Data Vigência"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaBusca);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca e edição de Clientes");

        jScrollPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyReleased(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(2211, 335));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
        });

        tblBusca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "CNPJ", "DATA DE NASCIMENTO", "ENDEREÇO", "NÚMERO", "COMPLEMENTO", "EMAIL", "TELEFONE", "TIPO DE SEGURO", "SEGURADORA", "DATA DE VIGÊNCIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBusca.getTableHeader().setReorderingAllowed(false);
        tblBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaMouseClicked(evt);
            }
        });
        tblBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblBuscaKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblBusca);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nome:");

        jLabel4.setText("Tipo do Seguro: ");

        jLabel5.setText("CPF: ");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Dados Cliente");

        jLabel19.setText("CNPJ: ");

        txtCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCliente2ActionPerformed(evt);
            }
        });

        btnSeguradora2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Allianz Seguros", "Amil", "Azul Seguros", "Bradesco Seguros", "Itaú Seguros", "Liberty Seguros", "Mapfre Seguros", "NotreDame", "Porto Seguro", "Sompo Seguros", "Suhai", "SulAmérica ", "Tokio Marine", "Zurich Seguros" }));
        btnSeguradora2.setActionCommand("fdfdsdsadsadsadas\ndas\ndas\ndas\ndas\ndas\ndas\ndas\ndas\n");
        btnSeguradora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguradora2ActionPerformed(evt);
            }
        });

        btnSeguro2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Automóvel", "Empresarial", "Equipamento Portáteis", "Financiamento", "Pet", "PME", "Saúde", "Vida", " " }));
        btnSeguro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguro2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço: ");

        jLabel6.setText("E-mail: ");

        jLabel7.setText("Data de Nascimento: ");

        jLabel8.setText("Seguradora: ");

        jLabel9.setText("Data de Vigência: ");

        jLabel10.setText("Telefone: ");

        jLabel12.setText("Nº");

        jLabel13.setText("Complemento: ");

        try {
            txtTelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpf2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCnpj2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nascimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCnpj2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vigencia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSeguro2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComplemento2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnderecoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeguradora2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCpf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtCnpj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(nascimento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnSeguro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtEnderecoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtComplemento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeguradora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(vigencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar pg.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtBsuca, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel14))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(btnAtualizar)
                                .addGap(106, 106, 106)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1046, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBsuca)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (tblBusca.getSelectedRow() != -1) // verifica se tem alguma linha selecionada
        {

            int linha = tblBusca.getSelectedRow();
            try {

                //faz a conexão com o banco de dados
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/trabalhointerface", "root", "");
                java.sql.Statement stm = conn.createStatement();
                String sql = null;

                String nome = "Deletar o cliente de Nome: " + tblBusca.getValueAt(linha, 1).toString() + " ?";
                int opcao_escolhida = JOptionPane.showConfirmDialog(null, nome, "Exclusão ", JOptionPane.YES_NO_OPTION);
                if (opcao_escolhida == JOptionPane.YES_OPTION) {
                    sql = "Select * from usuario WHERE Nome= " + (tblBusca.getValueAt(linha, 1));
                    int conseguiu_excluir = stm.executeUpdate("DELETE FROM usuario WHERE Nome='" + (tblBusca.getValueAt(linha, 1).toString()) + "'");
                    DefaultTableModel modelo1 = (DefaultTableModel) tblBusca.getModel();
                    modelo1.removeRow(linha);
                    tblBusca.setModel(modelo1);
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");

                    txtCliente2.setText("");
                    txtCpf2.setText("");
                    txtCnpj2.setText("");
                    nascimento2.setDate(null);
                    txtEndereco2.setText("");
                    txtEnderecoNumero2.setText("");
                    txtComplemento2.setText("");
                    txtEmail2.setText("");
                    txtTelefone2.setText("");
                    btnSeguro2.setSelectedItem("Selecione");
                    btnSeguradora2.setSelectedItem("Selecione");
                    vigencia2.setDate(null);

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro a tentar excluir o registro...");
            } catch (ClassNotFoundException e) {
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um nome para excluir");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        btnAtualizar.setEnabled(true);
        btnExcluir.setEnabled(true);

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //faz a conexão com o banco de dados
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/trabalhointerface", "root", "");
            String sql = "Select * from usuario WHERE nome LIKE'" + "%" + this.txtBsuca.getText() + "%" + "'";
            //o "%" é para buscar tudo que termina e começa com o que foi pesquisado

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tblBusca.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {

                //monta a tabela, as linhas
                modelo.addRow(new Object[]{rs.getString("id"), rs.getString("Nome"), rs.getString("Cpf"), rs.getString("Cnpj"), rs.getString("DataNascimento"), rs.getString("Endereco"),
                    rs.getString("Numero"), rs.getString("Complemento"), rs.getString("Email"), rs.getString("Telefone"), rs.getString("TipoSeguro"), rs.getString("Seguradora"), rs.getString("DataVigencia")});

            }

            rs.close();

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        //faz a conversão das datas 
        java.sql.Date data1 = new java.sql.Date(nascimento2.getDate().getTime());
        java.sql.Date data2 = new java.sql.Date(vigencia2.getDate().getTime());
        int linha = tblBusca.getSelectedRow();

        if (tblBusca.getSelectedRow() != -1) {
            int opcao_escolhida22 = JOptionPane.showConfirmDialog(null, "Deseja mesmo atualizar o cliente " + tblBusca.getValueAt(linha, 1).toString() + " ?", "", JOptionPane.YES_NO_OPTION);
            if (opcao_escolhida22 == JOptionPane.YES_OPTION) {

                try {

                    //faz a conexão com o banco de dados    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/trabalhointerface", "root", "");
                    java.sql.Statement stm = conn.createStatement();

                    stm.executeUpdate("UPDATE usuario SET Nome='" + txtCliente2.getText() + "'" //primeira linha ele pega o novo dado para ser alterado
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'"); //segunda linha ele pega o cadastro que deverá ser atualizado com os dados pego acima    
                    stm.executeUpdate("UPDATE usuario SET Cpf='" + txtCpf2.getText() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET Cnpj='" + txtCnpj2.getText() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET DataNascimento='" + data1 + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET Endereco='" + txtEndereco2.getText() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET Numero='" + txtEnderecoNumero2.getText() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET Complemento='" + txtComplemento2.getText() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET Email='" + txtEmail2.getText() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET Telefone='" + txtTelefone2.getText() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET TipoSeguro='" + btnSeguro2.getSelectedItem() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET Seguradora='" + btnSeguradora2.getSelectedItem() + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");
                    stm.executeUpdate("UPDATE usuario SET DataVigencia='" + data2 + "'"
                            + "WHERE Nome='" + (tblBusca.getValueAt(linha, 1)) + "'");

                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");

                    txtCliente2.setText("");
                    txtCpf2.setText("00000000000");
                    txtCnpj2.setText("00000000000000");
                    txtEndereco2.setText("");
                    txtEnderecoNumero2.setText("");
                    txtComplemento2.setText("");
                    nascimento2.setDate(null);
                    vigencia2.setDate(null);
                    txtEmail2.setText("");
                    txtTelefone2.setText("00000000000");
                    btnSeguro2.setSelectedItem("Selecione...");
                    btnSeguradora2.setSelectedItem("Selecione...");

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro a tentar Atualizar o registro...");
                } catch (ClassNotFoundException e) {
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um nome para excluir");
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked

    }//GEN-LAST:event_jScrollPane3MouseClicked

    private void txtCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliente2ActionPerformed

    private void btnSeguradora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguradora2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeguradora2ActionPerformed

    private void btnSeguro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeguro2ActionPerformed

    private void tblBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaMouseClicked
        try {
            //faz a conversão das datas
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 4));
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 12));

            if (tblBusca.getSelectedRow() != -1) {

                //puxa os dados da tabela para aparecer nos campos de cadastro
                txtCliente2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 1));
                txtCpf2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 2));
                txtCnpj2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 3));
                nascimento2.setDate(date);
                txtEndereco2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 5));
                txtEnderecoNumero2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 6));
                txtComplemento2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 7));
                txtEmail2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 8));
                txtTelefone2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 9));
                btnSeguro2.setSelectedItem(tblBusca.getValueAt(tblBusca.getSelectedRow(), 10));
                btnSeguradora2.setSelectedItem(tblBusca.getValueAt(tblBusca.getSelectedRow(), 11));
                vigencia2.setDate(date2);

            }
        } catch (ParseException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblBuscaMouseClicked

    private void jScrollPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1KeyReleased

    private void tblBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBuscaKeyReleased
        try {
            //faz a conversão das datas
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 4));
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 12));

            if (tblBusca.getSelectedRow() != -1) {

                //puxa os dados da tabela para aparecer nos campos de cadastro
                txtCliente2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 1));
                txtCpf2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 2));
                txtCnpj2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 3));
                nascimento2.setDate(date);
                txtEndereco2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 5));
                txtEnderecoNumero2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 6));
                txtComplemento2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 7));
                txtEmail2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 8));
                txtTelefone2.setText((String) tblBusca.getValueAt(tblBusca.getSelectedRow(), 9));
                btnSeguro2.setSelectedItem(tblBusca.getValueAt(tblBusca.getSelectedRow(), 10));
                btnSeguradora2.setSelectedItem(tblBusca.getValueAt(tblBusca.getSelectedRow(), 11));
                vigencia2.setDate(date2);

            }
        } catch (ParseException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblBuscaKeyReleased

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCliente2.setText("");
        txtCpf2.setText("00000000000");
        txtCnpj2.setText("00000000000000");
        txtEndereco2.setText("");
        txtEnderecoNumero2.setText("");
        txtComplemento2.setText("");
        nascimento2.setDate(null);
        vigencia2.setDate(null);
        txtEmail2.setText("");
        txtTelefone2.setText("00000000000");
        btnSeguro2.setSelectedItem("Selecione...");
        btnSeguradora2.setSelectedItem("Selecione...");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //faz a conexão com o banco de dados
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/trabalhointerface", "root", "");
            String sql = "Select * from usuario WHERE nome LIKE'" + "%" + this.txtBsuca.getText() + "%" + "'";
            //o "%" é para buscar tudo que termina e começa com o que foi pesquisado

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tblBusca.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {

                //monta a tabela, as linhas
                modelo.addRow(new Object[]{rs.getString("id"), rs.getString("Nome"), rs.getString("Cpf"), rs.getString("Cnpj"), rs.getString("DataNascimento"), rs.getString("Endereco"),
                    rs.getString("Numero"), rs.getString("Complemento"), rs.getString("Email"), rs.getString("Telefone"), rs.getString("TipoSeguro"), rs.getString("Seguradora"), rs.getString("DataVigencia")});

            }

            rs.close();

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> btnSeguradora2;
    private javax.swing.JComboBox btnSeguro2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser nascimento2;
    private javax.swing.JTable tabelaBusca;
    private javax.swing.JTable tblBusca;
    private javax.swing.JTextField txtBsuca;
    private javax.swing.JTextField txtCliente2;
    private javax.swing.JFormattedTextField txtCnpj2;
    private javax.swing.JTextField txtComplemento2;
    private javax.swing.JFormattedTextField txtCpf2;
    private javax.swing.JTextField txtEmail2;
    private javax.swing.JTextField txtEndereco2;
    private javax.swing.JTextField txtEnderecoNumero2;
    private javax.swing.JFormattedTextField txtTelefone2;
    private com.toedter.calendar.JDateChooser vigencia2;
    // End of variables declaration//GEN-END:variables

}
