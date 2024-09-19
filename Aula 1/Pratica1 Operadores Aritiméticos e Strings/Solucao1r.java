import javax.swing.JOptionPane;

public class Solucao1r {
    public static void main(String[] args) {
        String sDiMaior = JOptionPane.showInputDialog("Digite a diagonal maior do losango:");
        String sDiMenor = JOptionPane.showInputDialog("Digite a diagonal menor do losango:");
        
        double diagonalMaior = Double.parseDouble(sDiMaior);
        double diagonalMenor = Double.parseDouble(sDiMenor);
        
        double area = (diagonalMaior * diagonalMenor) / 2;
        
        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
}
