package gui;

import gui.dialogs.JDialogProf;
import classe.Professor;
import gui.dialogs.JDialogAluno;
import gui.dialogs.JDialogDisciplina;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class JFrameEscola extends javax.swing.JFrame {

    /**
     * Creates new form JFrameEscola
     */
    public JFrameEscola() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lblEscola = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAluno = new javax.swing.JButton();
        btnProf = new javax.swing.JButton();
        btnDisciplina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblEscola.setBackground(new java.awt.Color(0, 0, 0));
        lblEscola.setFont(new java.awt.Font("Edwardian Script ITC", 2, 48)); // NOI18N
        lblEscola.setForeground(new java.awt.Color(0, 0, 0));
        lblEscola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscola.setText("Escola");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnAluno.setBackground(new java.awt.Color(0, 0, 0));
        btnAluno.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        btnAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnAluno.setText("Aluno");
        btnAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAluno);

        btnProf.setBackground(new java.awt.Color(0, 0, 0));
        btnProf.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        btnProf.setForeground(new java.awt.Color(255, 255, 255));
        btnProf.setText("Professor");
        btnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfActionPerformed(evt);
            }
        });
        jPanel2.add(btnProf);

        btnDisciplina.setBackground(new java.awt.Color(0, 0, 0));
        btnDisciplina.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        btnDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        btnDisciplina.setText("Disciplina");
        btnDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisciplinaActionPerformed(evt);
            }
        });
        jPanel2.add(btnDisciplina);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        txt.setBackground(new java.awt.Color(255, 255, 255));
        txt.setColumns(20);
        txt.setForeground(new java.awt.Color(0, 0, 0));
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfActionPerformed

        JDialogProf telaProf = new JDialogProf(this, true);
        telaProf.setVisible(true);
    }//GEN-LAST:event_btnProfActionPerformed

    private void btnDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisciplinaActionPerformed
       JDialogDisciplina telaDisciplina = new JDialogDisciplina(this, true);
       telaDisciplina.setVisible(true);
    }//GEN-LAST:event_btnDisciplinaActionPerformed

    private void btnAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunoActionPerformed
       JDialogAluno telaAluno = new JDialogAluno(this,true);
       telaAluno.setVisible(true);
    }//GEN-LAST:event_btnAlunoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAluno;
    private javax.swing.JButton btnDisciplina;
    private javax.swing.JButton btnProf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEscola;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
