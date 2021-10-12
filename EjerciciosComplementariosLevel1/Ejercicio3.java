
package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número\n");
        int num = scan.nextInt();
        String lista;
        for (int i = 1; i <= num; i++) {
            lista = "";
            for (int j = 1; j <= i; j++) {
                lista += j;
            }
            System.out.println(lista);
        }
        scan.close();
    }
}