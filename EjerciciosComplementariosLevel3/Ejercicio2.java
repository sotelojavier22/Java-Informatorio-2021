package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> listanumeros = numeros.stream().map(num -> potencia(num, 2)).collect(Collectors.toList());
        System.out.println(listanumeros);
    }

    public static int potencia(int num1, int num2) {
        int resul = 1;
        for (int i = 1; i <= num2; i++) {
            resul *= num1;
        }
        return resul;
    }

}
