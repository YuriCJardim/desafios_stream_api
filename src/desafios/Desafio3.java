package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        //Desafio 3 - Verifique se todos os números da lista são positivos:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, -3);

        Boolean todosPositivos = numeros.stream().allMatch(numero -> numero > 0);

        if (todosPositivos) {
            System.out.println("Todos os numeros são positivos");
        }else {
            System.out.println("Pelo menos um elemento é negativo");
        }

    }

}
