package je12_POO.enums;

public class SistemaEnumeracao {
    static void main(String[] args) {
        String nomeString = "sao paulo";
        for (EstadoBrasileiro eb : EstadoBrasileiro.values()) {
            System.out.println("ESTADO LOCALIZADO: " + eb.getNome() + " - " + eb.getSigla());
            ;
        }
    }
}
