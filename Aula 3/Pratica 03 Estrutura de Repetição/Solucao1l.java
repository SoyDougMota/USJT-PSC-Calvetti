public class Solucao1l {
    public static void main(String[] args) {
        int[] idades = {18, 22, 51, 16, 70, 120, -1}; // Simulação de idades

        int totalMenor21 = 0;
        int totalMaior50 = 0;

        for (int idade : idades) {
            if (idade < 0 || idade > 120) {
                break;
            }
            if (idade < 21) {
                totalMenor21++;
            } else if (idade > 50) {
                totalMaior50++;
            }
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + totalMenor21);
        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaior50);
    }
}
