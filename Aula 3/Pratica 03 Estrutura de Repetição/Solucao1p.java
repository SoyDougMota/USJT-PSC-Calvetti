import javax.swing.JOptionPane;

public class Solucao16 {
    public static void main(String[] args){

        String input = JOptionPane.showInputDialog("Digite o numero escolhido:");
        int numero = Integer.parseInt(input);
        int a = 0, b = 1, next = 0;

        System.out.println("Sequencia de Fibonacci até" + numero + ":");

        while(next <= numero){
            System.out.print(next + "");
            next = a + b;
            a = b;
            b = next;
        }
    }
}