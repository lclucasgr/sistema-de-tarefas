/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoDiarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Diarios;

/**
 *
 * @author lcluc
 */
public class Diario extends javax.swing.JFrame {

    /**
     * Creates new form Diario
     */
    public Diario() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) tbDiario.getModel();
        tbDiario.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }
    
    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) tbDiario.getModel();
        modelo.setNumRows(0);
        DaoDiarios dd = new DaoDiarios();

        for (Diarios d : dd.getDiarios()) {

            modelo.addRow(new Object[]{
                d.getId(),
                d.getDisciplina(),
                d.getHorario_inicio(),
                d.getHorario_encerramento(),
                d.getData(),
                d.getConteudo(),
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

        lbDisciplina = new javax.swing.JLabel();
        edDisciplina = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        lbEncerramento = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbConteudo = new javax.swing.JLabel();
        edInicio = new javax.swing.JTextField();
        edEncerramento = new javax.swing.JTextField();
        edData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txConteudo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDiario = new javax.swing.JTable();
        btCancelar = new javax.swing.JButton();
        edNovo = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        edExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpcoes = new javax.swing.JMenu();
        mnVoltar = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDisciplina.setText("Disciplina");

        jLabel1.setText("Diário de estudos");

        lbInicio.setText("Horário de Início");

        lbEncerramento.setText("Horário de encerramento");

        lbData.setText("Data");

        lbConteudo.setText("Conteúdo estudado");

        txConteudo.setColumns(20);
        txConteudo.setRows(5);
        jScrollPane1.setViewportView(txConteudo);

        tbDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "disciplina", "horario_inicio", "horario_encerramento", "data", "conteudo_estudado"
            }
        ));
        tbDiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDiarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDiario);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        edNovo.setText("Novo");
        edNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNovoActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        edExcluir.setText("Excluir");
        edExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edExcluirActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEncerramento)
                            .addComponent(lbDisciplina, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbData, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbConteudo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edData, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDisciplina))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInicio))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edEncerramento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEncerramento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbConteudo))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelar)
                            .addComponent(edNovo)
                            .addComponent(btAtualizar)
                            .addComponent(edExcluir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btSalvar)))
                .addContainerGap(67, Short.MAX_VALUE))
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
        Diarios d = new Diarios();
        DaoDiarios dd = new DaoDiarios();

        d.setDisciplina(edDisciplina.getText());
        d.setHorario_inicio(edInicio.getText());
        d.setHorario_encerramento(edEncerramento.getText());
        d.setData(edData.getText());
        d.setConteudo(txConteudo.getText());
        dd.salvarDiario(d);

        edDisciplina.setText("");
        edInicio.setText("");
        edEncerramento.setText("");
        edData.setText("");
        txConteudo.setText("");

        readJTable();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void edExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edExcluirActionPerformed
        if (tbDiario.getSelectedRow() != -1) {

            Diarios d = new Diarios();
            DaoDiarios dd = new DaoDiarios();

            d.setId((int) tbDiario.getValueAt(tbDiario.getSelectedRow(), 0));
            dd.excluirDiario(d);

            edDisciplina.setText("");
            edInicio.setText("");
            edEncerramento.setText("");
            edData.setText("");
            txConteudo.setText("");
           
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma diario para excluir.");
        }
    }//GEN-LAST:event_edExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        
        if (tbDiario.getSelectedRow() != -1) {

            Diarios d = new Diarios();
            DaoDiarios dd = new DaoDiarios();

            d.setDisciplina(edDisciplina.getText());
            d.setHorario_inicio(edInicio.getText());
            d.setHorario_encerramento(edEncerramento.getText());
            d.setData(edData.getText());
            d.setConteudo(txConteudo.getText());
            d.setId((int) tbDiario.getValueAt(tbDiario.getSelectedRow(), 0));
            dd.atualizarDiario(d);

            edDisciplina.setText("");
            edInicio.setText("");
            edEncerramento.setText("");
            edData.setText("");
            txConteudo.setText("");
            readJTable();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
       this.ativarOuDesativarCampos(false);
       this.limparCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void edNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNovoActionPerformed
       this.ativarOuDesativarCampos(true);
       this.limparCampos();
    }//GEN-LAST:event_edNovoActionPerformed

    private void tbDiarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDiarioMouseClicked
        if (tbDiario.getSelectedRow() != -1) {

            edDisciplina.setText(tbDiario.getValueAt(tbDiario.getSelectedRow(), 1).toString());
            edInicio.setText(tbDiario.getValueAt(tbDiario.getSelectedRow(), 2).toString());
            edEncerramento.setText(tbDiario.getValueAt(tbDiario.getSelectedRow(), 3).toString());
            edData.setText(tbDiario.getValueAt(tbDiario.getSelectedRow(), 4).toString());
            txConteudo.setText(tbDiario.getValueAt(tbDiario.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tbDiarioMouseClicked

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
            java.util.logging.Logger.getLogger(Diario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diario().setVisible(true);
            }
        });
    }
    
    private void ativarOuDesativarCampos(boolean condicao) {
        edDisciplina.setEnabled(condicao);
        edInicio.setEnabled(condicao);
        edEncerramento.setEnabled(condicao);
        edData.setEnabled(condicao);
        txConteudo.setEnabled(condicao);
        btSalvar.setEnabled(condicao);
    }

    private void limparCampos() {
        edDisciplina.setText("");
        edInicio.setText("");
        edEncerramento.setText("");
        edData.setText("");
        txConteudo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edData;
    private javax.swing.JTextField edDisciplina;
    private javax.swing.JTextField edEncerramento;
    private javax.swing.JButton edExcluir;
    private javax.swing.JTextField edInicio;
    private javax.swing.JButton edNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbConteudo;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDisciplina;
    private javax.swing.JLabel lbEncerramento;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JMenu mnOpcoes;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenuItem mnVoltar;
    private javax.swing.JTable tbDiario;
    private javax.swing.JTextArea txConteudo;
    // End of variables declaration//GEN-END:variables
}
