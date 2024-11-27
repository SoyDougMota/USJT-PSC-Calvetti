class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    String getNome() {
        return nome;
    }

    int getIdade() {
        return idade;
    }

    boolean isMaiorDeIdade() {
        return idade >= 18;
    }
}

public class TesteAltaCoesão {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 20);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Maior de idade: " + pessoa.isMaiorDeIdade());
    }
}
