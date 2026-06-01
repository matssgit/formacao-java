package je25_java_time;

import java.text.Normalizer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class LocalDateSample {
    static void main(String[] args) {

        LocalDate data = LocalDate.of(2026, 5, 27);

        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("fi", "FI"), Locale.UK};

        for (Locale locale : locales) {
            String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(dataFormatada);
        }
    }
};
