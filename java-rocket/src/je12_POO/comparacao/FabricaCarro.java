package je12_POO.comparacao;

public class FabricaCarro {
    static void main(String[] args) {
        Carro carro1 = new Carro("branca", "fiat", "palio");
        Carro carro2 = new Carro("branca", "fiat", "uno");
        Carro carro3 = new Carro("branca", "fiat", "palio");
        Carro carro4 = new Carro("branca", "fiat", "palio");
        Carro carro5 = new Carro("branca", "fiat", "palio");

        Carro carro6 = carro1;

//        case01
        System.out.println(carro1 == carro6);

//        case02
        System.out.println(carro1.equals(carro2));
    }
}
