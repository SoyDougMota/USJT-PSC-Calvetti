abstract class Forma {
    abstract double calcularArea();
    abstract double calcularPerimetro();
}

class Circulo extends Forma {
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

public class TesteClassesAbstratas {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5.0);
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}
