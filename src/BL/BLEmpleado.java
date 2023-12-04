package BL;

import java.time.LocalDate;
import java.util.ArrayList;

import DAL.DALEmpleado;
import datos.MapaEmpleados;
import entidades.Empleado;
import entidades.EmpleadoCargo;
import entidades.Factory;

public class BLEmpleado {
  public static String agregarEmpleado(String codigo, String nombre, String apellido, String profesion, int dni,
      LocalDate inicioOrg) {
    String mensaje = "";
    Empleado empleado;

    if (codigo != null && nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0
        && dni > 0 && inicioOrg != null) {
      empleado = (Empleado) Factory.crearEmpleado(codigo, nombre.trim(), apellido.trim(), profesion.trim(), dni, inicioOrg);
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
      empleado = (Empleado) Factory.crearEmpleado(codigo, nombre.trim(), apellido.trim(), profesion.trim(), dni);

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
      empleado = (Empleado) Factory.crearEmpleado(nombre.trim(), apellido.trim(), profesion.trim(), dni, inicioOrg);
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
      empleado = (Empleado) Factory.crearEmpleado(nombre.trim(), apellido.trim(), profesion.trim(), dni);
      DALEmpleado.agregarEmpleado(empleado);
      mensaje = "Empleado agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el empleado";
    }

    return mensaje;
  }

  public static String agregarEmpleadoCargo(String cargo, int numeroEmpleados, String codigo, String nombre,
      String apellido, String profesion, int dni,
      LocalDate inicioOrg) {
    String mensaje = "";
    EmpleadoCargo empleado;

    if (codigo != null && nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0
        && dni > 0 && inicioOrg != null) {
      empleado = (EmpleadoCargo) Factory.crearEmpleadoCargo(cargo.trim(), numeroEmpleados, codigo, nombre.trim(), apellido.trim(), profesion,
          dni, inicioOrg);
      DALEmpleado.agregarEmpleado(empleado);
      mensaje = "Empleado agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el empleado";
    }

    return mensaje;
  }

  // sin fecha
  public static String agregarEmpleadoCargo(String cargo, int numeroEmpleados, String codigo, String nombre,
      String apellido, String profesion, int dni) {
    String mensaje = "";
    EmpleadoCargo empleado;

    if (codigo != null && nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0
        && dni > 0) {
      empleado = (EmpleadoCargo) Factory.crearEmpleadoCargo(cargo.trim(), numeroEmpleados, codigo, nombre.trim(), apellido.trim(), profesion.trim(),
          dni);

      DALEmpleado.agregarEmpleado(empleado);
      mensaje = "Empleado agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el empleado";
    }

    return mensaje;
  }

  // los mismmos constructores pero sin codigo
  // con fecha
  public static String agregarEmpleadoCargo(String cargo, int numeroEmpleados, String nombre, String apellido,
      String profesion, int dni, LocalDate inicioOrg) {
    String mensaje = "";
    EmpleadoCargo empleado;

    if (nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0 && dni > 0
        && inicioOrg != null) {
      empleado = (EmpleadoCargo) Factory.crearEmpleadoCargo(cargo.trim(), numeroEmpleados, nombre.trim(), apellido.trim(), profesion.trim(), dni,
          inicioOrg);
      DALEmpleado.agregarEmpleado(empleado);
      mensaje = "Empleado agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el empleado";
    }

    return mensaje;
  }

  // sin fecha
  public static String agregarEmpleadoCargo(String cargo, int numeroEmpleados, String nombre, String apellido,
      String profesion, int dni) {
    String mensaje = "";
    EmpleadoCargo empleado;

    if (nombre.trim().length() > 0 && apellido.trim().length() > 0 && profesion.trim().length() > 0 && dni > 0) {
      empleado = (EmpleadoCargo) Factory.crearEmpleadoCargo(cargo.trim(), numeroEmpleados, nombre.trim(), apellido.trim(), profesion.trim(), dni);
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

  public static void listarEmpleados() {
    System.out.println("Lista de empleados");
    System.out.println("------------------");
    ArrayList<Empleado> lista = MapaEmpleados.getLista();
    for (Empleado empleado : lista) {
      System.out.println(empleado);
    }
  }
}
