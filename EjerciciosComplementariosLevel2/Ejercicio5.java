package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();
        cargarListas(horasTrabajadas, valorPorHora);
        procesarListas(horasTrabajadas, valorPorHora, totales);

        System.out.println(totales);
        System.out.println(calcularTotalACobrar(totales));
    }

    public static void cargarListas(List<Integer> horasTrabajadas, List<Integer> valorPorHora) {

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

    }

    public static void procesarListas(List<Integer> horasTrabajadas, List<Integer> valorPorHora,
            List<Integer> totales) {
        int i = 0;
        Integer total;
        while (i < horasTrabajadas.size()) {
            total = horasTrabajadas.get(i) * valorPorHora.get(i);
            totales.add(total);
            i++;
        }
    }

    public static Integer calcularTotalACobrar(List<Integer> totales) {
        Integer salarioTotal = 0;
        for (Integer total : totales) {
            salarioTotal += total;
        }
        return salarioTotal;
    }
}
