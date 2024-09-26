public class Solucao1x {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 20;
        int num4 = 8;
        int num5 = 15;

        int maior = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int menor = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
