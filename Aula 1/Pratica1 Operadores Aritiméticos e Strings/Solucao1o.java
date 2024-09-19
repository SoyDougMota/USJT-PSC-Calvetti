import javax.swing.JOptionPane;

public class Solucao1o {
    public static void main(String[] args) {
        String sDivid = JOptionPane.showInputDialog("Digite o dividendo:");
        String sDivisor = JOptionPane.showInputDialog("Digite o divisor:");
        
        int dividendo = Integer.parseInt(sDivid);
        int divisor = Integer.parseInt(sDivisor);
        
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;
        
        JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo + "\nDivisor: " + divisor + "\nQuociente: " + quociente + "\nResto: " + resto);
    }
}
