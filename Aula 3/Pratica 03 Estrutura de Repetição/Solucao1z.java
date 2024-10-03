public class Solucao26 {
    public static void main(String[] args) {
        double num1 = 10.0;  // Exemplo de valor fixo
        double num2 = 5.0;   // Exemplo de valor fixo
        int opcao;

        do {
            opcao = 1;  // Exemplo de opção fixada (deve ser lido dinamicamente)

            switch (opcao) {
                case 1:
                    System.out.println("Soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Divisão: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 9);
    }
}
