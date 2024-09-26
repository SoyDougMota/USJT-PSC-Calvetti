public class Solucao1o {
    public static void main(String[] args) {
        int anoNascimento = 1998;
        int anoAtual = 2024;

        if (anoNascimento > 1900 && anoNascimento <= anoAtual) {
            int idade = anoAtual - anoNascimento;
            System.out.println("A pessoa tem " + idade + " anos.");
        } else {
            System.out.println("Ano de nascimento inválido.");
        }
    }
}
