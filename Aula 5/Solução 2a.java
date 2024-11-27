public class Agencia {
    private String nome;
    private int numero;
    private int digito;

    public Agencia(String nome, int numero, int digito) {
        this.nome = nome;
        this.numero = numero;
        this.digito = calcularDigito(numero); // Valida automaticamente o dígito
    }

    public String getNome() { return nome; }
    public int getNumero() { return numero; }
    public int getDigito() { return digito; }

    public void setNome(String nome) { this.nome = nome; }
    public void setNumero(int numero) {
        this.numero = numero;
        this.digito = calcularDigito(numero); // Atualiza o dígito sempre que o número muda
    }

    private int calcularDigito(int numero) {
        int[] pesos = {4, 6, 8, 2};
        int soma = 0;
        String numStr = String.format("%04d", numero);

        for (int i = 0; i < numStr.length(); i++) {
            soma += Character.getNumericValue(numStr.charAt(i)) * pesos[i];
        }
        int resto = soma % 11;
        return (resto == 10) ? 0 : resto;
    }

    public String getDados() {
        return "Agência: " + numero + "-" + digito + " (" + nome + ")";
    }
}
