import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número\n");
        Integer num = scan.nextInt();
        System.out.println("El factorial de " + num + " es " + factorial(num));
        scan.close();
    }

    public static Integer factorial(Integer num) {
        if (num == 1) {
            return num;
        } else {
            return num * factorial(num - 1);
        }
    }
}
