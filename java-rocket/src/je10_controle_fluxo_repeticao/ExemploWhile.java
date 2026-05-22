package je10_controle_fluxo_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    static void main(String[] args) {
        double mesada = 50;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            String valorFormatado = String.format("Doce do valor: R$ %.2f", valorDoce);
            System.out.println(valorFormatado + " Adicionado no carrinho.");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Anya gastou toda a sua mesada em doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(4, 20);

    }
}
