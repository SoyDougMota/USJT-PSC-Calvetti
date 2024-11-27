import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // Vetor para armazenar 5 números
        int maior = Integer.MIN_VALUE; // Inicializa o maior como o menor valor possível

        // Loop para leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog(null, 
                "Digite o número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(entrada);

            // Verifica se o número atual é maior que o maior conhecido
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // Exibe o maior número
        JOptionPane.showMessageDialog(null, 
            "O maior número é: " + maior);
    }
}
