package je08_javabeans;

public class Objetos {
    static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Moura");
        felipe.setIdade(6);
        System.out.println("Nome do aluno: " + felipe.getNome());
        System.out.println("Idade do aluno: " + felipe.getIdade());
    }
}
