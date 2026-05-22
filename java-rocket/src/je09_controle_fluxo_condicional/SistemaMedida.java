package je09_controle_fluxo_condicional;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "P";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
