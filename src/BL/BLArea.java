package BL;

import java.util.ArrayList;

import DAL.DALArea;
import datos.MapaAreas;
import entidades.Area;
import entidades.Factory;

public class BLArea {
  public static String agregarArea(String nombre) {
    
    String mensaje = "";
    Area area;

    if (nombre.trim().length() > 0) {
        area = (Area) Factory.crearArea(nombre, 0, 0);
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
        area = (Area) Factory.crearArea(codigo, 0, 0);
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
  
  public static Area getAreaNombre(String nombre){
      ArrayList<Area> lista = getContenido();
      for (Area area : lista) {
          if (area.getNombre().equals(nombre)){
              return area;
          }
      } return null;
  }
}
