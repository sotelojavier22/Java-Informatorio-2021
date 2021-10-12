
package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número\n");
        int num1 = scan.nextInt();
        System.out.println("Ingrese otro número\n");
        int num2 = scan.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) + "\n");
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) + "\n");
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) + "\n");
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2) + "\n");
        scan.close();
    }

}
