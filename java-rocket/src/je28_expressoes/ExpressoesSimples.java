package je28_expressoes;

import java.time.LocalDate;

public class ExpressoesSimples {
    static void main(String[] args) {
        String nome = "Matheus Santana Silva";
        Integer matricula = 23;
        Double salario = 2245.84;
        LocalDate dataAdmissao = LocalDate.now();

        String dadosFuncionario = String.format("Mat. %05d - Nome: %-15.30s - Sal.: R$ %,.2f", matricula, nome, salario);
        System.out.println(dadosFuncionario);
        String dataAdmissaoFormatado = String.format("Data de admissão: %td/%<tm/%<tY", dataAdmissao);
        System.out.println(dataAdmissaoFormatado);
    }
}
