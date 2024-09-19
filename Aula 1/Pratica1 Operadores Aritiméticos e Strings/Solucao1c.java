import javax.swing.JOptionPane;

public class Solucao1c {
    public static void main(String[] args) {
        String sNumero = JOptionPane.showInputDialog("Digite um número inteiro:");
        double numero = Double.parseDouble(sNumero);
        double quadrado = numero * numero;
        JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é: " + quadrado);
    }
}
