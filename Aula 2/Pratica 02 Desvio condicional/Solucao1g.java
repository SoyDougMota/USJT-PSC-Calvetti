public class Solucao1g {
    public static void main(String[] args) {
        String nome = "Maria";
        char sexo = 'F';
        int idade = 22;

        if ((sexo == 'F' || sexo == 'f') && idade < 25) {
            System.out.println(nome + ": ACEITA");
        } else {
            System.out.println(nome + ": NÃO ACEITA");
        }
    }
}
