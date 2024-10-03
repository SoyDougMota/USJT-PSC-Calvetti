public class Solucao1c {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; // Simulação de números digitados
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / (double) numeros.length;
        System.out.println("A média é: " + media);
    }
}
