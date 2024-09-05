/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.projescolamvc.view;



import com.mycompany.projescolamvc.connection.SQLiteConnector;
import com.mycompany.projescolamvc.controller.ProfessorController;
import com.mycompany.projescolamvc.view.tablemodels.TMCadAluno;
import com.mycompany.projescolamvc.view.tablemodels.TMCadProfessor;
import com.mycompany.projescolamvc.model.dao.IDao;
import com.mycompany.projescolamvc.model.dao.ProfessorDAOBanco;
import com.mycompany.projescolamvc.model.dao.ProfessorDAOFile;
import com.mycompany.projescolamvc.model.entities.Professor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author  igorxf
 */
public class JDialogProfessor extends javax.swing.JDialog {
    
    private boolean editando;
    private String cpfAntigo;
    private ProfessorController professorController;


    public JDialogProfessor(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        this.editando = false;
        this.cpfAntigo = "";
        
        //IDao professorDao = new ProfessorDAOFile("ListagemProfessores.json");
        
        SQLiteConnector conexao = new SQLiteConnector("banco.sqlite");
        IDao professorDao = new ProfessorDAOBanco(conexao.getConnection());
        this.professorController = new ProfessorController(professorDao);
        
        initComponents();
        setLocationRelativeTo(parent);
    
        this.habilitarCampos(false);
        this.limparCampos();

        this.atualizarTabela();
    }
    
    public JDialogProfessor(java.awt.Dialog parent, boolean modal) throws SQLException {
        super(parent, modal);
        this.editando = false;
        this.cpfAntigo = "";
        
        //IDao professorDao = new ProfessorDAOFile("ListagemProfessores.json");
        
        SQLiteConnector conexao = new SQLiteConnector("banco.sqlite");
        IDao professorDao = new ProfessorDAOBanco(conexao.getConnection());
        this.professorController = new ProfessorController(professorDao);
        
        initComponents();
        setLocationRelativeTo(parent);
    
        this.habilitarCampos(false);
        this.limparCampos();

        this.atualizarTabela();
    }
        public void habilitarCampos(boolean flag) {
        edtNome.setEnabled(flag);
        edtIdade.setEnabled(flag);
        edtSexo.setEnabled(flag);
        edtCpf.setEnabled(flag);
    }

    public void limparCampos() {
        edtNome.setText("");
        edtIdade.setText("");
        edtSexo.setText("");
        edtCpf.setText("");
    }

    public void objetoParaCampos(Professor p) {
       edtNome.setText(p.getNome());
       edtIdade.setText(p.getIdade() + "");
       edtSexo.setText(p.getSexo());
       edtCpf.setText(p.getCpf());

    }


    public JDialogProfessor(JFrameDepartamento aThis, boolean b, Professor newProfessor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblProf = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEdt = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        edtIdade = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        edtSexo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdProfessor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        lblProf.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        lblProf.setForeground(new java.awt.Color(255, 255, 255));
        lblProf.setText(" Professor ");
        jPanel1.add(lblProf);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

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

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir);

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar);

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 51, 0, 0);
        jPanel3.add(lblNome, gridBagConstraints);

        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 179;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 6, 0, 0);
        jPanel3.add(edtNome, gridBagConstraints);

        lblIdade.setForeground(new java.awt.Color(255, 255, 255));
        lblIdade.setText("Idade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 64, 0, 0);
        jPanel3.add(lblIdade, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 12, 0, 54);
        jPanel3.add(edtIdade, gridBagConstraints);

        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 63, 0, 0);
        jPanel3.add(lblCpf, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 179;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 6, 29, 0);
        jPanel3.add(edtCpf, gridBagConstraints);

        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 74, 0, 0);
        jPanel3.add(lblSexo, gridBagConstraints);

        edtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSexoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 12, 29, 54);
        jPanel3.add(edtSexo, gridBagConstraints);

        grdProfessor.setBackground(new java.awt.Color(255, 255, 255));
        grdProfessor.setForeground(new java.awt.Color(0, 0, 0));
        grdProfessor.setModel(new javax.swing.table.DefaultTableModel(
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
        grdProfessor.setSelectionBackground(new java.awt.Color(0, 102, 102));
        grdProfessor.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(grdProfessor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdtActionPerformed
        Professor professorEscolhido = this.getObjetoSelecionadoNaGrid();
       
       String CPFEscolhido = professorEscolhido.getCpf();

        Professor professorEditando = professorController.buscarProfessor(CPFEscolhido);

        if (professorEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe Professor com esse cpf.");
            this.editando = false;
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            
            this.objetoParaCampos(professorEditando);
            this.editando = true;
            this.cpfAntigo = professorEditando.getCpf();
        }

    }//GEN-LAST:event_btnEdtActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limparCampos();
        this.habilitarCampos(true);
        this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.limparCampos();
       this.habilitarCampos(false);
       this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Professor profv = professorController.buscarProfessor(edtCpf.getText());
        if (this.editando == true) {
            if(cpfAntigo == null ? edtCpf.getText() == null : cpfAntigo.equals(edtCpf.getText())){
                this.professorController.atualizarProfessor(cpfAntigo, edtCpf.getText(), edtNome.getText(), edtIdade.getText(), edtSexo.getText());
            }else if(profv == null)
                this.professorController.atualizarProfessor(cpfAntigo, edtCpf.getText(), edtNome.getText(), edtIdade.getText(), edtSexo.getText());
            else 
                JOptionPane.showMessageDialog(this, "Já existe um professor com esse cpf");
        } else { //Estou inserindo
            if(profv == null){
                this.professorController.adicionarProfessor(edtCpf.getText(), edtNome.getText(), edtIdade.getText(), edtSexo.getText());
            }else  {
                JOptionPane.showMessageDialog(this, "Já existe um professors com esse cpf");
            }
        }

        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

        this.atualizarTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Professor professorEscolhido = this.getObjetoSelecionadoNaGrid();
        
        String cpfEscolhido = professorEscolhido.getCpf();
        
        Professor p = professorController.buscarProfessor(cpfEscolhido);

        if (p == null) {
            JOptionPane.showMessageDialog(this, "Não existe professor com este CPF.");
        } else {
            this.professorController.removerProfessor(cpfEscolhido);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        }

        this.atualizarTabela();


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void edtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSexoActionPerformed

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed
    
    private void grdProfessorMouseClicked(java.awt.event.MouseEvent evt) {                                       
       Professor p = this.getObjetoSelecionadoNaGrid();
       this.objetoParaCampos(p);
    }
    
    public Professor getObjetoSelecionadoNaGrid() {
        int linhaSelecionada = grdProfessor.getSelectedRow();

        if (linhaSelecionada >= 0) {
            TMCadProfessor tmCadAluno = (TMCadProfessor) grdProfessor.getModel();

            Professor p = tmCadAluno.getObjetoAluno(linhaSelecionada);
            return p;
        }
        
        return null;
    }
    
    public void atualizarTabela() {
    
        List<Professor> lista = this.professorController.listarProfessores();
        TMCadProfessor tmcadprofessor = new TMCadProfessor(lista);
        grdProfessor.setModel(tmcadprofessor);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEdt;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JTable grdProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProf;
    private javax.swing.JLabel lblSexo;
    // End of variables declaration//GEN-END:variables
}
