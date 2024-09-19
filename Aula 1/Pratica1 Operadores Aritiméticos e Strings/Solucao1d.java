import javax.swing.JOptionPane;

public class Solucao1d {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Digite a primeira string:");
        String s2 = JOptionPane.showInputDialog("Digite a segunda string:");
        String s3 = JOptionPane.showInputDialog("Digite a terceira string:");
        
        double comprimentoTotal = (double)s1.length() + s2.length() + s3.length();

        JOptionPane.showMessageDialog(null, "A soma do comprimento das strings é: " + comprimentoTotal);
    }
}
