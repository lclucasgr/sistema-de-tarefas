/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoPlanos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Planos;

/**
 *
 * @author lcluc
 */
public class Plano extends javax.swing.JFrame {

    /**
     * Creates new form Planos
     */
    public Plano() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) tbPlanos.getModel();
        tbPlanos.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }
    
    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) tbPlanos.getModel();
        modelo.setNumRows(0);
        DaoPlanos dp = new DaoPlanos();

        for (Planos p : dp.getPlanos()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getTema(),
                p.getConteudo(),
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
        lbPlano = new javax.swing.JLabel();
        lbTema = new javax.swing.JLabel();
        edTema = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txConteudo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPlanos = new javax.swing.JTable();
        btCancelar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpcoes = new javax.swing.JMenu();
        mnVoltar = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPlano.setText("Planos de estudos");

        lbTema.setText("Tema");

        jLabel1.setText("Conteúdo a ser estudado");

        txConteudo.setColumns(20);
        txConteudo.setRows(5);
        jScrollPane1.setViewportView(txConteudo);

        tbPlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "tema", "conteúdo"
            }
        ));
        tbPlanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPlanosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPlanos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lbTema))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPlano)
                            .addComponent(edTema, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lbPlano)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTema))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 108, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btNovo)
                    .addComponent(btAtualizar)
                    .addComponent(btExcluir)
                    .addComponent(btSalvar))
                .addGap(0, 125, Short.MAX_VALUE))
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

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        this.ativarOuDesativarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Planos p = new Planos();
        DaoPlanos dp = new DaoPlanos();

        p.setTema(edTema.getText());
        p.setConteudo(txConteudo.getText());
        dp.salvarPlano(p);

        edTema.setText("");
        txConteudo.setText("");

        readJTable();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        if (tbPlanos.getSelectedRow() != -1) {

            Planos p = new Planos();
            DaoPlanos dp = new DaoPlanos();

            p.setId((int) tbPlanos.getValueAt(tbPlanos.getSelectedRow(), 0));
            dp.excluirPlano(p);

            edTema.setText("");
            txConteudo.setText("");
           
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma tarefa para excluir.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        
        if (tbPlanos.getSelectedRow() != -1) {

            Planos p = new Planos();
            DaoPlanos dp = new DaoPlanos();

            p.setTema(edTema.getText());
            p.setConteudo(txConteudo.getText());
            p.setId((int) tbPlanos.getValueAt(tbPlanos.getSelectedRow(), 0));
            dp.atualizarPlano(p);

            edTema.setText("");
            txConteudo.setText(""); 
            readJTable();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.ativarOuDesativarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbPlanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPlanosMouseClicked
       if (tbPlanos.getSelectedRow() != -1) {

            edTema.setText(tbPlanos.getValueAt(tbPlanos.getSelectedRow(), 1).toString());
            txConteudo.setText(tbPlanos.getValueAt(tbPlanos.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tbPlanosMouseClicked

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
            java.util.logging.Logger.getLogger(Plano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plano().setVisible(true);
            }
        });
    }
    
    private void ativarOuDesativarCampos(boolean condicao) {
        edTema.setEnabled(condicao);
        txConteudo.setEnabled(condicao);
        btSalvar.setEnabled(condicao);
    }

    private void limparCampos() {
        edTema.setText("");
        txConteudo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbPlano;
    private javax.swing.JLabel lbTema;
    private javax.swing.JMenu mnOpcoes;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenuItem mnVoltar;
    private javax.swing.JTable tbPlanos;
    private javax.swing.JTextArea txConteudo;
    // End of variables declaration//GEN-END:variables
}
