public class Solucao25 {
    public static void main(String[] args) {
        int[] votos = new int[4];  // Array para contar os votos dos 4 candidatos
        int voto;
        int totalVotos = 0;

        do {
            voto = 2;  // Exemplo de voto fixo (deve ser lido dinamicamente)

            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++;
                totalVotos++;
            } else if (voto != -1) {
                System.out.println("Voto inválido!");
            }
        } while (voto != -1);

        // Imprimir o percentual de votos para cada candidato
        for (int i = 0; i < votos.length; i++) {
            double percentual = (votos[i] * 100.0) / totalVotos;
            System.out.printf("Candidato %d: %.2f%%\n", i + 1, percentual);
        }

        System.out.println("Total de eleitores: " + totalVotos);
    }
}
