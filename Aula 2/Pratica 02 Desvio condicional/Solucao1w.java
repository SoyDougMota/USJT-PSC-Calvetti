public class Solucao1w {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 50;
        int num3 = 35;

        int maior, intermediario, menor;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                intermediario = num2;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                intermediario = num1;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                intermediario = num1;
                menor = num2;
            } else {
                intermediario = num2;
                menor = num1;
            }
        }

        System.out.println("Maior: " + maior + ", Intermediário: " + intermediario + ", Menor: " + menor);
    }
}
