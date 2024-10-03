public class Solucao1f {
    public static void main(String[] args) {
        int[] numeros = {4, 9, 16, -999}; // Simulação de números digitados
        for (int numero : numeros) {
            if (numero == -999) {
                break;
            }
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
            System.out.println("Inverso: " + (1.0 / numero));
        }
    }
}
