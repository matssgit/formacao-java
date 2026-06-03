package je_27_excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class Excecoes {
    static void main(String[] args) {

        try {
            CheckEstado("ma");
        } catch (EstadoValidateException e) {
            System.out.println(e.getMessage() + "\nSelecione um estado válido");
        }
    }

    static void CheckEstado(String nomeEstado) throws EstadoValidateException {
        if (!nomeEstado.equalsIgnoreCase("PI")) {
            throw new EstadoValidateException();
        } else {
            System.out.println("Bem vindo ao: " + nomeEstado.toUpperCase());
        }

    }
}
