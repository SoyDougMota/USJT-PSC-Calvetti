import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String professor = JOptionPane.showInputDialog("Digite o nome do professor:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre:"));
        boolean ofertada = Boolean.parseBoolean(JOptionPane.showInputDialog("A disciplina está ofertada? true/false"));

        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        JOptionPane.showMessageDialog(null, 
            "Disciplina criada:\nNome: " + disciplina.getNome() +
            "\nProfessor: " + disciplina.getProfessor() +
            "\nSemestre: " + disciplina.getSemestre() +
            "\nOfertada: " + (disciplina.isOfertada() ? "Sim" : "Não")
        );
    }
}
