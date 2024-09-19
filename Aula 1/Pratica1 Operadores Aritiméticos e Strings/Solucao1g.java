import javax.swing.JOptionPane;

public class Solucao1g {
    public static void main(String[] args) {
        String sAngulo = JOptionPane.showInputDialog("Digite um ângulo em graus:");
        double angulo = Double.parseDouble(sAngulo);
        double radiano = Math.toRadians(angulo);
        
        double seno = Math.sin(radiano);
        double cosseno = Math.cos(radiano);
        double tangente = Math.tan(radiano);
        double secante = 1 / cosseno;
        double cossecante = 1 / seno;
        double cotangente = 1 / tangente;

        JOptionPane.showMessageDialog(null, "Seno: " + seno + "\nCosseno: " + cosseno + "\nTangente: " + tangente + "\nSecante: " + secante + "\nCossecante: " + cossecante + "\nCotangente: " + cotangente);
    }
}
