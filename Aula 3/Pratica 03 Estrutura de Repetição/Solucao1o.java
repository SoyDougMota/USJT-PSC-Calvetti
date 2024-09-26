public class Solucao1o {
    public static void main(String[] args) {
        int[] numeros = {10, 35, 25, 42, -9999}; // Simulação de números digitados
        int maior = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero == -9999) {
                break;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
    }
}
