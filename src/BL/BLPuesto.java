package BL;

import java.util.ArrayList;

import DAL.DALPuesto;
import datos.MapaPuestos;
import entidades.Factory;
import entidades.Puesto;

public class BLPuesto {
  public static String agregarPuesto(String codigo, String nombre, String codigoArea, int maximoEmpleados,
      int numeroEmpleados) {
    String mensaje = "";
    Puesto puesto;

    if (codigo != null && nombre.trim().length() > 0 && codigoArea.trim().length() > 0 && maximoEmpleados > 0
        && numeroEmpleados > -1) {
        puesto = (Puesto) Factory.crearPuesto(codigo, nombre, codigoArea, maximoEmpleados, numeroEmpleados);
      DALPuesto.agregarPuesto(puesto);
      mensaje = "Puesto agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el puesto";
    }

    return mensaje;
  }

  // constructor sin codigo
  public static String agregarPuesto(String nombre, String codigoArea, int maximoEmpleados, int numeroEmpleados) {
    String mensaje = "";
    Puesto puesto;

    if (nombre.trim().length() > 0 && codigoArea.trim().length() > 0 && maximoEmpleados > 0 && numeroEmpleados > -1) {
        puesto = (Puesto) Factory.crearPuesto(nombre, codigoArea, maximoEmpleados, numeroEmpleados);
      DALPuesto.agregarPuesto(puesto);
      mensaje = "Puesto agregado correctamente";
    } else {
      mensaje = "No se pudo agregar el puesto";
    }

    return mensaje;
  }

  public static Puesto getPuesto(String codigoPuesto) {
    Puesto puesto = null;

    if (codigoPuesto != null) {
      puesto = MapaPuestos.getPuesto(codigoPuesto);
    }

    return puesto;
  }

  public static ArrayList<Puesto> getContenido() {
    return MapaPuestos.getLista();
  }
  
  public static Puesto getPuestoNombre(String nombre){
      ArrayList<Puesto> lista = getContenido();
      for (Puesto puesto : lista) {
          if (puesto.getNombre().equals(nombre)){
              return puesto;
          }
      } return null;
  }
}
