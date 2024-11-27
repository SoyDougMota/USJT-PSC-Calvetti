interface Animal {
    void fazerSom();
    void mover();
}

class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro está latindo.");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo.");
    }
}

public class TesteInterfaces {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.mover();
    }
}
