
package model.dao;

import bd.visual.Login;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Login1;

/**
 *
 * @author ma117558
 */
public class LoginDAO {
    

    private Connection connection;
    
    String nome;
    String login;
    String senha;

    public LoginDAO() {
        this.connection = new ConnectionFactory().getConnection(); // pegar conexao

    }

    
    /**
     *
     * @param login1
     */
    public void cadastra(Login1 login1){
    String sql = "INSERT INTO logins(Nome, Login, Senha) VALUE (?,?,?) ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, login1.getNome());
            stmt.setString(2, login1.getLogin());
            stmt.setString(3, login1.getSenha());
            stmt.execute();
            stmt.close();
        } catch (SQLException ee) {
            JOptionPane.showMessageDialog(null, "" + ee);
            throw new RuntimeException(ee);
        }

    }
}
    

