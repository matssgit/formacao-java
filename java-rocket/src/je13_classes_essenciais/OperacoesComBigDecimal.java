package je13_classes_essenciais;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperacoesComBigDecimal {
    public static void main(String[] args) {
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal resultado = zero.add(new BigDecimal("100"));
        resultado = resultado.subtract(new BigDecimal("27.5"));

        System.out.println(resultado);

        OutroDecimal();
        PrecoPorLitro();

    }

    static void OutroDecimal() {
        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultado2 = BigDecimal.TEN.divide(divisor, 2, RoundingMode.HALF_EVEN);
        System.out.println(resultado2);
    }

    static void PrecoPorLitro() {
        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = litrosUtilizados.multiply(precoLitro);
        System.out.println("Valor a pagar: " + valorPagar);

//        arredondando...
        BigDecimal valorPagarArredondado = valorPagar.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Valor a pagar arredondado: " + valorPagarArredondado);
    }
}
