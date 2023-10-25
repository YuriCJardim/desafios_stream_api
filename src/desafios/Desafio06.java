package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio06 {
    public static void main(String[] args) {
        //Desafio 6 - Verificar se a lista contém algum número maior que 10:
        List<Integer> numeros = Arrays.asList(1, 2, 3, -7, 5, 6, -8, 8, 9, 10, 5,  -3);
        List<Integer> numerosMaiorQueDez = numeros.stream().filter(n -> n > 10).collect(Collectors.toList());
        if(numerosMaiorQueDez.isEmpty()){
            System.out.println("Não tem números maior que dez na lista");
        }else
        System.out.println(numerosMaiorQueDez);
    }
}
