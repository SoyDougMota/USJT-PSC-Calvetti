public class Solucao1e {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Paulo", "Carlos", "FIM"}; // Simulação de nomes digitados
        for (String nome : nomes) {
            if (nome.equals("FIM")) {
                break;
            }
            System.out.println(nome);
        }
    }
}
