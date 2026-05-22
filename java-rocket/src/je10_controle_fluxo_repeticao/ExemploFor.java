package je10_controle_fluxo_repeticao;

import java.util.Random;

public class ExemploFor {
    static void main(String[] args) {
//        int carneirinhos = 0;
//        for (; carneirinhos <= 20; ) {
//            System.out.println(carneirinhos + " - carneirinho(s)");
//            carneirinhos += 2;
//        }
//
//        String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};
//
//        for (int x = 0; x < alunos.length; x++) {
//            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
//        }
//
//        for (String aluno : alunos) {
//            System.out.println(aluno);
//        }


        boolean acordado = true;
        int carneirinhos = 0;
        Random random = new Random();
        while (acordado) {
            System.out.println("Contando carneirinhos ... " + (++carneirinhos));
            acordado = !(random.nextInt(20) == carneirinhos);
        }
        System.out.println("Dormiu!");
    }
}



