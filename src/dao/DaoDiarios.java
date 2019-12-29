package dao;

import model.Diarios;
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

public class DaoDiarios extends ConnectionFactory {

    public void salvarDiario(Diarios diario) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO diarios (disciplina, horario_inicio, horario_encerramento, data, conteudo)VALUES(?,?,?,?,?)");
            stmt.setString(1, diario.getDisciplina());
            stmt.setString(2, diario.getHorario_inicio());
            stmt.setString(3, diario.getHorario_encerramento());
            stmt.setString(4, diario.getData());
            stmt.setString(5, diario.getConteudo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void excluirDiario(Diarios diario) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM diarios WHERE id = ?");
            stmt.setInt(1, diario.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void atualizarDiario(Diarios diario) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE diarios SET disciplina = ? , horario_inicio = ?, horario_encerramento = ?, data = ?, conteudo = ? WHERE id = ?");
            stmt.setString(1, diario.getDisciplina());
            stmt.setString(2, diario.getHorario_inicio());
            stmt.setString(3, diario.getHorario_encerramento());
            stmt.setString(4, diario.getData());
            stmt.setString(5, diario.getConteudo());
            stmt.setInt(6, diario.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

   
    public ArrayList<Diarios> getDiarios() {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Diarios> listaDiarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM diarios ORDER BY data DESC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Diarios d = new Diarios();

                d.setId(rs.getInt("id"));
                d.setDisciplina(rs.getString("disciplina"));
                d.setHorario_inicio(rs.getString("horario_inicio"));
                d.setHorario_encerramento(rs.getString("horario_encerramento"));
                d.setData(rs.getString("data"));
                d.setConteudo(rs.getString("conteudo"));
                listaDiarios.add(d);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoTarefas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaDiarios;
    }

}

