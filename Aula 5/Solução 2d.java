public class CaixaEletronico {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("Agência Central", 7890, 5);
        ContaCorrente conta = new ContaCorrente(1234, agencia, 150.00);
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);

        System.out.println(cliente.getDados());

        // Operações
        double saque1 = conta.sacar(140.0);
        System.out.println("Saque: " + saque1);
        conta.imprimirSaldo();

        double saque2 = conta.sacar(200.0);
        System.out.println("Saque: " + saque2);
        conta.imprimirSaldo();

        conta.depositar(25.45);
        conta.imprimirSaldo();
    }
}
