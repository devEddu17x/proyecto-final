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

public class DALPuesto {
    private static RandomAccessFile raf;
    private static final String path = "mapa_puestos.dat";
    
    public static void agregarArea(Puesto puesto){
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
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void leerAreas(){
        try {
            raf = new RandomAccessFile(path, "r");
            
            while(raf.getFilePointer() < raf.length()){
                
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
}
