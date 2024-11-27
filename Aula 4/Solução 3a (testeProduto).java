import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));

        Produto produto = new Produto(nome, preco, quantidade);

        JOptionPane.showMessageDialog(null, 
            "Produto criado:\nNome: " + produto.getNome() +
            "\nPreço: " + produto.getPreco() +
            "\nQuantidade: " + produto.getQuantidade()
        );
    }
}
