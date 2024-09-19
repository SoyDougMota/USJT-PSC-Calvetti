import javax.swing.JOptionPane;

public class Solucao1k {
    public static void main(String[] args) {
        String sData = JOptionPane.showInputDialog("Digite a data no formato ddmmaa:");
        int data = Integer.parseInt(sData);
        
        int dia = data / 10000;
        int mes = (data % 10000) / 100;
        int ano = data % 100;
        
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
