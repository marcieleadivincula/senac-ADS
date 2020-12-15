
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {
    public Connection connection = null;
    
    public Connection getConexao() throws ClassNotFoundException{
        // db parameters
        final String DRIVER = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/manutencao";
        final String user = "root";
        final String password = "#Adiv!ncul@93Mar";
        
         // create a connection to the database
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, user, password);
            JOptionPane.showMessageDialog(null,"connected with "+ connection.toString());
            return connection;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas na fonte de dados: " + e.toString());
            JOptionPane.showMessageDialog(null,"not connect to server and message is" + e.getMessage());
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Problemas ao fechar a conexão: " + ex.toString());
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    //TODO: Ver qual a diferença usando o finally e assim?
    //professor fez assim - separado
    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao fechar a conexão: " + e.toString());
        }
    }
}
