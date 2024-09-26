public class Solucao1n {
    public static void main(String[] args) {
        int numero = 3456;
        int formado = (numero / 1000) * 10 + (numero / 100) % 10;

        if (formado % 4 == 0) {
            System.out.println("O número formado é múltiplo de 4");
        } else {
            System.out.println("O número formado não é múltiplo de 4");
        }
    }
}
