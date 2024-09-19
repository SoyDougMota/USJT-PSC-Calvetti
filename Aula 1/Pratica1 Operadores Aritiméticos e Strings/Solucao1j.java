import javax.swing.JOptionPane;

public class Solucao1j {
    public static void main(String[] args) {
        String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
        String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
        String frase3 = JOptionPane.showInputDialog("Digite a terceira frase:");
        
        int meio1 = frase1.length() / 2;
        int meio2 = frase2.length() / 2;
        int meio3 = frase3.length() / 2;

        String embaralhada = frase2.substring(0, meio2) + frase3.substring(meio3) +
                             frase2.substring(meio2) + frase1.substring(0, meio1) +
                             frase3.substring(0, meio3) + frase1.substring(meio1);
                             
        JOptionPane.showMessageDialog(null, "Frase original: " + frase1 + " " + frase2 + " " + frase3 + "\nFrase embaralhada: " + embaralhada);
    }
}
