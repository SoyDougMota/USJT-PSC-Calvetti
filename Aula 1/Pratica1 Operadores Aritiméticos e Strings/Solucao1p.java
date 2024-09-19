import javax.swing.JOptionPane;

public class Solucao1p {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        double numero = Double.parseDouble(sNum);
        
        double quadrado = numero * numero;
        double raizQuadrada = Math.sqrt(numero);
        
        JOptionPane.showMessageDialog(null, "Número: " + numero + "\nQuadrado: " + quadrado + "\nRaiz quadrada: " + raizQuadrada);
    }
}
