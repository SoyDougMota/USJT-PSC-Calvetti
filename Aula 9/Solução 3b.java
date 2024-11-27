import java.util.ArrayList;

public class BancoDeClientes {
    // Atributo para armazenar os clientes
    private ArrayList<Cliente> clientes;

    // Construtor da classe
    public BancoDeClientes() {
        clientes = new ArrayList<>();
    }

    // Método para adicionar um cliente
    public void inserirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para remover um cliente pelo ID
    public boolean removerCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente);
                return true;
            }
        }
        return false; // Retorna false se não encontrar o cliente
    }

    // Método para alterar os dados de um cliente pelo ID
    public boolean alterarCliente(int id, String novoNome, String novoFone) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNome(novoNome);
                cliente.setFone(novoFone);
                return true;
            }
        }
        return false; // Retorna false se não encontrar o cliente
    }

    // Método para listar os dados de um cliente pelo ID
    public void listarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.exibirInformacoes();
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    // Método para listar todos os clientes
    public void listarTodosClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                cliente.exibirInformacoes();
                System.out.println();
            }
        }
    }
}
