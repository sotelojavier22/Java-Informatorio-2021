package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<String>();
        List<String> cursoA = new ArrayList<String>();
        List<String> cursoB = new ArrayList<String>();
        List<String> cursoC = new ArrayList<String>();
        // cargo lista de alumnos
        cargarAlumnos(alumnos);
        cursoA = alumnos.subList(0, 3);
        cursoB = alumnos.subList(4, 7);
        cursoC = alumnos.subList(8, 11);
        System.out.println("Alumnos del curso A");
        imprimir(cursoA);
        System.out.println("Alumnos del curso B");
        imprimir(cursoB);
        System.out.println("Alumnos del curso C");
        imprimir(cursoC);
    }

    public static void cargarAlumnos(List<String> alumnos) {
        alumnos.add("Perez, Juan");
        alumnos.add("Perez, Milagros");
        alumnos.add("Sotelo, Javier");
        alumnos.add("Cimbaro, Adrian");
        alumnos.add("Cimbaro, Natalia");
        alumnos.add("Strusiat, Carina");
        alumnos.add("Basilio, Claudio");
        alumnos.add("Escobar, Mariana");
        alumnos.add("Castaño, Rocio");
        alumnos.add("Guidici, Ariel");
        alumnos.add("Akiyama, Jorge");
        alumnos.add("Huerga, Emanuel");
    }

    public static void imprimir(List<String> curso) {
        for (String alumno : curso) {
            System.out.println(alumno);
        }
    }
}
