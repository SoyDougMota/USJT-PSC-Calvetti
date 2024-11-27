public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int numero, Agencia agencia, double saldo) {
        this.numero = numero;
        this.digito = calcularDigito(numero); // Valida o dígito automaticamente
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumero() { return numero; }
    public int getDigito() { return digito; }
    public Agencia getAgencia() { return agencia; }
    public double getSaldo() { return saldo; }

    public void setNumero(int numero) {
        this.numero = numero;
        this.digito = calcularDigito(numero);
    }

    public void setAgencia(Agencia agencia) { this.agencia = agencia; }

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

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public double sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
            return 0;
        }
    }

    public void imprimirSaldo() {
        System.out.println("Conta: " + numero + "-" + digito);
        System.out.println(agencia.getDados());
        System.out.println("Saldo: R$ " + saldo);
    }
}
