package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio02 {

    //Desafio 2 - Imprima a soma dos números pares em sequencia da lista
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 2);
        Integer somaNumerosPares =  numeros.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).sum();

        System.out.println(numeros);
        System.out.println(somaNumerosPares);
    }
}
