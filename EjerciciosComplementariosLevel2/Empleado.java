package EjerciciosComplementariosLevel2;

public class Empleado {
    private String nombreYApellido;
    private Integer dni;
    private Integer horasTrabajadas;
    private Integer valorPorHora;

    public Empleado(String nombreYApellido, Integer dni, Integer horasTrabajadas, Integer valorPorHora) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public Integer getValorPorHora() {
        return valorPorHora;
    }

}
