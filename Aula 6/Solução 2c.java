public class Empregado extends PessoaFisica {
    private String cargo;
    private double salario;

    public Empregado() {
        super();
        this.cargo = "Cargo Padrão";
        this.salario = 0.0;
    }

    public Empregado(String nome, String sobrenome, String cpf, String cargo, double salario) {
        super(nome, sobrenome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    public void setCargo(String cargo) { this.cargo = cargo; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String dados() {
        return super.dados() + ", Cargo: " + cargo + ", Salário: R$ " + salario;
    }
}
