package EjerciciosComplementariosLevel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleado> listaEmpleados = new HashSet<>();
        cargarEmpleados(listaEmpleados);
        Map<Integer, Integer> sueldos = new HashMap<>();

        for (Empleado empleado : listaEmpleados) {
            sueldos.put(empleado.getDni(), empleado.getHorasTrabajadas() * empleado.getValorPorHora());
        }

        System.out.println(sueldos);
    }

    public static void cargarEmpleados(Set<Empleado> listaEmpleados) {

        Empleado empleado1 = new Empleado("Javier Sotelo", 28397734, 200, 500);
        listaEmpleados.add(empleado1);

        Empleado empleado2 = new Empleado("Jorge Akiyama", 32397734, 205, 398);
        listaEmpleados.add(empleado2);

        Empleado empleado3 = new Empleado("Milagros Perez", 34397734, 180, 395);
        listaEmpleados.add(empleado3);
    }
}
