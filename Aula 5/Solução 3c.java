public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr arCondicionado = new CondicionadorDeAr();

        // Tenta aumentar a temperatura com o ar desligado
        arCondicionado.aumentarTemperatura();

        // Liga o ar condicionado
        arCondicionado.ligar();

        // Aumenta a temperatura além do limite
        for (int i = 0; i < 15; i++) {
            arCondicionado.aumentarTemperatura();
        }

        // Reduz a temperatura além do limite
        for (int i = 0; i < 20; i++) {
            arCondicionado.reduzirTemperatura();
        }

        // Ajusta dentro dos limites e imprime a temperatura
        arCondicionado.aumentarTemperatura();
        arCondicionado.aumentarTemperatura();
        arCondicionado.imprimirTemperatura();

        // Desliga o ar condicionado e tenta interagir
        arCondicionado.desligar();
        arCondicionado.imprimirTemperatura();
    }
}
