import javax.swing.JOptionPane;

public class Solucao1m {
    public static void main(String[] args) {
        String sA = JOptionPane.showInputDialog("Digite o número a:");
        String sB = JOptionPane.showInputDialog("Digite o número b:");
        String sC = JOptionPane.showInputDialog("Digite o número c:");
        
        double a = Double.parseDouble(sA);
        double b = Double.parseDouble(sB);
        double c = Double.parseDouble(sC);
        
        double x = 2 * ((a - c) / 8) - b * 5;
        
        JOptionPane.showMessageDialog(null, "O resultado de x é: " + x);
    }
}
