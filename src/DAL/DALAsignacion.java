package DAL;
// import de clases propias

import datos.ListaAsignaciones;
import entidades.Asignacion;

// archivo
import java.io.RandomAccessFile;
// lectura y escritura de datos
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DALAsignacion {

    private static RandomAccessFile raf;
    private static final String path = "lista_asignaciones.dat";

    private static final String columnas[] = {"Fecha Asignacion", "Inicio Asignacion", "Fin Asignacion", "Cod. Empleado","Empleado", "Cod. Area", "Area", "Cod. Puesto", "Puesto"};
    private static Object[] fila = new Object[columnas.length];

    public static void agregarAsignacion(Asignacion asignacion) {
        try {
            
            
            raf = new RandomAccessFile(path, "rw");
            raf.seek(raf.length());
            
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            
            
            oos.writeObject(asignacion);
            
            
            byte[] bytes = baos.toByteArray();
            
            
            oos.close();
            baos.close();
            
            
            raf.writeInt(bytes.length);
            raf.write(bytes);
            
            ListaAsignaciones.agregarAsignacion(asignacion);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leerAsignaciones() {
        try {
            raf = new RandomAccessFile(path, "r");
            while (raf.getFilePointer() < raf.length()) {
                
                int size = raf.readInt();
                byte[] bytes = new byte[size];
                
                
                raf.read(bytes);
                
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais);
                
                
                Asignacion asignacion = (Asignacion) ois.readObject();
                ListaAsignaciones.agregarAsignacion(asignacion);
                
                ois.close();
                bais.close();
            }
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    public static DefaultTableModel getTablaFechaAsc() {
        ListaAsignaciones.ordenarPorFechaAsc();
        return llenarTabla();
    }

    public static DefaultTableModel getTablaFechaDes() {
        ListaAsignaciones.ordenarPorFechasDes();
        return llenarTabla();
    }

    public static DefaultTableModel getTablaFechaInicioAsc() {
        ListaAsignaciones.ordenarPorFechaInicioAsc();
        return llenarTabla();
    }

    public static DefaultTableModel getTablaFechaInicioDes() {
        ListaAsignaciones.ordenarPorFechasInicioDes();
        return llenarTabla();
    }

    private static ArrayList<Asignacion> getContenido() {
        return ListaAsignaciones.getLista();
    }

    private static DefaultTableModel llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        ArrayList<Asignacion> lista = getContenido();
        for (Asignacion asignacion : lista) {
            fila[0] = asignacion.getFechaAsignacion();

            if (asignacion.getInicioAsignacion() != null) {
                fila[1] = asignacion.getInicioAsignacion();
            } else {
                fila[1] = "Sin fecha";
            }

            if (asignacion.getFinAsignacion() != null) {
                fila[2] = asignacion.getFinAsignacion();
            } else {
                fila[2] = "Sin fecha";
            }

            fila[3] = asignacion.getEmpleado().getCodigo();
            fila[4] = asignacion.getEmpleado().getNombre();
            fila[5] = asignacion.getArea().getCodigo();
            fila[6] = asignacion.getArea().getNombre();
            fila[7] = asignacion.getPuesto().getCodigo();
            fila[8] = asignacion.getPuesto().getNombre();

            modelo.addRow(fila);
        }

        return modelo;
    }

}
