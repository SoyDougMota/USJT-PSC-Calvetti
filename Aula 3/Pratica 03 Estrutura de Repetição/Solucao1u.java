public class Solucao21 {
    public static void main(String[] args) {
        String[] nomes = {"João", "Maria", "Pedro", "Lucas"};  // Exemplo de nomes
        int[] idades = {22, 20, 23, 25};                       // Exemplo de idades
        char[] sexos = {'M', 'F', 'M', 'M'};                   // Exemplo de sexos

        for (int i = 0; i < 4; i++) {
            if (sexos[i] == 'M' && idades[i] > 21) {
                System.out.println(nomes[i]);
            }
        }
    }
}
