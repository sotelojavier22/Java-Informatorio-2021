package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        List<String> palabrasStream = palabras.stream()
                .filter(palabra -> Optional.ofNullable(palabra).isEmpty() == false)
                .filter(palabra -> palabra != "")
                .collect(Collectors.toList());
        System.out.println(palabrasStream);
    }

}
