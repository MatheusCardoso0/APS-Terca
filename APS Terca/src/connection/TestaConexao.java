package connection;

import java.sql.Connection;
import java.sql.SQLException;
import connection.ConnectionFactory;
import javax.swing.JOptionPane;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        JOptionPane.showMessageDialog(null,"Conexão aberta!");
        connection.close();
    }
}
