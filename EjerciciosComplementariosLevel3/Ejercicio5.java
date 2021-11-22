package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Perez", "Milagros", LocalDate.parse("1995-12-27")),
                new Alumno("Garcia", "Jorge", LocalDate.parse("1990-10-12")),
                new Alumno("Guidici", "Ariel", LocalDate.parse("1982-02-08")),
                new Alumno("Basilio", "Claudio", LocalDate.parse("1979-12-03")),
                new Alumno("Castaño", "Rocio", LocalDate.parse("1979-09-11")),
                new Alumno("Margosa", "Fabiola", LocalDate.parse("1975-01-12")),
                new Alumno("Escobar", "Mariana", LocalDate.parse("1982-10-26")),
                new Alumno("Strusiat", "Carina", LocalDate.parse("1975-10-31")));
        Map<String, Integer> listaAlumnos = alumnos.stream()
                .collect(Collectors.toMap(alumno -> obtenerClave(alumno), alumno -> calcularEdad(alumno)));
        System.out.println(listaAlumnos);
    }

    public static String obtenerClave(Alumno alumno) {
        return alumno.getApellido().concat(" ").concat(alumno.getNombre());
    }

    public static Integer calcularEdad(Alumno alumno) {
        return Period.between(alumno.getFechaDeNacimiento(), LocalDate.now()).getYears();
    }
}