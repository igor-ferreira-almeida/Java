package br.com.sparsis.interfaces_funcionais;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto produto = new Produto("iPad", 5000.054, 0.2);

        Function<Produto, Double> calculaDesconto = p -> p.getPreco() * (1 - p.getDesconto());
        UnaryOperator<Double> calculaImpostoMunicipal = (precoReal) -> {
            return precoReal >= 2_500 ? precoReal * (1 - 0.085) : precoReal;
        };

        UnaryOperator<Double> calculaFrete = (precoLiquido) -> precoLiquido >= 3000 ? precoLiquido + 100.0 : precoLiquido + 50.0;

        UnaryOperator<Double> precoComDuasCasas = (preco) -> {
            BigDecimal bd = new BigDecimal(preco).setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        };

        Function<Double, String> padraoMoeda = (preco) -> {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            return "R$ " + decimalFormat.format(preco);
        };


        String preco = calculaDesconto.andThen(calculaImpostoMunicipal).andThen(calculaFrete).andThen(precoComDuasCasas).andThen(padraoMoeda).apply(produto);

        System.out.println(preco);

    }
}
