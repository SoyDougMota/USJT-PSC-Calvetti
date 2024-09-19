import javax.swing.JOptionPane;

public class Solucao1h {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        double numero = Double.parseDouble(sNum);
        double logaritmo = Math.log10(numero);
        JOptionPane.showMessageDialog(null, "O logaritmo na base 10 de " + numero + " é: " + logaritmo);
    }
}
