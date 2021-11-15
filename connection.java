import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connection {

    public static void main(String[] args) throws SQLException {

        Connection conexao = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/db_cadastro", "root", "root");
            ResultSet rsPessoas = conexao.createStatement().executeQuery("SELECT * FROM PESSOAS");
            while (rsPessoas.next()) {
                System.out.println("Nome: " + rsPessoas.getString("nome"));
            }

        } catch (ClassNotFoundException e) {

            System.out.println("Driver do banco de dados não encontrado.");

        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco: " + e.getMessage());

        } finally {  
             
            if(conexao != null){
                System.out.println("CONECTADO");
                conexao.close();
            }


        }

    }

}
