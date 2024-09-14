import javax.swing.JOptionPane;

public class Solucao1b {
    public static void main(String[] args) {
        //Entrada do Numero
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);
        //Desmonstração na Tela
        JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + numero);
    }
}
