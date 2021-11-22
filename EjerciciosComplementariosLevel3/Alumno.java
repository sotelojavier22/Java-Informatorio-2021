package EjerciciosComplementariosLevel3;

import java.time.LocalDate;

public class Alumno {
    private String apellido;
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Alumno(String apellido, String nombre, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

}
