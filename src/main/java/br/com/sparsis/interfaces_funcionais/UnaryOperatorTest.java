package br.com.sparsis.interfaces_funcionais;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        Integer resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);

        System.out.println(resultado);


        Integer resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);

        System.out.println(resultado2);
    }
}
