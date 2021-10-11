import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombreYApellido, direccion, ciudad, edad;
        System.out.println("Ingrese nombres y apellidos\n");
        nombreYApellido = scan.nextLine();
        System.out.println("Ingrese edad\n");
        edad = scan.nextLine();
        System.out.println("Ingrese dirección\n");
        direccion = scan.nextLine();
        System.out.println("Ingrese ciudad\n");
        ciudad = scan.nextLine();
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreYApellido);
        scan.close();
    }
}
