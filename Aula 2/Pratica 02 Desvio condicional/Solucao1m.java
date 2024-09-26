public class Solucao1m {
    public static void main(String[] args) {
        int numero = 345;
        int dezenas = (numero / 10) % 10;

        if (dezenas % 2 == 0) {
            System.out.println("O algarismo das dezenas é par");
        } else {
            System.out.println("O algarismo das dezenas é ímpar");
        }
    }
}
