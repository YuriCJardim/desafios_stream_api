package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio05 {
    public static void main(String[] args) {


        //Calcule a média dos números maiores que 5:

        List<Integer> numeros = Arrays.asList(1, 2, 3, -7, 5, 6, -8, 8, 9, 10, 5, 4, -3);

        // Filtrar os números maiores que 5 e calcular a média desses números
          Double media = numeros.stream().filter(n -> n > 5).mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println(media);

    }

}
