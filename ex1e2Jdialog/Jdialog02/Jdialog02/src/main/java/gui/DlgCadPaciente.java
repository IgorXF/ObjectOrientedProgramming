/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import Gerenciadores.GerenciadorPacientes;
import classes.Paciente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author igorxf
 */
public class DlgCadPaciente extends javax.swing.JDialog {
    private boolean editando;
    private String cpfEscolhido;
    private Paciente pessoaEditando;
    private GerenciadorPacientes gerenciadorPacientes;
    
    public DlgCadPaciente(java.awt.Frame parent, boolean modal) throws FileNotFoundException {
        super(parent, modal);
        initComponents();
        this.gerenciadorPacientes = new GerenciadorPacientes();
        this.pessoaEditando = new Paciente();
        this.editando = false;
        this.cpfEscolhido = "";
        
        this.habilitarCampos(true);
        this.limparCampos();
        
        gerenciadorPacientes.carregarDoArquivo("ListagemPacientes.xml");
        String listagem = this.gerenciadorPacientes.toString();
        txtPacientesCad.setText(listagem);
    }
    
     
     public void habilitarCampos(boolean flag) {
        txtNomePaciente.setEnabled(flag);
        txtHistorico.setEnabled(flag);
        txtDataNascimento.setEnabled(flag);
        txtCPFCad.setEnabled(flag);
    }

    public void limparCampos() {
        txtNomePaciente.setText("");
        txtHistorico.setText("");
        txtDataNascimento.setText("");
        txtCPFCad.setText("");
    }

    public void objetoParaCampos(Paciente p) {
        txtNomePaciente.setText(p.getNome());
        txtHistorico.setText(p.getHistoricoMedico());
        txtDataNascimento.setText(p.getDataNascimento() + "");
        txtCPFCad.setText(p.getCpf() + "");

    }
    
    public Paciente camposParaObjeto() {
        Paciente p = new Paciente();

        p.setNome(txtNomePaciente.getText());
        
        p.setHistoricoMedico(txtHistorico.getText());

        p.setDataNascimento(txtDataNascimento.getText());
        
        p.setCpf(txtCPFCad.getText());

        return p;
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
        jLabel1 = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCPFCad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHistorico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPacientesCad = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnCadPaciente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));
        jPanel1.add(txtNomePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 5, 110, -1));

        jLabel2.setText("CPF");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 10, -1, -1));

        txtCPFCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFCadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCPFCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 5, 140, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Data de Nascimento");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(txtDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 5, 110, -1));

        jLabel4.setText("Historico");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));
        jPanel2.add(txtHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 100, 30));

        txtPacientesCad.setColumns(20);
        txtPacientesCad.setRows(5);
        jScrollPane1.setViewportView(txtPacientesCad);

        btnCadPaciente.setText("Cadastrar");
        btnCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadPaciente)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(btnCadPaciente)
                .addGap(19, 19, 19))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Cadastro de Paciente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPacienteActionPerformed
        try {
            Paciente novaPaciente = this.camposParaObjeto();
            
            if (this.editando) {
                this.gerenciadorPacientes.atualizarPaciente(cpfEscolhido, novaPaciente);
            } else { //Estou inserindo
                this.gerenciadorPacientes.addPaciente(novaPaciente);
            }
            
            this.limparCampos();
            this.habilitarCampos(false);
            
            String listagem = gerenciadorPacientes.toString();
            txtPacientesCad.setText(listagem);
            
            this.gerenciadorPacientes.salvarNoArquivo("ListagemPacientes.xml");
        } catch (IOException ex) {
            Logger.getLogger(DlgCadPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadPacienteActionPerformed

    private void txtCPFCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFCadActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCPFCad;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtHistorico;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextArea txtPacientesCad;
    // End of variables declaration//GEN-END:variables
}
