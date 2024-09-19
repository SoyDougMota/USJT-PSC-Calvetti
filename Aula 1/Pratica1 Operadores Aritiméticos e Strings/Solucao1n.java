import javax.swing.JOptionPane;

public class Solucao1n {
    public static void main(String[] args) {
        final double PI = 3.14159;
        
        String sRaio = JOptionPane.showInputDialog("Digite o raio do círculo:");
        double raio = Double.parseDouble(sRaio);
        
        double area = PI * raio * raio;
        
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    }
}
