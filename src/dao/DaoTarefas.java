package dao;

import model.Tarefas;
import conexoes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoTarefas extends ConnectionFactory {

    public void salvarTarefa(Tarefas tarefa) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tarefas (descricao, conclusao, prazo, frequencia, prioridade)VALUES(?,?,?,?,?)");
            stmt.setString(1, tarefa.getDescricao());
            stmt.setString(2, tarefa.getConclusao());
            stmt.setString(3, tarefa.getPrazo());
            stmt.setString(4, tarefa.getFrequencia());
            stmt.setString(5, tarefa.getPrioridade());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void excluirTarefa(Tarefas tarefa) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tarefas WHERE id = ?");
            stmt.setInt(1, tarefa.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void atualizarTarefa(Tarefas tarefa) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tarefas SET descricao = ? ,conclusao = ?,prazo = ?,frequencia = ?,prioridade = ? WHERE id = ?");
            stmt.setString(1, tarefa.getDescricao());
            stmt.setString(2, tarefa.getConclusao());
            stmt.setString(3, tarefa.getPrazo());
            stmt.setString(4, tarefa.getFrequencia());
            stmt.setString(5, tarefa.getPrioridade());
            stmt.setInt(6, tarefa.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

   
    public ArrayList<Tarefas> getTarefas() {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Tarefas> listaTarefas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tarefas ORDER BY conclusao DESC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Tarefas t = new Tarefas();

                t.setId(rs.getInt("id"));
                t.setDescricao(rs.getString("descricao"));
                t.setConclusao(rs.getString("conclusao"));
                t.setPrazo(rs.getString("prazo"));
                t.setFrequencia(rs.getString("frequencia"));
                t.setPrioridade(rs.getString("prioridade"));
                listaTarefas.add(t);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoTarefas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaTarefas;
    }

}
