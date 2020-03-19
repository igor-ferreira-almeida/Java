package br.com.sparsis.interfaces_funcionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<List<String>> listaDeNomes = () -> Arrays.asList("Abel", "Melissa", "Sofia", "Órion");
        List<String> nomes = listaDeNomes.get();

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
