public class PessoaJuridica extends Contribuinte {

    private String cnpj;
    private float lucro;

    public PessoaJuridica(String cnpj, String nome, float lucro){
        super(nome);
        this.cnpj = cnpj;
        this.lucro = lucro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    @Override
    public float calcularImposto(){
        return lucro*0.15f;
    }

}
