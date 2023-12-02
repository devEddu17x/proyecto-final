package datos;

import entidades.Puesto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

public class MapaPuestos {
    private static TreeMap<String, Puesto> mapaPuestos = new  TreeMap<>();
    
    public static void setPuesto(Puesto puesto){
        mapaPuestos.put(puesto.getCodigo(), puesto);
    }
    
    public static Puesto getPuesto(String codigoPuesto){
        return mapaPuestos.get(codigoPuesto);
    }
    
    public static int getTamaño(){
        return mapaPuestos.size();
    }
    
    public static ArrayList<Puesto> ordenarPorNombreAsc(){
        Collection<Puesto> puestos = mapaPuestos.values();
        ArrayList<Puesto> listaEmpleados = new ArrayList<>(puestos);
        Collections.sort(listaEmpleados, (Puesto p1, Puesto p2) -> p1.getNombre().compareTo(p2.getNombre()));
        return listaEmpleados;
    }
    
    public static ArrayList<Puesto> ordenarPorNombreDes(){
        ArrayList<Puesto> listaPuestos = ordenarPorNombreAsc();
        Collections.reverse(listaPuestos);
        return listaPuestos;
    }
}