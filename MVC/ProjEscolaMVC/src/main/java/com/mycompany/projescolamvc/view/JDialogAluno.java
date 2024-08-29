/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.projescolamvc.view;


import com.mycompany.projescolamvc.connection.SQLiteConnector;
import com.mycompany.projescolamvc.controller.AlunoController;
import com.mycompany.projescolamvc.view.tablemodels.TMCadAluno;
import com.mycompany.projescolamvc.model.dao.AlunoDAOBanco;
import com.mycompany.projescolamvc.model.dao.AlunoDAOFile;
import com.mycompany.projescolamvc.model.dao.IDao;
import com.mycompany.projescolamvc.model.entities.Aluno;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author  igorxf
 */
public class JDialogAluno extends javax.swing.JDialog {
    
    private boolean editando;
    private String cpfAntigo;
    private AlunoController alunoController;
    
    
public JDialogAluno(java.awt.Frame parent, boolean modal) throws SQLException {
    super(parent, modal);
    this.editando = false;
    this.cpfAntigo = "";
    
    //IDao alunoDao = new AlunoDAOFile("ListagemAlunos.json");
    
    SQLiteConnector conexao = new SQLiteConnector("banco.sqlite");
    IDao alunoDao = new AlunoDAOBanco(conexao.getConnection());
    
    this.alunoController = new AlunoController(alunoDao);
    
    
    initComponents();
    setLocationRelativeTo(parent);
    initData();
}

public JDialogAluno(java.awt.Dialog parent, boolean modal) throws SQLException {
    super(parent, modal);
    this.editando = false;
    this.cpfAntigo = "";
    
    SQLiteConnector conexao = new SQLiteConnector("bancoA.sqlite");
    IDao alunoDao = new AlunoDAOBanco(conexao.getConnection());
    this.alunoController = new AlunoController(alunoDao);
    
    initComponents();
    setLocationRelativeTo(parent);
    initData();
}

private void initData() {
    this.habilitarCampos(false);
    this.limparCampos();

    this.atualizarTabela();
}

    public void habilitarCampos(boolean flag) {
        txtCPF.setEnabled(flag);
        txtMatricula.setEnabled(flag);
        txtNome.setEnabled(flag);
        txtIdade.setEnabled(flag);
        txtAnoIngresso.setEnabled(flag);
    }

    public void limparCampos() {
        txtCPF.setText("");
        txtMatricula.setText("");
        txtNome.setText("");
        txtIdade.setText("");
        txtAnoIngresso.setText("");
    }

    public void objetoParaCampos(Aluno p) {
       txtCPF.setText(p.getCpf());
       txtMatricula.setText(p.getMatricula());
       txtNome.setText(p.getNome());
       txtIdade.setText(p.getIdade() + "");
       txtAnoIngresso.setText(p.getAnoIngresso()+ "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAluno = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEdt = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        lblAnoIngresso = new javax.swing.JLabel();
        txtAnoIngresso = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lblAluno.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAluno.setForeground(new java.awt.Color(0, 0, 0));
        lblAluno.setText("Aluno ");
        jPanel1.add(lblAluno);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnNovo.setBackground(new java.awt.Color(204, 204, 204));
        btnNovo.setForeground(new java.awt.Color(0, 0, 0));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovo);

        btnEdt.setBackground(new java.awt.Color(204, 204, 204));
        btnEdt.setForeground(new java.awt.Color(0, 0, 0));
        btnEdt.setText("Editar");
        btnEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdtActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdt);

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar);

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        lblMatricula.setForeground(new java.awt.Color(0, 0, 0));
        lblMatricula.setText("Matricula");

        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome");

        lblIdade.setForeground(new java.awt.Color(0, 0, 0));
        lblIdade.setText("Idade");

        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        lblAnoIngresso.setForeground(new java.awt.Color(0, 0, 0));
        lblAnoIngresso.setText("Ano Ingresso");

        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("CPF");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(lblMatricula))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIdade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnoIngresso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAnoIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNome))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMatricula)
                        .addComponent(lblCPF)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnoIngresso)
                    .addComponent(txtAnoIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        grdAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(grdAluno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (this.editando == true) {
            this.alunoController.atualizarAluno(cpfAntigo, txtNome.getText(), txtIdade.getText(), txtMatricula.getText(), txtAnoIngresso.getText());
        } else { //Estou inserindo
            this.alunoController.adicionarAluno(txtCPF.getText(), txtNome.getText(), txtIdade.getText(), txtMatricula.getText(), txtAnoIngresso.getText());
        }

        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

        this.atualizarTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Aluno alunoEscolhido = this.getObjetoSelecionadoNaGrid();
        
        String cpfEscolhido = alunoEscolhido.getCpf();
        
        Aluno a = alunoController.buscarAluno(cpfEscolhido);

        if (a == null) {
            JOptionPane.showMessageDialog(this, "Não existe aluno com este CPF.");
        } else {
            this.alunoController.removerAluno(cpfEscolhido);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        }

        this.atualizarTabela();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdtActionPerformed
       Aluno alunoEscolhido = this.getObjetoSelecionadoNaGrid();
       
       String CPFEscolhido = alunoEscolhido.getCpf();

        Aluno alunoEditando = alunoController.buscarAluno(CPFEscolhido);

        if (alunoEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe aluno com esse cpf.");
            this.editando = false;
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            
            this.objetoParaCampos(alunoEditando);
            this.editando = true;
            this.cpfAntigo = alunoEditando.getCpf();
        }

    }//GEN-LAST:event_btnEdtActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed
    
    private void grdAlunoMouseClicked(java.awt.event.MouseEvent evt) {                                       
       Aluno a = this.getObjetoSelecionadoNaGrid();
       this.objetoParaCampos(a);
    }
    
    public Aluno getObjetoSelecionadoNaGrid() {
        int linhaSelecionada = grdAluno.getSelectedRow();

        if (linhaSelecionada >= 0) {
            TMCadAluno tmCadAluno = (TMCadAluno) grdAluno.getModel();

             Aluno aluno = tmCadAluno.getObjetoAluno(linhaSelecionada);
            return aluno;
        }
        
        return null;
    }
    
    public void atualizarTabela() {
        List<Aluno> lista = this.alunoController.listarAlunos();
        TMCadAluno tmcadaluno = new TMCadAluno(lista);
        grdAluno.setModel(tmcadaluno);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEdt;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTable grdAluno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblAnoIngresso;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtAnoIngresso;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
