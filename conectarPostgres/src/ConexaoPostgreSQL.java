import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgreSQL {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/JDBC";
        String usuario = "postgres";
        String senha = "1";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Banco de dados conectado com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar ao Banco de Dados, Erro: ");
            e.printStackTrace();
        }
    }
}
