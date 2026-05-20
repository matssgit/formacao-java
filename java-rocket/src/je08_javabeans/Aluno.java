package je08_javabeans;

public class Aluno {
    private String nome;
    private int idade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int newIdade) {
        if (newIdade < 0 || newIdade > 150) {
            throw new IllegalArgumentException("idade inválida");
        }
        this.idade = newIdade;
    }
}
