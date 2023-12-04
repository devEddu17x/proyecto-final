/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

import entidades.Area;
import java.util.Map;

public class MapaAreas {
    private static TreeMap<String, Area> mapaArea = new TreeMap<>();

    public static void setArea(Area area) {
        mapaArea.put(area.getCodigo(), area);
    }

    public static Area getArea(String codigoArea) {
        return mapaArea.get(codigoArea);
    }

    public static int getTamaño() {
        return mapaArea.size();
    }

    public static ArrayList<Area> ordenarPorNombreAsc() {
        ArrayList<Area> listaAreas = getLista();
        Collections.sort(listaAreas, (Area a1, Area a2) -> a1.getNombre().compareTo(a2.getNombre()));
        return listaAreas;
    }

    public static ArrayList<Area> ordenarPorNombreDes() {
        ArrayList<Area> listaAreas = ordenarPorNombreAsc();
        Collections.reverse(listaAreas);
        return listaAreas;
    }

    public static ArrayList<Area> getLista() {
        Collection<Area> areas = mapaArea.values();
        return new ArrayList<>(areas);
    }
    
    public static String getCodigoArea(String nombre){
        for (Map.Entry<String, Area> entry : mapaArea.entrySet()) {
            if(entry.getValue().getNombre().equals(nombre))
            return entry.getValue().getCodigo();
        }
        return null;
    }
}
