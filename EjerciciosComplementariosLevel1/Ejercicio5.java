import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número\n");
        int num1 = scan.nextInt();
        System.out.println("Ingrese otro número\n");
        int num2 = scan.nextInt();
        System.out.println(num1 + " x " + num2 + " = " + multiplicacion(num1, num2));
        scan.close();
    }

    public static int multiplicacion(int num1, int num2) {
        int resul = 0;
        for (int i = 1; i <= num1; i++) {
            resul += num2;
        }
        return resul;
    }
}
