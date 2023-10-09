package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio01 {
    public static void main(String[] args) {


        //Desafio 1 - Mostre a lista na ordem numérica:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream().sorted().collect(Collectors.toList());

        System.out.println(numerosOrdenados);

        List<Integer> numerosOrdenadosDecrescente = numeros.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

        System.out.println(numerosOrdenadosDecrescente);

    }
}