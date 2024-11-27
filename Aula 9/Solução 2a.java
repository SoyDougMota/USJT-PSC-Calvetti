// Classe Caixa para gerenciar o depósito
public class Caixa {
    // Atributos
    private String corredor;
    private int posicao;
    private double peso;
    private String dono;

    // Construtor da classe
    public Caixa(String corredor, int posicao, double peso, String dono) {
        this.corredor = corredor;
        this.posicao = posicao;
        this.peso = peso;
        this.dono = dono;
    }

    // Métodos de acesso (getters)
    public String getCorredor() {
        return corredor;
    }

    public int getPosicao() {
        return posicao;
    }

    public double getPeso() {
        return peso;
    }

    public String getDono() {
        return dono;
    }

    // Métodos de modificação (setters)
    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    // Método para exibir as informações da Caixa
    public void exibirInformacoes() {
        System.out.println("Corredor: " + corredor);
        System.out.println("Posição: " + posicao);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dono: " + dono);
    }
}
