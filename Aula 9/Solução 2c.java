import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Deposito deposito = new Deposito(); // Cria o objeto Deposito
        boolean continuar = true;
        
        while (continuar) {
            // Exibe o menu de opções
            String menu = "Escolha uma opção:\n"
                + "1. Adicionar caixa\n"
                + "2. Remover caixa\n"
                + "3. Procurar caixa\n"
                + "4. Mudar caixa\n"
                + "5. Listar caixas mais pesadas que 10.0\n"
                + "6. Sair";
            
            String escolhaStr = JOptionPane.showInputDialog(null, menu);
            int escolha = Integer.parseInt(escolhaStr);
            
            switch (escolha) {
                case 1:
                    // Adicionar caixa
                    String corredor = JOptionPane.showInputDialog("Digite o corredor:");
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:"));
                    String dono = JOptionPane.showInputDialog("Digite o nome do dono:");
                    
                    Caixa novaCaixa = new Caixa(corredor, posicao, peso, dono);
                    deposito.adicionarCaixa(novaCaixa);
                    JOptionPane.showMessageDialog(null, "Caixa adicionada com sucesso!");
                    break;
                
                case 2:
                    // Remover caixa pelo dono
                    String donoRemover = JOptionPane.showInputDialog("Digite o nome do dono da caixa a remover:");
                    boolean removido = deposito.removerCaixaPorDono(donoRemover);
                    if (removido) {
                        JOptionPane.showMessageDialog(null, "Caixa removida com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada!");
                    }
                    break;
                
                case 3:
                    // Procurar caixa pelo dono
                    String donoProcurar = JOptionPane.showInputDialog("Digite o nome do dono da caixa para procurar:");
                    int posicaoCaixa = deposito.encontrarCaixaPorDono(donoProcurar);
                    if (posicaoCaixa != -1) {
                        JOptionPane.showMessageDialog(null, "Caixa encontrada na posição: " + posicaoCaixa);
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada!");
                    }
                    break;
                
                case 4:
                    // Mudar corredor e posição da caixa
                    String donoMudar = JOptionPane.showInputDialog("Digite o nome do dono da caixa para mudar:");
                    String novoCorredor = JOptionPane.showInputDialog("Digite o novo corredor:");
                    int novaPosicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova posição:"));
                    boolean alterado = deposito.alterarCorredorEPosicao(donoMudar, novoCorredor, novaPosicao);
                    if (alterado) {
                        JOptionPane.showMessageDialog(null, "Caixa alterada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada!");
                    }
                    break;
                
                case 5:
                    // Listar caixas mais pesadas que 10.0
                    Caixa[] caixasPesadas = deposito.caixasMaisPesadas(10.0);
                    if (caixasPesadas.length > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (Caixa caixa : caixasPesadas) {
                            sb.append("Dono: ").append(caixa.getDono())
                              .append(", Peso: ").append(caixa.getPeso())
                              .append(" kg\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma caixa encontrada com peso superior a 10.0 kg.");
                    }
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
