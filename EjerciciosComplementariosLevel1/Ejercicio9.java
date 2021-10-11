import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase\n");
        String frase = scan.nextLine();
        System.out.println("Ingrese la letra que desea contar");
        char l = (char) scan.nextLine().charAt(0);
        System.out
                .println("La cantidad de veces que aparece la letra " + l + " en la frase es " + cuentaLetra(frase, l));
        scan.close();
    }

    public static int cuentaLetra(String frase, char l) {
        int cant = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (l == frase.charAt(i)) {
                cant += 1;
            }
        }
        return cant;
    }
}