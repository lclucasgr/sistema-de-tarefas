package dao;

import model.Planos;
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

public class DaoPlanos extends ConnectionFactory {

    public void salvarPlano(Planos plano) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO planos (tema, conteudo)VALUES(?,?)");
            stmt.setString(1, plano.getTema());
            stmt.setString(2, plano.getConteudo());
           
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void excluirPlano(Planos plano) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM planos WHERE id = ?");
            stmt.setInt(1, plano.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void atualizarPlano(Planos plano) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE planos SET tema = ? , conteudo = ? where id = ?");
            stmt.setString(1, plano.getTema());
            stmt.setString(2, plano.getConteudo());
            stmt.setInt(3, plano.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

   
    public ArrayList<Planos> getPlanos() {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Planos> listaPlanos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM planos ORDER BY tema");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Planos p = new Planos();

                p.setId(rs.getInt("id"));
                p.setTema(rs.getString("tema"));
                p.setConteudo(rs.getString("conteudo"));
                listaPlanos.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoTarefas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaPlanos;
    }

}
