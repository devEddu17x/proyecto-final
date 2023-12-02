package BL;

import java.time.LocalDate;
import java.util.ArrayList;

import DAL.DALEmpleado;
import datos.MapaEmpleados;
import entidades.Empleado;

public class BLEmpleado {
  public static String agregarEmpleado(String codigo, String nombre, String apellido, String profesion, int dni,
      LocalDate inicioOrg) {
    String mensaje = "";
    Empleado empleado;

    if (codigo != null && nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0
        && dni > 0 && inicioOrg != null) {
      empleado = new Empleado(codigo, nombre, apellido, profesion, dni, inicioOrg);
      DALEmpleado.agregarEmpleado(empleado);
      mensaje = "Empleado agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el empleado";
    }

    return mensaje;
  }

  // sin fecha
  public static String agregarEmpleado(String codigo, String nombre, String apellido, String profesion, int dni) {
    String mensaje = "";
    Empleado empleado;

    if (codigo != null && nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0
        && dni > 0) {
      empleado = new Empleado(codigo, nombre, apellido, profesion, dni);
      DALEmpleado.agregarEmpleado(empleado);
      mensaje = "Empleado agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el empleado";
    }

    return mensaje;
  }

  // los mismmos constructores pero sin codigo
  // con fecha
  public static String agregarEmpleado(String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
    String mensaje = "";
    Empleado empleado;

    if (nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0 && dni > 0
        && inicioOrg != null) {
      empleado = new Empleado(nombre, apellido, profesion, dni, inicioOrg);
      DALEmpleado.agregarEmpleado(empleado);
      mensaje = "Empleado agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el empleado";
    }

    return mensaje;
  }

  // sin fecha
  public static String agregarEmpleado(String nombre, String apellido, String profesion, int dni) {
    String mensaje = "";
    Empleado empleado;

    if (nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0 && dni > 0) {
      empleado = new Empleado(nombre, apellido, profesion, dni);
      DALEmpleado.agregarEmpleado(empleado);
      mensaje = "Empleado agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el empleado";
    }

    return mensaje;
  }

  public static Empleado getEmpleado(String codigoEmpleado) {
    Empleado empleado = null;

    if (codigoEmpleado != null) {
      empleado = MapaEmpleados.getEmpleado(codigoEmpleado);
    }

    return empleado;
  }

  public static ArrayList<Empleado> getLista() {
    return MapaEmpleados.getLista();
  }
}
