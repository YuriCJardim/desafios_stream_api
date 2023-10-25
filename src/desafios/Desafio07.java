package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio07 {
    public static void main(String[] args) {
        //Desafio 7 - Encontrar o segundo número maior da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, -7, 5, 6, -8, 8, 9, 10, 5, -3);

        Integer segundMaior = numeros.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().orElse(null);

        if (segundMaior != null) {
            System.out.println("O Segundo número maior é " + segundMaior);
        } else {
            System.out.println("Não foi possível encontrar o segundo número maior na lista.");
        }
    }
}
