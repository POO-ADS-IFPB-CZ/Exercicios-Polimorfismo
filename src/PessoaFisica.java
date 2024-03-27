public class PessoaFisica extends Contribuinte{

    private String cpf;
    private float salarioAnual;

    public PessoaFisica(String nome, String cpf, float salarioAnual) {
        super(nome);
        this.cpf = cpf;
        this.salarioAnual = salarioAnual;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(float salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    @Override
    public float calcularImposto(){
        if(salarioAnual < 24511.92){
            return 0;
        }

        if(salarioAnual>=24511.93 && salarioAnual<=33919.80){
            return salarioAnual*0.075f;
        }

        //TODO: Fazer os demais ifs


    }

}
