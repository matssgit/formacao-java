package je12_POO.comparacao;

public class ComparacaoApp {
    static void main(String[] args) {

        String string = "matheus";
        String string2 = new String("matheus");

        System.out.println(string == string2);
        System.out.println(string.equals(string2));
    }
}
