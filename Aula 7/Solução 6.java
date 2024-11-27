class Veiculo {
    void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
}

class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("O carro está acelerando mais rápido.");
    }
}

public class TesteHerancaSimples {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro();
        veiculo.acelerar();
    }
}
