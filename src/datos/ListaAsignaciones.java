package datos;

import java.util.ArrayList;
import java.util.Collections;

import entidades.Asignacion;

public class ListaAsignaciones {

    private static ArrayList<Asignacion> listaAsignaciones = new ArrayList<>();

    public static ArrayList<Asignacion> getLista() {
        return listaAsignaciones;
    }

    // metodos de manipulacion de la lista
    public static void agregarAsignacion(Asignacion asignacion) {
        if (asignacion != null) {
            listaAsignaciones.add(asignacion);
        }
    }

    public static int getTamaño() {
        return listaAsignaciones.size();
    }

    public static boolean estaVacio() {
        return listaAsignaciones.isEmpty();
    }

    public static void ordenarPorFechaAsc() {
        Collections.sort(listaAsignaciones,
                (Asignacion a1, Asignacion a2) -> (a1.getFechaAsignacion().compareTo(a2.getFechaAsignacion())));
    }

    public static void ordenarPorFechasDes() {
        ordenarPorFechaAsc();
        Collections.reverse(listaAsignaciones);
    }

    public static void ordenarPorFechaInicioAsc() {
        Collections.sort(listaAsignaciones,
                (Asignacion a1, Asignacion a2) -> (a1.getInicioAsignacion().compareTo(a2.getInicioAsignacion())));
    }

    public static void ordenarPorFechasInicioDes() {
        ordenarPorFechaInicioAsc();
        Collections.reverse(listaAsignaciones);
    }

    public static Asignacion buscarUltimaAsignacion(String codigoEmpleado) {

        if (estaVacio()) {
            return null;
        } else {
            ArrayList<Asignacion> lista = new ArrayList<>();
            for (Asignacion asignacion : listaAsignaciones) {
                if (asignacion.getEmpleado().getCodigo().equals(codigoEmpleado)) {
                    return asignacion;
                }
            }
            return null;
        }
    }

    // metodos de busqueda
    public static ArrayList<Asignacion> buscarPorEmpleado(String codigoEmpleado) {

        if (estaVacio()) {
            return null;
        } else {
            ArrayList<Asignacion> lista = new ArrayList<>();
            for (Asignacion asignacion : listaAsignaciones) {
                if (asignacion.getEmpleado().getCodigo().equals(codigoEmpleado)) {
                    lista.add(asignacion);
                }
            }
            return lista;
        }
    }

    public static ArrayList<Asignacion> buscarPorPuesto(String codigoPuesto) {
        if (estaVacio()) {
            return null;
        } else {
            ArrayList<Asignacion> lista = new ArrayList<>();
            for (Asignacion asignacion : listaAsignaciones) {
                if (asignacion.getPuesto().getCodigo().equals(codigoPuesto)) {
                    lista.add(asignacion);
                }
            }
            return lista;
        }
    }

    public static ArrayList<Asignacion> buscarPorArea(String codigoArea) {
        if (estaVacio()) {
            return null;
        } else {
            ArrayList<Asignacion> lista = new ArrayList<>();
            for (Asignacion asignacion : listaAsignaciones) {
                if (asignacion.getArea().getCodigo().equals(codigoArea)) {
                    lista.add(asignacion);
                }
            }
            return lista;
        }
    }

    public static ArrayList<Asignacion> getContenido() {
        return listaAsignaciones;
    }

}
