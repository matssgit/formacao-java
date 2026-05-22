package je09_controle_fluxo_condicional;

public class CaixaEletronico {
    static void main(String[] args) {
        // CaixaEletronico.java
        double saldo = 17.0;
        double valorSolicitado = 17.0;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println(saldo);
    }

}

