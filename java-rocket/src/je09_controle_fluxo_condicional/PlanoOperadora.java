package je09_controle_fluxo_condicional;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "B":
                System.out.println("Plano Básico - 100 minutos de ligação");
                break;
            case "M":
                System.out.println("Plano Mídia - 100 minutos de ligação + WhatsApp e Instagram grátis");
                break;
            case "T":
                System.out.println("Plano Turbo - 100 minutos de ligação + WhatsApp e Instagram grátis + 5GB Youtube");
                break;
            default:
                System.out.println("Plano inválido");
        }

    }
}
