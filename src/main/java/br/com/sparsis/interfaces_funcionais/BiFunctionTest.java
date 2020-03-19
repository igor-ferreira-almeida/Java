package br.com.sparsis.interfaces_funcionais;

import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Double, Double, String> media = (n1, n2) -> {
            double resultado = (n1 + n2) / 2;
            return resultado >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(media.apply(9.7, 6.7));
    }
}
