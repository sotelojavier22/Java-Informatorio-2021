package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese usuario\n");
        String usuario = scan.next();
        System.out.println("HOLA " + usuario);
        scan.close();
    }
}