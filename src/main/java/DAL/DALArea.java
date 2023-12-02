/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import datos.MapaAreas;
import entidades.Area;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduar
 */
public class DALArea {

    private static RandomAccessFile raf;
    private static final String path = "mapa_areas.dat";

    private static String[] columnas = {"Codigo", "Nombre", "Cantidad de Empleados"};
    private static Object[] fila = new Object[columnas.length];

    public static void agregarArea(Area area) {
        try {
            // archivo
            raf = new RandomAccessFile(path, "rw");
            raf.seek(raf.length());
            // generando flujos
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            //escribiendo en el flujo object
            oos.writeObject(area);
            byte[] bytes = baos.toByteArray();
            // cerrando flujos
            oos.close();
            baos.close();
            raf.writeInt(bytes.length);
            raf.write(bytes);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void leerAreas() {
        try {
            raf = new RandomAccessFile(path, "r");
            while (raf.getFilePointer() < raf.length()) {
                int size = raf.readInt();
                byte[] bytes = new byte[size];
                raf.read(bytes);

                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais);

                Area area = (Area) ois.readObject();

                MapaAreas.setArea(area);
                ois.close();
                bais.close();
            }
        } catch (Exception e) {
        }
        
        

    

    public static DefaultTableModel llenarTabla() {
        return null;
    }
}
