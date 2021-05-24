package model.dao;

import connection.ConnectionFactory;
import model.bean.Usuario;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection(); // pegar conexao

    }

    /**
     *
     * @param usuario
     */
    public void adiciona(Usuario usuario) {
        String sql = "INSERT INTO usuario(nome, cpf, cnpj, datanascimento, endereco, numero, complemento, email, telefone, tiposeguro, seguradora, datavigencia) VALUE (?,?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getCliente());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getCnpj());
            stmt.setDate(4, usuario.getDatanascimento());
            stmt.setString(5, usuario.getEndereco());
            stmt.setString(6, usuario.getEndereconumero());
            stmt.setString(7, usuario.getComplemento());
            stmt.setString(8, usuario.getEmail());
            stmt.setString(9, usuario.getTelefone());
            stmt.setString(10, usuario.getSeguro());
            stmt.setString(11, usuario.getSeguradora());
            stmt.setDate(12, usuario.getDatavigencia());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "" + u);
            throw new RuntimeException(u);
        }

    }

    public void update(Usuario p) {

        this.connection = new ConnectionFactory().getConnection(); // pegar conexao

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE usuario SET nome = ?, cpf = ?, cnpj = ?, datanascimento = ?, endereco = ?, numero = ?, complemento = ?, email = ?, telefone = ?, tiposeguro = ?, seguradora = ?, datavigencia = ? WHERE id = ?");
           stmt.setString(1, p.getCliente());
            stmt.setString(2, p.getCpf());
            stmt.setString(3, p.getCnpj());
            stmt.setDate(4, p.getDatanascimento());
            stmt.setString(5, p.getEndereco());
            stmt.setString(6, p.getEndereconumero());
            stmt.setString(7, p.getComplemento());
            stmt.setString(8, p.getEmail());
            stmt.setString(9, p.getTelefone());
            stmt.setString(10, p.getSeguro());
            stmt.setString(11, p.getSeguradora());
            stmt.setDate(12, p.getDatavigencia());
            stmt.setInt(13, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }

    }

}
