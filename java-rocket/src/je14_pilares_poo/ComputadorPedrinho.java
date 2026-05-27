package je14_pilares_poo;

import java.util.Scanner;

public class ComputadorPedrinho {
    static void main(String[] args) {
        SistemaMensagemInstantanea smi = null;

        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */

        String appEscolhido = "telegram";


        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("telegram")) {
            smi = new Telegram();
        } else {
            System.out.println("Erro");
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
