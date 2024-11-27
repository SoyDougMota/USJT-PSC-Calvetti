interface A {
    default void mover() {
        System.out.println("Movendo de A");
    }
}

interface B {
    default void mover() {
        System.out.println("Movendo de B");
    }
}

class C implements A, B {
    @Override
    public void mover() {
        A.super.mover(); // Especifica qual método usar
    }
}

public class TesteDeadlyDiamond {
    public static void main(String[] args) {
        C c = new C();
        c.mover();
    }
}
