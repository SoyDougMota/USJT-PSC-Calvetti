import javax.swing.JOptionPane;

public class Solucao1c {
    public static void main(String[] args) {
        //Entrada Dia/Mês/Ano
        String dia = JOptionPane.showInputDialog("Digite o dia:");
        String mes = JOptionPane.showInputDialog("Digite o mês:");
        String ano = JOptionPane.showInputDialog("Digite o ano:");
        //Saida na tela
        JOptionPane.showMessageDialog(null, "A data é: " + dia + "/" + mes + "/" + ano);
    }
}
