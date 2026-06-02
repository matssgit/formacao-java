package je26_java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    static void main(String[] args) {

        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(new Cadastro("Joemia Giron Lyrio Monnerat", "F", 8321485886L, LocalDate.of(1984, 6, 30), 35.0, false));
        cadastros.add(new Cadastro("Reginaldo Folly Barboza Brito", "M", 2127056726L, LocalDate.of(1990, 3, 17), 40.0, true));
        cadastros.add(new Cadastro("Mariza Gadelha Bastida Carneiro", "F", 9124168455L, LocalDate.of(1889, 8, 18), 40.0, false));
        cadastros.add(new Cadastro("Mirian Venancio Portela Ignacia", "M", 6832598389L, LocalDate.of(1975, 11, 21), 29.0, true));

        escreverLayoutDelimitado(cadastros);

        lerLayoutDelimitado();

        escreverLayoutPosicional(cadastros);
        lerLayoutPosicional();
    }

    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {
        System.out.println("***** - Layout Delimitado - *****");

        try {
            StringBuilder conteudo = new StringBuilder();

            for (Cadastro cadastro : cadastros) {
                conteudo.append(cadastro.getNome()).append(";");
                conteudo.append(cadastro.getSexo()).append(";");
                conteudo.append(cadastro.getTelefone()).append(";");
                conteudo.append(cadastro.getDataNascimento()).append(";");
                conteudo.append(cadastro.getValorSugerido()).append(";");
                conteudo.append(cadastro.isCliente()).append(";");
            }
            System.out.println(conteudo.toString());

            Path arquivoDestino = Paths.get("C:\\rocket\\lista-contatos-modelo-delimitado.csv");

            Files.writeString(arquivoDestino, conteudo.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("");
    }

    public static List<Cadastro> lerLayoutDelimitado() {
        List<Cadastro> cadastros = new ArrayList<>();

        try {

            Path arquivoOrigem = Paths.get("C:\\rocket\\lista-contatos-modelo-delimitado.csv");

            List<String> linhas = Files.readAllLines(arquivoOrigem);

            for (String linha : linhas) {
                String[] colunas = linha.split("\\;");
                String nome = colunas[0];
                String sexo = colunas[1];
                Long telefone = Long.valueOf(colunas[2]);
                LocalDate dataNascimento = LocalDate.parse(colunas[3]);
                Double valorSugerido = Double.valueOf(colunas[4]);
                boolean cliente = Boolean.valueOf(colunas[5]);

//                criando um novo cadastro e adicionando na lista de acordo com os valores
                cadastros.add(new Cadastro(nome, sexo, telefone, dataNascimento, valorSugerido, cliente));


            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cadastros;

    }

    public static void escreverLayoutPosicional(List<Cadastro> cadastros) {
        try {
            System.out.println("***** - Layout Posicional - *****");

            StringBuilder conteudo = new StringBuilder();
            for (Cadastro cadastro : cadastros) {
                String nome = cadastro.getNome();
//                calma, não será assim sempre...
                if (nome.length() > 30) {
                    nome = nome.substring(0, 30);
                }

                if (nome.length() < 30) {
                    nome = String.format("%-30s", nome);

                    conteudo.append(nome);
                    conteudo.append(cadastro.getSexo().toUpperCase());
                    conteudo.append(cadastro.getTelefone());
                    conteudo.append(cadastro.getDataNascimento());

                    DecimalFormat decimalFormat = new DecimalFormat("#0000.00");

                    String valorFormatado = decimalFormat.format(cadastro.getValorSugerido());

                    conteudo.append(valorFormatado.replaceAll("\\,", "\\/"));
                    conteudo.append(cadastro.isCliente() ? "1" : "0");

//                    nova linha
                    conteudo.append(System.lineSeparator());
                }

                System.out.println(conteudo.toString());

                Path arquivoDestino = Paths.get("C:\\rocket\\lista-contatos-modelo-posicional.txt");

                Files.writeString(arquivoDestino, conteudo.toString(), StandardCharsets.UTF_8);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


    public static void lerLayoutPosicional() {
        List<Cadastro> cadastros = new ArrayList<>();

        try {
            // 1. Definição do caminho correto do arquivo posicional
            Path arquivoOrigem = Paths.get("C:\\rocket\\lista-contatos-modelo-posicional.txt");

            // 2. Leitura de todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(arquivoOrigem);

            for (String linha : linhas) {
                // Se a linha estiver vazia, pula para a próxima
                if (linha.isBlank()) continue;

                // 3. Corte das posições fixas (Substring)
                String nome = linha.substring(0, 30).trim();
                String sexo = linha.substring(30, 31).trim();
                Long telefone = Long.valueOf(linha.substring(31, 41).trim());
                LocalDate dataAniversario = LocalDate.parse(linha.substring(41, 51).trim());

                // Tratamento do valor: recupera o pedaço e desfaz o replace de "," por "/"
                String valorTexto = linha.substring(51, 58).trim().replace("/", ".");
                Double valorSugerido = Double.valueOf(valorTexto);

                // Se o caractere for "1", vira true. Se for qualquer outra coisa (como "0"), vira false
                boolean cliente = linha.substring(58, 59).equals("1");

                // 4. Criação do objeto e adição na lista
                cadastros.add(new Cadastro(nome, sexo, telefone, dataAniversario, valorSugerido, cliente));
            }

            System.out.println("Total de registros lidos (Posicional): " + cadastros.size());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


};
