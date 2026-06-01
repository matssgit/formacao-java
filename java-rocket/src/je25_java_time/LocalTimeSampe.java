package je25_java_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSampe {
    static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMais30Minutos = horaAtual.plusMinutes(30);
        LocalTime horaAtualMenos2Horas = horaAtual.minusHours(2);

        boolean passado = horaAtual.isBefore(horaAtualMenos2Horas);

        System.out.println("Hora atual: " + horaAtual);
        System.out.println("Hora atual mais 30 minutos: " + horaAtualMais30Minutos);
        System.out.println("Hora atual menos 2 horas: " + horaAtualMenos2Horas);

        System.out.println("Hora atual é antes de hora atual menos 2 horas? " + passado);

        HoraFormatada();
        HoraComGet();
    }

    static void HoraFormatada() {
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String horaFormatada = horaAtual.format(formatter);
        System.out.println("");
        System.out.println("Hora atual: " + horaAtual);
        System.out.println("Hora atual formatada: " + horaFormatada);
    }

    static void HoraComGet() {
        LocalTime horaAtual = LocalTime.now();

        System.out.println("");
        System.out.println("Hora atual: " + horaAtual.getHour());
        System.out.println("Minuto atual: " + horaAtual.getMinute());
        System.out.println("Segundo atual: " + horaAtual.getSecond());
        System.out.println("Milissegundo atual: " + horaAtual.getNano());
    }
}
