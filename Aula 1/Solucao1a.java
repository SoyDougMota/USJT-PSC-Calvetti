import javax.swing.JOptionPane;

public class Solucao1a {
    public static void main(String[] args) {
        String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
        String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
        String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra:");
        //Desmonstração na Tela
        JOptionPane.showMessageDialog(null, "Palavras na ordem inversa: " + palavra3 + " " + palavra2 + " " + palavra1);
    }
}
