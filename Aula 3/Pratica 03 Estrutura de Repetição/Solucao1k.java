public class Solucao1k {
    public static void main(String[] args) {
        // Simulação dos dados de consumidores
        int[][] consumidores = {
            {1, 500, 1},  // {código, kWh consumidos, tipo}
            {2, 1000, 2},
            {3, 1500, 3},
            {0, 0, 0}     // Código 0 encerra a execução
        };

        double[] totalPorTipo = new double[3];
        int totalTipo1 = 0, totalTipo2 = 0;

        for (int[] consumidor : consumidores) {
            if (consumidor[0] == 0) break;

            double precoPorKWh = 0;
            switch (consumidor[2]) {
                case 1: precoPorKWh = 0.3; break;
                case 2: precoPorKWh = 0.5; break;
                case 3: precoPorKWh = 0.7; break;
            }

            double custoTotal = consumidor[1] * precoPorKWh;
            System.out.println("Custo total para consumidor " + consumidor[0] + ": R$ " + custoTotal);
            totalPorTipo[consumidor[2] - 1] += consumidor[1];

            if (consumidor[2] == 1) totalTipo1 += consumidor[1];
            if (consumidor[2] == 2) totalTipo2 += consumidor[1];
        }

        System.out.println("Total consumo residencial: " + totalPorTipo[0]);
        System.out.println("Total consumo comercial: " + totalPorTipo[1]);
        System.out.println("Total consumo industrial: " + totalPorTipo[2]);
        System.out.println("Média consumo tipos 1 e 2: " + (totalTipo1 + totalTipo2) / 2.0);
    }
}
