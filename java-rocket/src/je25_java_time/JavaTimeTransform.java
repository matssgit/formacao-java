package je25_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimeTransform {
    static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.of(19, 17, 21);

        esperaDataHora(localDate.atTime(localTime));

    }

    static void esperaDataHora(LocalDateTime data) {
        System.out.println("Data e hora recebida: " + data);
    }
}
