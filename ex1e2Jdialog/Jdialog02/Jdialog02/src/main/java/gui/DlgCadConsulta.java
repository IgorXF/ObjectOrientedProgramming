/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import Gerenciadores.GerenciadorConsultas;
import classes.Consulta;
import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author igorxf
 */
public class DlgCadConsulta extends javax.swing.JDialog {
    public boolean editando;
    public String IdAntigo;
    public GerenciadorConsultas gerenciadorConsulta;
    
    public DlgCadConsulta(java.awt.Frame parent, boolean modal) throws FileNotFoundException {
        super(parent, modal);
        initComponents();
         this.editando = false;
        this.IdAntigo = "";
        this.gerenciadorConsulta = new GerenciadorConsultas();
        this.habilitarCampos(true);
        this.limparCampos();
        
        gerenciadorConsulta.carregarDoArquivo("ListagemConsultas.xml");
        txtConsultasCad.setText(gerenciadorConsulta.toString());
    }
    
    
     public void habilitarCampos(boolean flag) {
        txtDataHora.setEnabled(flag);
        txtId.setEnabled(flag);
    }
     
     public void limparCampos() {
        txtDataHora.setText("");
        txtId.setText("");
    }

    public void objetoParaCampos(Consulta p) {
        txtDataHora.setText(p.getDataHora() + "");
        txtId.setText(p.getId()+"");
    }
    
    public Consulta camposParaObjeto() {
        Consulta p = new Consulta();
        p.setId(txtId.getText());
        p.setDataHora(txtDataHora.getText());
        
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
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSelectMed = new javax.swing.JButton();
        btnSelectPaciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDataHora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsultasCad = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnCadConsulta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Id:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 20, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 110, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 18, -1, -1));

        btnSelectMed.setText("Selecionar Med");
        btnSelectMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectMedActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        btnSelectPaciente.setText("Selecionar Paciente");
        btnSelectPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel1.setText("Data/Hora");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        txtDataHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataHoraActionPerformed(evt);
            }
        });
        jPanel1.add(txtDataHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 110, -1));

        txtConsultasCad.setColumns(20);
        txtConsultasCad.setRows(5);
        jScrollPane1.setViewportView(txtConsultasCad);

        btnCadConsulta.setText("Cadastrar");
        btnCadConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadConsulta)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnCadConsulta)
                .addGap(16, 16, 16))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Cadastro de Consultas");
        jPanel3.add(jLabel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectMedActionPerformed
        try {
            DlgSelecionarMedico tela = new DlgSelecionarMedico(new Frame(), true);
            tela.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DlgCadConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelectMedActionPerformed

    private void btnCadConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadConsultaActionPerformed
        Consulta c = this.camposParaObjeto();
        if(this.editando){
            gerenciadorConsulta.atualizarConsulta(IdAntigo, c);
        }else{
            gerenciadorConsulta.addConsulta(c);
        }

        
        //No final reset a tela
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

        String listagem = gerenciadorConsulta.toString();
        
        txtConsultasCad.setText(listagem);
        
        try {
            gerenciadorConsulta.salvarNoArquivo("ListagemConsultas.xml");
        } catch (IOException ex) {
            Logger.getLogger(DlgCadConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        habilitarCampos(true);
    }//GEN-LAST:event_btnCadConsultaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        //:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSelectPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPacienteActionPerformed
        try {
            DlgSelecionarPaciente tela = new DlgSelecionarPaciente(new Frame(), true);
            tela.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DlgCadConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelectPacienteActionPerformed

    private void txtDataHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataHoraActionPerformed
        
    }//GEN-LAST:event_txtDataHoraActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadConsulta;
    private javax.swing.JButton btnSelectMed;
    private javax.swing.JButton btnSelectPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConsultasCad;
    private javax.swing.JTextField txtDataHora;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
