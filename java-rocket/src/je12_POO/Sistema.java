package je12_POO;

public class Sistema {
    static void main(String[] args) {
        Cliente matheus = new Cliente("Matheus Santana");
        System.out.println(matheus.limiteCredito);
        matheus.solicitarLimiteCredito(200.0);
        System.out.println("Limite do(a) " + matheus.nome + " é " + matheus.limiteCredito);

        matheus.comprar(50.0);

        Cliente paloma = new Cliente("Paloma Eduarda");
        System.out.println(paloma.limiteCredito);
        paloma.solicitarLimiteCredito(80.0);
        System.out.println("Limite do(a) " + paloma.nome + " é " + paloma.limiteCredito);
    }
}
