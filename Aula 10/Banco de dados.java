CREATE DATABASE GerenciamentoEscolar;
USE GerenciamentoEscolar;

String url = "jdbc:mysql://localhost:3306/GerenciamentoEscolar";
String user = "seu_usuario";
String password = "sua_senha";

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/GerenciamentoEscolar";
    private static final String USER = "seu_usuario"; // substitua pelo seu usuário
    private static final String PASSWORD = "sua_senha"; // substitua pela sua senha

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
public class Aluno {
    private int idAluno;
    private String raAluno;
    private String nomeAluno;

    // Getters e Setters
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(String raAluno) {
        this.raAluno = raAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    // CREATE
    public void inserirAluno(Aluno aluno) throws SQLException {
        String sql = "INSERT INTO Aluno (raAluno, nomeAluno) VALUES (?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getRaAluno());
            stmt.setString(2, aluno.getNomeAluno());
            stmt.executeUpdate();
        }
    }

    // READ
    public List<Aluno> listarAlunos() throws SQLException {
        String sql = "SELECT * FROM Aluno";
        List<Aluno> alunos = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setIdAluno(rs.getInt("idAluno"));
                aluno.setRaAluno(rs.getString("raAluno"));
                aluno.setNomeAluno(rs.getString("nomeAluno"));
                alunos.add(aluno);
            }
        }
        return alunos;
    }

    // UPDATE
    public void atualizarAluno(Aluno aluno) throws SQLException {
        String sql = "UPDATE Aluno SET raAluno = ?, nomeAluno = ? WHERE idAluno = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getRaAluno());
            stmt.setString(2, aluno.getNomeAluno());
            stmt.setInt(3, aluno.getIdAluno());
            stmt.executeUpdate();
        }
    }

    // DELETE
    public void excluirAluno(int idAluno) throws SQLException {
        String sql = "DELETE FROM Aluno WHERE idAluno = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idAluno);
            stmt.executeUpdate();
        }
    }
}
