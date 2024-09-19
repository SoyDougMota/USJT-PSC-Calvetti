import javax.swing.JOptionPane;

public class Solucao1i {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        String sBase = JOptionPane.showInputDialog("Digite a base do logaritmo:");

        double numero = Double.parseDouble(sNum);
        double base = Double.parseDouble(sBase);
        double logaritmo = Math.log(numero) / Math.log(base);

        JOptionPane.showMessageDialog(null, "O logaritmo de " + numero + " na base " + base + " é: " + logaritmo);
    }
}
