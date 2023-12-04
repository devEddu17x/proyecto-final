package datos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

import entidades.Empleado;
import java.util.Comparator;

public class MapaEmpleados {

    private static TreeMap<String, Empleado> mapaEmpleados = new TreeMap<>();

    public static void setEmpleado(Empleado empleado) {
        mapaEmpleados.put(empleado.getCodigo(), empleado);
    }

    public static Empleado getEmpleado(String codigoEmpleado) {
        return mapaEmpleados.get(codigoEmpleado);
    }

    public static int getTamaño() {
        return mapaEmpleados.size();
    }

    public static void despedirEmpleado(String codigoEmpleado) {
        Empleado empleado = getEmpleado(codigoEmpleado);
        empleado.setActivo(false);
        ListaAsignaciones.buscarUltimaAsignacion(codigoEmpleado).setFinAsignacion(LocalDate.now());
    }

    public static ArrayList<Empleado> ordenarPorNombreAsc() {
        // un TreeMap siempre se mantiene ordenado por la clave no importa que pase
        Collection<Empleado> lista = mapaEmpleados.values();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>(lista);
//        Collections.sort(listaEmpleados, (Empleado e1, Empleado e2) -> e1.getNombre().compareTo(e2.getNombre()));
         listaEmpleados.sort(Comparator.comparing(Empleado::getNombre));

        return listaEmpleados;
    }

    public static ArrayList<Empleado> ordenarPorNombreDes() {
        ArrayList<Empleado> listaEmpleados = ordenarPorNombreAsc();
        Collections.reverse(listaEmpleados);
        return listaEmpleados;
    }

    public static ArrayList<Empleado> getLista() {
        Collection<Empleado> empleados = mapaEmpleados.values();
        return new ArrayList<>(empleados);
    }

}
