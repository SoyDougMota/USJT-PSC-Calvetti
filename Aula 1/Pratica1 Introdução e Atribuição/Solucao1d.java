import javax.swing.JOptionPane;

public class Solucao1d {
    public static void main(String[] args) {
        //Entrada Peso
        String PesoReal = JOptionPane.showInputDialog("Digite o seu peso (em kg):");
        double peso = Double.parseDouble(PesoReal);
        //Saida na Tela
        JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + " kg.");
    }
}
