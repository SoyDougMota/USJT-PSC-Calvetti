import javax.swing.JOptionPane;

public class Solucao1e {
    public static void main(String[] args) {
        // Entrada dos Caracter
        String caractere1 = JOptionPane.showInputDialog("Digite o primeiro caractere:");
        String caractere2 = JOptionPane.showInputDialog("Digite o segundo caractere:");
        String caractere3 = JOptionPane.showInputDialog("Digite o terceiro caractere:");
        String caractere4 = JOptionPane.showInputDialog("Digite o quarto caractere:");
        String caractere5 = JOptionPane.showInputDialog("Digite o quinto caractere:");
        String caractere6 = JOptionPane.showInputDialog("Digite o sexto caractere:");
        String caractere7 = JOptionPane.showInputDialog("Digite o sétimo caractere:");
        String caractere8 = JOptionPane.showInputDialog("Digite o oitavo caractere:");
        String caractere9 = JOptionPane.showInputDialog("Digite o nono caractere:");
        String caractere10 = JOptionPane.showInputDialog("Digite o décimo caractere:");

        // Juntando os Caracter
        String palavra = caractere1 + caractere2 + caractere3 + caractere4 + caractere5 +
                         caractere6 + caractere7 + caractere8 + caractere9 + caractere10;

        // Saida da Palavra
        JOptionPane.showMessageDialog(null, "A palavra formada é: " + palavra);
    }
}
