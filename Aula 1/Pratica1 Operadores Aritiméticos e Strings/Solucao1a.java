import javax.swing.JOptionPane;

public class Solucao1a {
    public static void main(String[] args) {
        String iIdade = JOptionPane.showInputDialog("Digite sua idade em anos:");
        double idade = Double.parseDouble(iIdade);
        double diasVividos = idade * 365;  // Aproximadamente
        JOptionPane.showMessageDialog(null, "Você viveu aproximadamente " + diasVividos + " dias.");
    }
}
