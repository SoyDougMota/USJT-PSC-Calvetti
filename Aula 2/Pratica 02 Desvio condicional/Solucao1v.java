public class Solucao1v {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 45;
        int num3 = 30;

        int maior = Math.max(num1, Math.max(num2, num3));
        System.out.println("Maior número armazenado na variável 'maior': " + maior);
    }
}
