import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Assalariado("111.111.111-01",
                "João", LocalDate.of(2000,1,1),
                2000);
        Funcionario funcionario2 = new Comissionado("222.222.222-02",
                "Maria", LocalDate.of(2000,1,1),
                50000, 3);

        System.out.println(funcionario1.calcularPagamento());
        System.out.println(funcionario2.calcularPagamento());

    }
}