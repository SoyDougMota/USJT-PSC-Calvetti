import javax.swing.*;

public class CadastroApp {
    public static void main(String[] args) {
        BancoDeClientes banco = new BancoDeClientes(); // Criando o banco de clientes
        boolean continuar = true;

        while (continuar) {
            // Exibe o menu de opções
            String menu = "Escolha uma opção:\n"
                + "1. Inserir Cliente\n"
                + "2. Remover Cliente\n"
                + "3. Alterar Cliente\n"
                + "4. Listar Cliente\n"
                + "5. Listar Todos os Clientes\n"
                + "6. Sair";

            String escolhaStr = JOptionPane.showInputDialog(null, menu);
            int escolha = Integer.parseInt(escolhaStr);

            switch (escolha) {
                case 1:
                    // Inserir Cliente
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    String fone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente:"));
                    
                    Cliente novoCliente = new Cliente(nome, fone, id);
                    banco.inserirCliente(novoCliente);
                    JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
                    break;
                
                case 2:
                    // Remover Cliente
                    int idRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente a ser removido:"));
                    boolean removido = banco.removerCliente(idRemover);
                    if (removido) {
                        JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                    break;
                
                case 3:
                    // Alterar Cliente
                    int idAlterar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente a ser alterado:"));
                    String novoNome = JOptionPane.showInputDialog("Digite o novo nome do cliente:");
                    String novoFone = JOptionPane.showInputDialog("Digite o novo telefone do cliente:");
                    
                    boolean alterado = banco.alterarCliente(idAlterar, novoNome, novoFone);
                    if (alterado) {
                        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                    break;
                
                case 4:
                    // Listar Cliente
                    int idListar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente para listar:"));
                    banco.listarCliente(idListar);
                    break;
                
                case 5:
                    // Listar Todos os Clientes
                    banco.listarTodosClientes();
                    break;
                
                case 6:
                    // Sair
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }
}
