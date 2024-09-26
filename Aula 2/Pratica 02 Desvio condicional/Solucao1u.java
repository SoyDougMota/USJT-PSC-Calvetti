public class Solucao1u {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 30;
        int num3 = 15;

        int maior = Math.max(num1, Math.max(num2, num3));
        System.out.println("O maior número é: " + maior);
    }
}
