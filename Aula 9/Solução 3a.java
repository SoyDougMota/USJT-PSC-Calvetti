public class Cliente {
    // Atributos privados
    private String nome;
    private String fone;
    private int id;

    // Construtor da classe
    public Cliente(String nome, String fone, int id) {
        this.nome = nome;
        this.fone = fone;
        this.id = id;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public int getId() {
        return id;
    }

    // Métodos de modificação (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método para exibir as informações do cliente
    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + fone);
    }
}
