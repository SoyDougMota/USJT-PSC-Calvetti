import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {
        String nomeProf = JOptionPane.showInputDialog("Nome do Professor:");
        int idadeProf = Integer.parseInt(JOptionPane.showInputDialog("Idade do Professor:"));
        Professor professor = new Professor(nomeProf, idadeProf);

        String nomeDisc = JOptionPane.showInputDialog("Nome da Disciplina:");
        boolean praticaDisc = Boolean.parseBoolean(JOptionPane.showInputDialog("Disciplina é prática? true/false"));
        Disciplina disciplina = new Disciplina(nomeDisc, praticaDisc);

        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}
