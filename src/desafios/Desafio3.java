package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio3 {
    public static void main(String[] args) {
        //Desafio 3 - Verifique se todos os números da lista são positivos:
        //Desafio 3.1 - Verifique se todos os números da lista são positivos, se se tiver negativo o imprimir:
        //Desafio 3.2 - Imprimir os negativos em ordem

        List<Integer> numeros = Arrays.asList(1, 2, 3, -7, 5, 6, -8, 8, 9, 10, 5, 4, -3);

        Boolean todosPositivos = numeros.stream().allMatch(numero -> numero > 0);

        if (todosPositivos) {
            System.out.println("Todos os numeros são positivos");
        }else {
            System.out.println("Existem numeros negativo");

            List<Integer> numerosNegativos = numeros.stream().filter(n -> n < 0).sorted().collect(Collectors.toList());
            System.out.println("Tem os seguintes numero (s) " + numerosNegativos);
        }

    }

}
