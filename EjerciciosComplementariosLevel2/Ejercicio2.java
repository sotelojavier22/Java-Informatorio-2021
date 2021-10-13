package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        // cargo lista
        cargaLista(lista);
        // imprimo lista
        System.out.println("Lista original\n");
        System.out.println("Cantidad de elementos " + lista.size());
        imprimirLista(lista);
        // agrego un elemento al principio y al final de la lista
        lista.add(0, 23);
        lista.add(6, 32);
        // imprimo lista
        System.out.println("Lista modificada");
        System.out.println("Cantidad de elementos " + lista.size());
        imprimirLista(lista);
    }

    public static void cargaLista(List<Integer> lista) {
        lista.add(11);
        lista.add(80);
        lista.add(19);
        lista.add(22);
        lista.add(40);
    }

    public static void imprimirLista(List<Integer> lista) {
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }
    }
}
