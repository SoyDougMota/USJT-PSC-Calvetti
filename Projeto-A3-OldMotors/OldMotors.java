import javax.swing.*;
import java.sql.*;

public class OldMotors {

    public static void main(String[] args) {
        boolean funcionando = true;

        while (funcionando) {
            String url = "jdbc:mysql://localhost:3306/atividade";
            String user = "root";
            String password = "Dogmota10.";

            String[] options = {"Modelo", "Marca", "Cancelar"};
            var tipoBusca = JOptionPane.showOptionDialog(null, "Escolha o tipo de Busca", "OldMotors", 0, 3, null, options, options[0]);

            switch (tipoBusca) {
                case 0:
                    buscarNoBanco("modelo", "Busque um Modelo:", url, user, password);
                    break;

                case 1:
                    buscarNoBanco("marca", "Busque uma Marca:", url, user, password);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Busca cancelada. Até logo!", "OldMotors", JOptionPane.INFORMATION_MESSAGE);
                    funcionando = false;
                    break;

                default:
                    break;
            }
        }
    }

    private static void buscarNoBanco(String coluna, String mensagem, String url, String user, String password) {
        String termoBusca = JOptionPane.showInputDialog(null, mensagem, "OldMotors", JOptionPane.QUESTION_MESSAGE);

        if (termoBusca == null || termoBusca.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um termo válido para buscar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "SELECT * FROM carros WHERE " + coluna + " LIKE ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + termoBusca + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                StringBuilder resultados = new StringBuilder();
                resultados.append("Resultados para: ").append(termoBusca).append("\n");

                boolean encontrou = false;
                while (rs.next()) {
                    encontrou = true;
                    resultados.append("ID: ").append(rs.getInt("id"))
                              .append(", Modelo: ").append(rs.getString("modelo"))
                              .append(", Marca: ").append(rs.getString("marca"))
                              .append(", Ano: ").append(rs.getInt("ano"))
                              .append(", Preço: ").append(rs.getDouble("preco"))
                              .append("\n");
                }

                if (encontrou) {
                    JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados da Busca", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado para: " + termoBusca, "Sem Resultados", JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar a busca: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}