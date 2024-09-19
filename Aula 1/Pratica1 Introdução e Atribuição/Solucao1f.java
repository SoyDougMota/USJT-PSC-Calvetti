import javax.swing.JOptionPane;

public class Solucao1f {
    public static void main(String[] args) {
        //Entrada dos Numeros 
        String milhar = JOptionPane.showInputDialog("Digite o número da casa do milhar:");
        String centena = JOptionPane.showInputDialog("Digite o número da casa da centena:");
        String dezena = JOptionPane.showInputDialog("Digite o número da casa da dezena:");
        String unidade = JOptionPane.showInputDialog("Digite o número da casa da unidade:");
        //concatenando
        String numeroCompleto = milhar + centena + dezena + unidade;
        //Saida na Tela
        JOptionPane.showMessageDialog(null, "O número formado é: " + numeroCompleto);
    }
}
