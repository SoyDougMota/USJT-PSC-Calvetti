public class Solucao18 {
    public static void main(String[] args) {
        int limiteInferior = -10;  // Exemplo de valor fixo
        int limiteSuperior = 100;  // Exemplo de valor fixo
        int incremento = 10;       // Exemplo de valor fixo

        System.out.println("Celsius\tFahrenheit");
        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("%d\t%.2f\n", celsius, fahrenheit);
        }
    }
}
