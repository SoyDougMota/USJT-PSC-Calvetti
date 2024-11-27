import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome da turma:");
        String curso = JOptionPane.showInputDialog("Digite o curso:");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a série:"));

        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        JOptionPane.showMessageDialog(null, 
            "Turma criada:\nNome: " + turma.getNome() +
            "\nCurso: " + turma.getCurso() +
            "\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() +
            "\nSérie: " + turma.getSerie()
        );

        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos:"));
        turma.setQuantidadeDeAlunos(quantidadeDeAlunos);

        JOptionPane.showMessageDialog(null, 
            "Dados atualizados:\nNome: " + turma.getNome() +
            "\nCurso: " + turma.getCurso() +
            "\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() +
            "\nSérie: " + turma.getSerie()
        );
    }
}
