package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio08 {
    public static void main(String[] args) {
        //Desafio 8 - Somar os dígitos de todos os números da list
        //Desafio 8.1 - Somar todos os números da list


        List<Integer> numeros = Arrays.asList(1, 2, 3, -7, 5, 6, -8, 8, 9, 10, 5, -3);
        Integer somaDosDigitos = numeros.stream().flatMapToInt
                (n -> String.valueOf(Math.abs(n)).chars())
                .map(Character::getNumericValue).sum();

        System.out.println(somaDosDigitos);
        Integer somaDosNumeros = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println(somaDosNumeros);

    }
}
