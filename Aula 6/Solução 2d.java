public class Mensalista extends Empregado {
    private double bonusMensal;

    public Mensalista() {
        super();
        this.bonusMensal = 0.0;
    }

    public Mensalista(String nome, String sobrenome, String cpf, String cargo, double salario, double bonusMensal) {
        super(nome, sobrenome, cpf, cargo, salario);
        this.bonusMensal = bonusMensal;
    }

    public double getBonusMensal() { return bonusMensal; }
    public void setBonusMensal(double bonusMensal) { this.bonusMensal = bonusMensal; }

    @Override
    public String dados() {
        return super.dados() + ", Bônus Mensal: R$ " + bonusMensal;
    }
}
