/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import datos.MapaEmpleados;
import entidades.Empleado;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

/**
 *
 * @author eduar
 */
public class DALEmpleado {
    private static RandomAccessFile raf;
    private static final String path = "mapa_empleado.dat";
    
    public static void agregarEmpleado(Empleado empleado){
        
        try {
            raf = new RandomAccessFile(path, "rw");
            raf.seek(raf.length());
            
            // generacion de flujos 
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            
            // escribir la persona en el fujo object
            oos.writeObject(empleado);
            
            byte[] bytes = baos.toByteArray();
            oos.close();
            baos.close();
            
            raf.writeInt(bytes.length);
            raf.write(bytes);
            
        } catch (Exception e) {
        }
    }
    
    public static void leerEmpleados(){
        try {
            raf = new RandomAccessFile(path, "rw");
            while (raf.getFilePointer() < raf.length()){
                int size = raf.readInt();
                byte [] bytes = new byte [size];
                
                raf.read(bytes);
                
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais);
                
                Empleado empleado = (Empleado) ois.readObject();
                MapaEmpleados.setEmpleado(empleado);
                
                ois.close();
                bais.close();
            }
        } catch (Exception e) {
        }
    }
    
}
