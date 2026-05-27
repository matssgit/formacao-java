package je13_classes_essenciais;

public class StringBuilderApp {
    static void main(String[] args) {
        String nome = "Matheus";
        nome = nome.concat("Santana");
        nome = nome.concat("Sou desenvolvedor");

        StringBuilder sb = new StringBuilder();
        sb.append("Matheus");
        sb.append("Santana");

        System.out.println(sb.toString());
    }
}
