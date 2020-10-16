import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // create a new connection from Conexao
        try (Connection connection = Conexao.getConexao()) {
            // print out a message
            System.out.println(String.format("Connected to database %s " + "successfully.", connection.getCatalog()));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
