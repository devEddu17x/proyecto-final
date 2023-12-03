package BL;

import java.time.LocalDate;
import java.util.ArrayList;

import DAL.DALAsignacion;
import datos.ListaAsignaciones;
import entidades.Area;
import entidades.Asignacion;
import entidades.Empleado;
import entidades.Factory;
import entidades.Puesto;

public class BLAsignacion {
  public static String agregarAsignacion(LocalDate fechaAsignacion, LocalDate inicioAsignacion, LocalDate finAsignacion,
      Empleado empleado, Area area, Puesto puesto) {
    String mensaje = "";
    Asignacion asignacion;

    if (fechaAsignacion != null && inicioAsignacion != null && finAsignacion != null && empleado != null && area != null
        && puesto != null) {
        asignacion = (Asignacion) Factory.crearAsignacion(fechaAsignacion, inicioAsignacion, finAsignacion, empleado, area, puesto);
      DALAsignacion.agregarAsignacion(asignacion);
      mensaje = "Asignacion agregada correctamente";
    } else {
      mensaje = "No se pudo agregar la asignacion";
    }

    return mensaje;
  }

  // sin fecha de fin de asignacion
  public static String agregarAsignacion(LocalDate fechaAsignacion, LocalDate inicioAsignacion, Empleado empleado,
      Area area, Puesto puesto) {
    String mensaje = "";
    Asignacion asignacion;

    if (fechaAsignacion != null && inicioAsignacion != null && empleado != null && area != null && puesto != null) {
        asignacion = (Asignacion) Factory.crearAsignacion(fechaAsignacion, inicioAsignacion, empleado, area, puesto);
      DALAsignacion.agregarAsignacion(asignacion);
      mensaje = "Asignacion agregada correctamente";
    } else {
      mensaje = "No se pudo agregar la asignacion";
    }

    return mensaje;
  }

  // sin fecha de inico ni fin
  public static String agregarAsignacion(LocalDate fechaAsignacion, Empleado empleado, Area area, Puesto puesto) {
    String mensaje = "";
    Asignacion asignacion;

    if (fechaAsignacion != null && empleado != null && area != null && puesto != null) {
        asignacion = (Asignacion) Factory.crearAsignacion(fechaAsignacion, empleado, area, puesto);
      DALAsignacion.agregarAsignacion(asignacion);
      mensaje = "Asignacion agregada correctamente";
    } else {
      mensaje = "No se pudo agregar la asignacion";
    }

    return mensaje;
  }

  public static Asignacion getAsignacion() {
    Asignacion asignacion = null;

    asignacion = ListaAsignaciones.getLista().get(ListaAsignaciones.getTamaño() - 1);

    return asignacion;
  }

  public static ArrayList<Asignacion> getContenido() {
    return ListaAsignaciones.getContenido();
  }
}
