package je26_java_nio;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    static void main(String[] args) {
        File diretorio = new File("C:\\rocket\\curso-java");

        System.out.println("Diretório existe? " + diretorio.exists());
        if (!diretorio.exists()) {
            diretorio.mkdirs();
            System.out.println("Foi criado o diretório");
        }

        try {

            File arquivo = new File(diretorio, "aula-java.txt");
            System.out.println("Arquivo existe? " + arquivo.exists());

            arquivo.createNewFile();
            System.out.println("Arquivo criado? " + arquivo.exists());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
