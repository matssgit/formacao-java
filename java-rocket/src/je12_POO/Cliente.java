package je12_POO;

public class Cliente {
    String nome;
    Double limiteCredito = 10.0;

    public void solicitarLimiteCredito(Double valorSolicitado) {
        limiteCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto) {
        limiteCredito -= valorProduto;
    }


    public Cliente(String nome) {
        this.nome = nome;
    }

}
