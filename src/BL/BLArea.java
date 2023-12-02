package BL;

import java.util.ArrayList;

import DAL.DALArea;
import datos.MapaAreas;
import entidades.Area;

public class BLArea {
  public static String agregarArea(String nombre) {
    String mensaje = "";
    Area area;

    if (nombre.trim().length() > 0) {
      area = new Area(nombre, 0, 0);
      DALArea.agregarArea(area);
      mensaje = "Area agregada correctamente";
    } else {
      mensaje = "No se pudo agregar el area";
    }

    return mensaje;
  }

  public static String agregarArea(String codigo, String nombre) {
    String mensaje = "";
    Area area;

    if (codigo != null && nombre.trim().length() > 0) {
      area = new Area(codigo, nombre, 0, 0);
      DALArea.agregarArea(area);
      mensaje = "Area agregada correctamente";
    } else {
      mensaje = "No se pudo agregar el area";
    }

    return mensaje;
  }

  public static Area getArea(String codigoArea) {
    Area area = null;

    if (codigoArea != null) {
      area = MapaAreas.getArea(codigoArea);
    }

    return area;
  }

  public static ArrayList<Area> getContenido() {
    return MapaAreas.getLista();
  }
}
