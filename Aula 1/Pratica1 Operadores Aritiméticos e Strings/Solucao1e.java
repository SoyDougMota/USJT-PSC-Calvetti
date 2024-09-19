import javax.swing.JOptionPane;

public class Solucao1e {
    public static void main(String[] args) {
        String sVI = JOptionPane.showInputDialog("Digite o valor inicial da dívida:");
        String sJuros = JOptionPane.showInputDialog("Digite a taxa de juros (em %):");
        String sMM = JOptionPane.showInputDialog("Digite o número de meses:");

        double valorInicial = Double.parseDouble(sVI);
        double juros = Double.parseDouble(sJuros);
        double meses = Double.parseDouble(sMM);

        double valorFinal = valorInicial * Math.pow(1 + (juros / 100), meses);
        JOptionPane.showMessageDialog(null, "O valor final da dívida após " + meses + " meses será: R$ " + valorFinal);
    }
}
