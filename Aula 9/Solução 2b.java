import java.util.ArrayList;

public class Deposito {
    // Atributo para armazenar as caixas no depósito
    private ArrayList<Caixa> caixas;

    // Construtor da classe
    public Deposito() {
        caixas = new ArrayList<>();
    }

    // Método para adicionar uma caixa
    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    // Método para remover uma caixa pelo nome do dono
    public boolean removerCaixaPorDono(String dono) {
        int index = encontrarCaixaPorDono(dono);
        if (index != -1) {
            caixas.remove(index);
            return true;
        }
        return false;
    }

    // Método para encontrar a posição de uma caixa pelo dono
    public int encontrarCaixaPorDono(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                return i;  // Retorna a posição no ArrayList
            }
        }
        return -1;  // Retorna -1 se não encontrar
    }

    // Método para alterar o corredor e a posição de uma caixa
    public boolean alterarCorredorEPosicao(String dono, String novoCorredor, int novaPosicao) {
        int index = encontrarCaixaPorDono(dono);
        if (index != -1) {
            Caixa caixa = caixas.get(index);
            caixa.setCorredor(novoCorredor);
            caixa.setPosicao(novaPosicao);
            return true;
        }
        return false;
    }

    // Método para encontrar caixas que pesam mais do que um valor passado
    public Caixa[] caixasMaisPesadas(double pesoMinimo) {
        ArrayList<Caixa> caixasPesadas = new ArrayList<>();
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > pesoMinimo) {
                caixasPesadas.add(caixa);
            }
        }
        return caixasPesadas.toArray(new Caixa[0]);  // Retorna um vetor de caixas
    }

    // Método para exibir todas as caixas do depósito
    public void exibirCaixas() {
        for (Caixa caixa : caixas) {
            caixa.exibirInformacoes();
            System.out.println();
        }
    }
}
