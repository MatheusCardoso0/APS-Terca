// situa em qual package ou “pacote” está a classe 
package connection;
// faz as importações de classes necessárias para o funcionamento do programa 

import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java 
import java.sql.SQLException; // classe para tratamento de exceções 
import javax.swing.JOptionPane;
import model.dao.UsuarioDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.LoginDAO;

public class ConnectionFactory {
    private Connection connection;

       public Connection getConnection() {
        try {
            //JOptionPane.showMessageDialog(null, "Conectando ao banco de dados");
            return DriverManager.getConnection("jdbc:mysql://localhost/trabalhointerface", "root", "");

        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Não Conectado.\n\n Error:\n\n " + excecao);

            throw new RuntimeException(excecao);

        }
    }
       
   

}
