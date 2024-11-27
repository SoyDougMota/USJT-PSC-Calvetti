public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public boolean isLigado() { return ligado; }
    public Termostato getTermostato() { return termostato; }

    public void ligar() {
        ligado = true;
        System.out.println("Condicionador de ar ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Condicionador de ar desligado.");
    }

    public void aumentarTemperatura() {
        if (ligado) {
            int tempAtual = termostato.getTemperatura();
            if (tempAtual < 28) {
                termostato.setTemperatura(tempAtual + 1);
                System.out.println("Temperatura aumentada para: " + termostato.getTemperatura());
            } else {
                System.out.println("Temperatura já está no máximo (28).");
            }
        } else {
            System.out.println("O condicionador de ar está desligado.");
        }
    }

    public void reduzirTemperatura() {
        if (ligado) {
            int tempAtual = termostato.getTemperatura();
            if (tempAtual > 15) {
                termostato.setTemperatura(tempAtual - 1);
                System.out.println("Temperatura reduzida para: " + termostato.getTemperatura());
            } else {
                System.out.println("Temperatura já está no mínimo (15).");
            }
        } else {
            System.out.println("O condicionador de ar está desligado.");
        }
    }

    public void imprimirTemperatura() {
        if (ligado) {
            System.out.println("Temperatura atual: " + termostato.getTemperatura());
        } else {
            System.out.println("O condicionador de ar está desligado.");
        }
    }
}
