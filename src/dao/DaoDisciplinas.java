/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Disciplinas;

/**
 *
 * @author lcluc
 */
public class DaoDisciplinas extends ConnectionFactory{
    
    public void salvarDisciplina(Disciplinas disciplina) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO disciplinas (nome, data, conteudo)VALUES(?,?,?)");
            stmt.setString(1, disciplina.getNome());
            stmt.setString(2, disciplina.getData());
            stmt.setString(3, disciplina.getConteudo());
       

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void excluirDisciplina(Disciplinas disciplina) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM disciplinas WHERE id = ?");
            stmt.setInt(1, disciplina.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void atualizarDisciplina(Disciplinas disciplina) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE disciplinas SET nome = ? , data = ?, conteudo = ? WHERE id = ?");
            stmt.setString(1, disciplina.getNome());
            stmt.setString(2, disciplina.getData());
            stmt.setString(3, disciplina.getConteudo());
            stmt.setInt(4, disciplina.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

   
    public ArrayList<Disciplinas> getDisciplinas() {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Disciplinas> listaDisciplinas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM disciplinas ORDER BY id DESC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Disciplinas d = new Disciplinas();

                d.setId(rs.getInt("id"));
                d.setNome(rs.getString("nome"));
                d.setData(rs.getString("data"));
                d.setConteudo(rs.getString("conteudo"));
                listaDisciplinas.add(d);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoTarefas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaDisciplinas;
    }
    
}
