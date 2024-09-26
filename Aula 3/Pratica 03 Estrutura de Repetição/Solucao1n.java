public class Solucao1n {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 17, 20, 29, -1}; // Simulação de números digitados
        int contadorPrimos = 0;

        for (int numero : numeros) {
            if (numero <= 0) break;

            boolean primo = true;
            if (numero == 1) {
                primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                contadorPrimos++;
            }
        }

        System.out.println("Quantidade de números primos: " + contadorPrimos);
    }
}
