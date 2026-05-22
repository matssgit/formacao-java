package je09_controle_fluxo_condicional;

// Resultado Escolar
public class ResultadoEscolar {
    static void main(String[] args) {
        int nota = 4;

        String result = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(result);

    }
}
