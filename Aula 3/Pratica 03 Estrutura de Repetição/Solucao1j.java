public class Solucao1j {
    public static void main(String[] args) {
        int[] numeros = {12, 25, -999}; // Simulação de números digitados
        for (int numero : numeros) {
            if (numero == -999) {
                break;
            }
            System.out.print("Divisores de " + numero + ": ");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
