import javax.swing.JOptionPane;

public class Solucao1d {
    public static void main(String[] args) {
        //Entrada Peso
        String input = JOptionPane.showInputDialog("Digite o seu peso (em kg):");
        double peso = Double.parseDouble(input);
        //Saida na Tela
        JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + " kg.");
    }
}
