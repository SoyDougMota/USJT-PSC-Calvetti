interface ItemCarrinho {
    double getPreco();
}

class Produto implements ItemCarrinho {
    private String nome;
    private double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}

class CarrinhoDeCompras {
    void adicionarItem(ItemCarrinho item) {
        System.out.println("Item adicionado ao carrinho: R$" + item.getPreco());
    }
}

public class TesteBaixoAcoplamento {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto = new Produto("Notebook", 2500.0);
        carrinho.adicionarItem(produto);
    }
}
