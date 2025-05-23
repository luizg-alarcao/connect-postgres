import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgreSQL {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/JDBC"; // nome do seu banco
        String usuario = "postgres"; // seu usuário
        String senha = "1"; // sua senha

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucedida!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro na conexão:");
            e.printStackTrace();
        }
    }
}