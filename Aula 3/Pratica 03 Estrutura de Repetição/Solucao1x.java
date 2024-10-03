public class Solucao24 {
    public static void main(String[] args) {
        double total = 0;
        double preco;
        int quantidade;

        do {
            preco = 10;  // Exemplo de valor de preço
            quantidade = 5;  // Exemplo de valor de quantidade

            if (preco > 0 && quantidade > 0) {
                total += preco * quantidade;
            } else if (preco < 0 || quantidade < 0) {
                System.out.println("Valores negativos não são permitidos.");
            }
        } while (quantidade != 0);

        System.out.println("Total a pagar: " + total);
    }
}
