import java.time.LocalDate;

public class Assalariado extends Funcionario{

    private float salario;

    public Assalariado(String cpf, String nome, LocalDate nascimento, float salario) {
        super(cpf, nome, nascimento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public float calcularPagamento(){
        return salario;
    }

}
