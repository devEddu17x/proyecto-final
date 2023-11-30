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

public class DALAsignacion {
    static RandomAccessFile raf;
    
    public static void agregarAsignacion(Asignacion asignacion){
        try {
            raf = new RandomAccessFile("asignaciones.dat", "rw");
            raf.seek(raf.length());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(asignacion);
            byte [] bytes = baos.toByteArray();
            oos.close();
            baos.close();
            raf.writeInt(bytes.length);
            raf.write(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void leerAsignaciones(){
        try {
            raf = new RandomAccessFile("asignaciones.dat", "r");
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
}
