package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> mazo = new ArrayList<String>();
        // cargo baraja
        cargarMazo(mazo);
        System.out.println("Mazo ordenado");
        imprimirMazo(mazo);
        System.out.println("Mazo ordenado en orden inverso");
        Collections.sort(mazo, Collections.reverseOrder());
        imprimirMazo(mazo);
        System.out.println("Mazo mezclado");
        Collections.shuffle(mazo);
        imprimirMazo(mazo);
    }

    public static void cargarMazo(List<String> mazo) {
        mazo.add("1 oro");
        mazo.add("2 oro");
        mazo.add("3 oro");
        mazo.add("4 oro");
        mazo.add("5 oro");
        mazo.add("6 oro");
        mazo.add("7 oro");

        mazo.add("1 espada");
        mazo.add("2 espada");
        mazo.add("3 espada");
        mazo.add("4 espada");
        mazo.add("5 espada");
        mazo.add("6 espada");
        mazo.add("7 espada");

        mazo.add("1 basto");
        mazo.add("2 basto");
        mazo.add("3 basto");
        mazo.add("4 basto");
        mazo.add("5 basto");
        mazo.add("6 basto");
        mazo.add("7 basto");

        mazo.add("1 copa");
        mazo.add("2 copa");
        mazo.add("3 copa");
        mazo.add("4 copa");
        mazo.add("5 copa");
        mazo.add("6 copa");
        mazo.add("7 copa");
    }

    public static void imprimirMazo(List<String> mazo) {
        for (String carta : mazo) {
            System.out.println(carta);
        }
    }
}
