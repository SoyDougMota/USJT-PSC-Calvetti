import javax.swing.JOptionPane;

public class Solucao1f {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos:");
        int numero = Integer.parseInt(sNum);
        int dezenas = (numero / 10) % 10;
        JOptionPane.showMessageDialog(null, "O algarismo das dezenas é: " + dezenas);
    }
}
