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

public class DALArea {

    private static RandomAccessFile raf;
    private static final String path = "mapa_areas.dat";

    private static final String[] columnas = {"Codigo", "Nombre", "Cantidad de Empleados"};
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

            raf.writeInt(bytes.length); //why

            raf.write(bytes); // objeto

            MapaAreas.setArea(area);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void leerAreas() {
        try {
            // referenciando al archivo
            raf = new RandomAccessFile(path, "r");

            while (raf.getFilePointer() < raf.length()) {

                int size = raf.readInt();

                byte[] bytes = new byte[size]; // vacio [][][][][][]

                raf.read(bytes);

                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais);

                Area area = (Area) ois.readObject();
                ois.close();
                bais.close();
                
                MapaAreas.setArea(area);

            }
        } catch (Exception e) {
        }

    }

    public static DefaultTableModel getTablaNombreAsc() {
        return llenarTabla(MapaAreas.ordenarPorNombreAsc());
    }

    public static DefaultTableModel getTablaNombreDes() {
        return llenarTabla(MapaAreas.ordenarPorNombreDes());

    }

    private static DefaultTableModel llenarTabla(ArrayList<Area> lista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        for (Area area : lista) {
            fila[0] = area.getCodigo();
            fila[1] = area.getNombre();
            fila[2] = area.getEmpleadosAsignados();
            modelo.addRow(fila);
        }
        return modelo;
    }

}
