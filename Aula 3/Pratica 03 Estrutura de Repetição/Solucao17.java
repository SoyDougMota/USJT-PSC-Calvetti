public class Solucao17{
    public static void main(String[] args){
        double polegadaParaCm = 2.54;

        System.out.println("Tabela de conversão de Polegadas para centímetros:");
        System.out.println("Polegadas\tCentímetros");
        for (int polegada = 1; polegada <= 20; polegada++){
            double centimetros = polegada * polegadaParaCm;
            System.out.println(polegada + "\t\t" + centimetros);
        }
    }
}