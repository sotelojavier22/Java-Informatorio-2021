package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        int num1, num2;
        System.out.println("Ingrese un número\n");
        num1 = scan.nextInt();
        System.out.println("Ingrese otro número\n");
        num2 = scan.nextInt();
        if (num1 < num2) {
            lista = fizzBuzzFunction(num1, num2);
            System.out.println(lista);
        } else {
            System.out.println("El primer número ingresado debe ser menor al segundo");
        }
        scan.close();
    }

    public static List<String> fizzBuzzFunction(int num1, int num2) {
        List<String> lista = new ArrayList<>();
        String num = "";
        while (num1 < num2) {
            if ((num1 % 2 == 0) && (num1 % 3 == 0)) {
                lista.add("FizzBuzz");
            } else if (num1 % 2 == 0) {
                lista.add("Fizz");
            } else if (num1 % 3 == 0) {
                lista.add("Buzz");
            } else {
                num = Integer.toString(num1);
                lista.add(num);
            }
            num1++;
        }
        return lista;
    }

}
