package EjerciciosComplementariosLevel3;

import java.util.List;

import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> listaNumeros = numeros.stream().distinct().map(num -> factorial(num))
                .collect(Collectors.toList());
        System.out.println(listaNumeros);
    }

    public static Integer factorial(Integer num) {
        if (num == 1) {
            return num;
        } else {
            return num * factorial(num - 1);
        }
    }
}