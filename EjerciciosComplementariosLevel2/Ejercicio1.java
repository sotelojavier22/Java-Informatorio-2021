package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<String>();

        ciudades.add("Villa Carlos Paz");
        ciudades.add("Posadas");
        ciudades.add("Resistencia");

        for (String ciudad : ciudades) {
            System.out.println("#" + (ciudades.indexOf(ciudad) + 1) + "-" + ciudad);
        }
    }
}
