class Animal {
    void mover() {
        System.out.println("O animal está se movendo.");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("O cachorro está latindo.");
    }
}

public class TesteRelacionamento {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.mover(); // Método herdado
        cachorro.latir(); // Método próprio
    }
}
