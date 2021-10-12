package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minúsculas\n");
        String palabra = scan.nextLine();
        System.out.println(mayusculas(palabra));
        scan.close();
    }

    public static String mayusculas(String palabra) {
        String resul = "";
        char letra;
        for (int i = 0; i < palabra.length(); i++) {
            letra = (char) (palabra.charAt(i) - 32);
            resul += letra;
        }
        return resul;
    }
}
