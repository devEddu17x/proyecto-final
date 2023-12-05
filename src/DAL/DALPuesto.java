/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import datos.MapaPuestos;
import entidades.Puesto;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DALPuesto {

    private static RandomAccessFile raf;
    private static final String path = "mapa_puestos.dat";

    private static String[] columnas = {"Codigo", "Nombre", "Cod. Area", "Max. Empleados", "N° Empleados"};
    private static Object[] fila = new Object[columnas.length];

    public static void agregarPuesto(Puesto puesto) {
        try {
            // archivo
            raf = new RandomAccessFile(path, "rw");
            raf.seek(raf.length());
            // generando flujos
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            //escribiendo en el flujo object
            oos.writeObject(puesto);
            byte[] bytes = baos.toByteArray();
            // cerrando flujos
            oos.close();
            baos.close();
            raf.writeInt(bytes.length);
            raf.write(bytes);
            MapaPuestos.setPuesto(puesto);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void leerPuestos() {
        try {
            raf = new RandomAccessFile(path, "r");
            while (raf.getFilePointer() < raf.length()) {

                int size = raf.readInt();
                byte[] bytes = new byte[size];
                raf.read(bytes);

                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais);

                Puesto puesto = (Puesto) ois.readObject();

                MapaPuestos.setPuesto(puesto);
                ois.close();
                bais.close();
            }
        } catch (Exception e) {
        }
    }

    public static DefaultTableModel getTableNombreAsc() {
        return llenarTabla(MapaPuestos.ordenarPorNombreAsc());
    }

    public static DefaultTableModel getTableNombreDes() {
        return llenarTabla(MapaPuestos.ordenarPorNombreDes());
    }

    public static DefaultTableModel llenarTabla(ArrayList<Puesto> lista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        for (Puesto puesto : lista) {
            fila[0] = puesto.getCodigo();
            fila[1] = puesto.getNombre();
            fila[2] = puesto.getCodigoArea();
            fila[3] = puesto.getMaximoEmpleados();
            fila[4] = puesto.getNumeroEmpleados();
            modelo.addRow(fila);
        }

        return modelo;
    }

    public static void guardarCambios(ArrayList<Puesto> listaPuestos) {

        try {
            raf = new RandomAccessFile(path, "rw");
            raf.seek(0);
            
            
            for (Puesto puesto : listaPuestos) {

                // archivo
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                
                //escribiendo en el flujo object
                oos.writeObject(puesto);
                byte[] bytes = baos.toByteArray();
                // cerrando flujos
                oos.close();
                baos.close();
                
                raf.writeInt(bytes.length);
                raf.write(bytes);

                
                

            }
            
            raf.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
