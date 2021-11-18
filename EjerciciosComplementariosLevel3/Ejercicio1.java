package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Dada una lista que contiene valores de tipo String, se deberá filtrar todos los valores que NO sean null o 
vacío ("").
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        Stream<String> palabrasStream = palabras.stream()
                .filter(palabra -> Optional.ofNullable(palabra).isEmpty() == false);
        palabrasStream.forEach(p -> System.out.println(p));
        // System.out.println(palabrasStream);

    }

}
