import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número\n");
        int num1 = scan.nextInt();
        System.out.println("Ingrese otro número\n");
        int num2 = scan.nextInt();
        System.out.println(num1 + " elevado a " + num2 + " = " + potencia(num1, num2));
        scan.close();
    }

    public static int potencia(int num1, int num2) {
        int resul = 1;
        for (int i = 1; i <= num2; i++) {
            resul *= num1;
        }
        return resul;
    }
}
