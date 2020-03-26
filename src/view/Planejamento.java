/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoPlanejamentos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Planejamentos;

/**
 *
 * @author lcluc
 */
public class Planejamento extends javax.swing.JFrame {

    /**
     * Creates new form Planejamento
     */
    public Planejamento() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) tbPlanejamentos.getModel();
        tbPlanejamentos.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }
    
    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) tbPlanejamentos.getModel();
        modelo.setNumRows(0);
        DaoPlanejamentos dp = new DaoPlanejamentos();

        for (Planejamentos p : dp.getPlanejamentos()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getDisciplina(),
                p.getHorario_inicio(),
                p.getHorario_encerramento(),
                });

        }

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
        lbPlanejamento = new javax.swing.JLabel();
        lbDisciplina = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        lbEncerramento = new javax.swing.JLabel();
        edDisciplina = new javax.swing.JTextField();
        edInicio = new javax.swing.JTextField();
        edEncerramento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPlanejamentos = new javax.swing.JTable();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpcoes = new javax.swing.JMenu();
        mnVoltar = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPlanejamento.setText("Planejamento de Estudos");

        lbDisciplina.setText("Disciplina");

        lbInicio.setText("Horário de início");

        lbEncerramento.setText("Horário de encerramento");

        tbPlanejamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "disciplina", "horário de início", "horário de encerramento"
            }
        ));
        tbPlanejamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPlanejamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPlanejamentos);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(lbPlanejamento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(lbEncerramento))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbInicio)
                                    .addComponent(lbDisciplina))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edDisciplina)
                            .addComponent(edInicio)
                            .addComponent(edEncerramento, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvar)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbPlanejamento)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDisciplina))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbInicio))
                        .addGap(28, 28, 28)
                        .addComponent(edEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbEncerramento))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btAtualizar)
                    .addComponent(btNovo)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        mnOpcoes.setText("Opções");

        mnVoltar.setText("Voltar");
        mnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVoltarActionPerformed(evt);
            }
        });
        mnOpcoes.add(mnVoltar);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnOpcoes.add(mnSair);

        jMenuBar1.add(mnOpcoes);

        setJMenuBar(jMenuBar1);

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

    private void mnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVoltarActionPerformed
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnVoltarActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        new Logar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Planejamentos p = new Planejamentos();
        DaoPlanejamentos dp = new DaoPlanejamentos();

        p.setDisciplina(edDisciplina.getText());
        p.setHorario_inicio(edInicio.getText());
        p.setHorario_encerramento(edEncerramento.getText());
        dp.salvarPlanejamento(p);

        edDisciplina.setText("");
        edInicio.setText("");
        edEncerramento.setText("");

        readJTable();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
         if (tbPlanejamentos.getSelectedRow() != -1) {

            Planejamentos p = new Planejamentos();
            DaoPlanejamentos dp = new DaoPlanejamentos();

            p.setId((int) tbPlanejamentos.getValueAt(tbPlanejamentos.getSelectedRow(), 0));
            dp.excluirPlanejamento(p);

            edDisciplina.setText("");
            edInicio.setText("");
            edEncerramento.setText("");
           
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma tarefa para excluir.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (tbPlanejamentos.getSelectedRow() != -1) {

            Planejamentos p = new Planejamentos();
            DaoPlanejamentos dp = new DaoPlanejamentos();

            p.setDisciplina(edDisciplina.getText());
            p.setHorario_inicio(edInicio.getText());
            p.setHorario_encerramento(edEncerramento.getText());
            p.setId((int) tbPlanejamentos.getValueAt(tbPlanejamentos.getSelectedRow(), 0));
            dp.atualizarPlanejamento(p);

            edDisciplina.setText("");
            edInicio.setText("");
            edEncerramento.setText("");   
            readJTable();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void tbPlanejamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPlanejamentosMouseClicked
        if (tbPlanejamentos.getSelectedRow() != -1) {

            edDisciplina.setText(tbPlanejamentos.getValueAt(tbPlanejamentos.getSelectedRow(), 1).toString());
            edInicio.setText(tbPlanejamentos.getValueAt(tbPlanejamentos.getSelectedRow(), 2).toString());
            edEncerramento.setText(tbPlanejamentos.getValueAt(tbPlanejamentos.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_tbPlanejamentosMouseClicked

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        this.ativarOuDesativarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.ativarOuDesativarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Planejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planejamento().setVisible(true);
            }
        });
    }
    
    private void ativarOuDesativarCampos(boolean condicao) {
        edDisciplina.setEnabled(condicao);
        edInicio.setEnabled(condicao);
        edEncerramento.setEnabled(condicao);
        btSalvar.setEnabled(condicao);
    }

    private void limparCampos() {
        edDisciplina.setText("");
        edInicio.setText("");
        edEncerramento.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edDisciplina;
    private javax.swing.JTextField edEncerramento;
    private javax.swing.JTextField edInicio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDisciplina;
    private javax.swing.JLabel lbEncerramento;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbPlanejamento;
    private javax.swing.JMenu mnOpcoes;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenuItem mnVoltar;
    private javax.swing.JTable tbPlanejamentos;
    // End of variables declaration//GEN-END:variables
}
