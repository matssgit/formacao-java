package je13_classes_essenciais;

public class SystemApp {
    static void main(String[] args) {
        String name = "Matheus";
        Integer idade = 29;
        Double peso = 119.0;
        Double salario = 9458.70;

        System.out.printf("Meu nome é %s, tenho %d anos, peso %.2f kg e ganho R$ %.2f por mês", name, idade, peso, salario);
    }
}
