public class Teste {
    public static void main(String[] args) {
        // Teste com PessoaFisica
        PessoaFisica pessoa = new PessoaFisica("João", "Silva", "123.456.789-00");
        System.out.println(pessoa.dados());

        // Teste com Desempregado
        Desempregado desempregado = new Desempregado("Maria", "Oliveira", "987.654.321-00", 1200.00);
        System.out.println(desempregado.dados());

        // Teste com Empregado
        Empregado empregado = new Empregado("Carlos", "Santos", "456.789.123-00", "Analista", 3500.00);
        System.out.println(empregado.dados());

        // Teste com Mensalista
        Mensalista mensalista = new Mensalista("Ana", "Lima", "789.123.456-00", "Gerente", 4500.00, 500.00);
        System.out.println(mensalista.dados());
    }
}
