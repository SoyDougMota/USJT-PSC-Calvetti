import javax.swing.*;

public class Exercicio1b {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // Vetor para armazenar 5 números
        int menor = Integer.MAX_VALUE; // Inicializa o menor como o maior valor possível

        // Loop para leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog(null, 
                "Digite o número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(entrada);

            // Verifica se o número atual é menor que o menor conhecido
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe o menor número
        JOptionPane.showMessageDialog(null, 
            "O menor número é: " + menor);
    }
}
