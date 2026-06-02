package je26_java_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListaContatos {
    public static void main(String[] args) {
        try {

            List<String> contatos = new ArrayList<>();
            contatos.add("(83) 2148-5886 Joemia Giron Lyrio Monnerat");
            contatos.add("(21) 2705-6726 Reginaldo Folly Barboza Brito");
            contatos.add("(91) 2416-8455 Mariza Gadelha Bastida Carneiro");
            contatos.add("(68) 3259-9390 Mirian Venancio Portela Ignacia");

            Path arquivoDestino = Paths.get("C:\\rocket\\lista-contatos.txt");

            if (arquivoDestino.getParent() != null) {
                Files.createDirectories(arquivoDestino.getParent());
            }

            Files.write(arquivoDestino, contatos);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}
