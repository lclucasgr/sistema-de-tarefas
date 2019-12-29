package dao;

import model.Planejamentos;
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

public class DaoPlanejamentos extends ConnectionFactory {

    public void salvarPlanejamento(Planejamentos planejamento) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO planejamentos (disciplina, horario_inicio, horario_encerramento)VALUES(?,?,?)");
            stmt.setString(1, planejamento.getDisciplina());
            stmt.setString(2, planejamento.getHorario_inicio());
            stmt.setString(3, planejamento.getHorario_encerramento());
           
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void excluirPlanejamento(Planejamentos planejamento) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM planejamentos WHERE id = ?");
            stmt.setInt(1, planejamento.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void atualizarPlanejamento(Planejamentos planejamento) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE planejamentos SET disciplina = ? , horario_inicio = ?, horario_encerramento = ? where id = ?");
            stmt.setString(1, planejamento.getDisciplina());
            stmt.setString(2, planejamento.getHorario_inicio());
            stmt.setString(3, planejamento.getHorario_encerramento());
            stmt.setInt(4, planejamento.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

   
    public ArrayList<Planejamentos> getPlanejamentos() {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Planejamentos> listaPlanejamentos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM planejamentos ORDER BY horario_inicio ASC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Planejamentos p = new Planejamentos();

                p.setId(rs.getInt("id"));
                p.setDisciplina(rs.getString("disciplina"));
                p.setHorario_inicio(rs.getString("horario_inicio"));
                p.setHorario_encerramento(rs.getString("horario_encerramento"));
                listaPlanejamentos.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoTarefas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaPlanejamentos;
    }

}
