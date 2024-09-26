public class Solucao1d {
    public static void main(String[] args) {
        int num1 = 12, num2 = 5, num3 = 9;

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
    }
}
