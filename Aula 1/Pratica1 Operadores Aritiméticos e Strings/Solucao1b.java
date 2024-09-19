import javax.swing.JOptionPane;

public class Solucao1b {
    public static void main(String[] args) {
        String sBase = JOptionPane.showInputDialog("Digite a base do retângulo:");
        String sAltura = JOptionPane.showInputDialog("Digite a altura do retângulo:");
        
        double base = Double.parseDouble(sBase);
        double altura = Double.parseDouble(sAltura);
        double area = base * altura;
        
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
    }
}
