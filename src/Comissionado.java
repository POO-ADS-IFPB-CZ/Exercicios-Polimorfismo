import java.time.LocalDate;

public class Comissionado extends Funcionario {

    private float totalVendas;
    private float comissao;

    public Comissionado(String cpf, String nome, LocalDate nascimento, float totalVendas, float comissao) {
        super(cpf, nome, nascimento);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularPagamento(){
        return totalVendas*comissao/100;
    }

}
