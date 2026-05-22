package je10_controle_fluxo_repeticao;

import java.util.Random;

// Exemplo de ligação telefonica
public class ExemploDoWhile {

    private static int numeroTentativas = 0;
    private static final Random RANDOM = new Random();

    static void main(String[] args) {
        System.out.println("Discando...");

        do {
//            Executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando - trim trim");
        } while (tocando());


    }

    private static boolean tocando() {
        boolean atendeu = RANDOM.nextInt(5) == 1;
        numeroTentativas++;

        if (atendeu) {
            System.out.println("Alô !!?");
            return false;
        }

        if (numeroTentativas >= 5) {
            System.out.println("Número de tentativas esgotado. Desligando...");
            return false;
        }

        return true;
    }
};
