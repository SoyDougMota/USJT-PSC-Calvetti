public class Solucao1d {
    public static void main(String[] args) {
        int[] numeros = {150, 80, 175, 220, 105}; // Simulação de números digitados
        int count = 0;
        for (int numero : numeros) {
            if (numero >= 100 && numero <= 200) {
                count++;
            }
        }
        System.out.println("Números entre 100 e 200: " + count);
    }
}
