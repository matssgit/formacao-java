package je26_java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");
            String conteudo = "Conteúdo do arquivo";
            byte[] bytesArquivo = conteudo.getBytes(StandardCharsets.UTF_8);
            Files.write(path, bytesArquivo);

            byte[] bytesLidos = Files.readAllBytes(path);
            System.out.println(Arrays.toString(bytesLidos));
            System.out.println(new String(bytesLidos, StandardCharsets.UTF_8));

//            Como são bytes podemos criar uma String a partir de agora
            List<String> linhas = Files.readAllLines(path);
            linhas.forEach(System.out::println);
            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));

            escrevendoLinha();
            escrevendoArrayList();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void escrevendoLinha() {
        try {
            Path path = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");
            String conteudo = "PALOMA SANTANA";
            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    static void escrevendoArrayList() {


        try {
            Path paths = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");
            List<String> nomes = new ArrayList<>();
            nomes.add("Matheus");
            nomes.add("Paloma");

            StringBuilder conteudo = new StringBuilder();
            nomes.forEach(n -> conteudo.append(n).append(", "));
            Files.write(paths, conteudo.toString().getBytes(StandardCharsets.UTF_8));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
};
