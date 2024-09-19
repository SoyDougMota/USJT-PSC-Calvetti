import javax.swing.JOptionPane;

public class Solucao1l {
    public static void main(String[] args) {
        String sData = JOptionPane.showInputDialog("Digite a data no formato dd/mm/aa:");
        String[] partes = sData.split("/");
        
        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];
        
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
