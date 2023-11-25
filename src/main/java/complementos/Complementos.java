package complementos;

import java.util.UUID;

public class Complementos {

 public static String generarCodigo(){
        UUID codigoUID = UUID.randomUUID();
        String fragmento = String.valueOf(codigoUID);
        return fragmento.substring(0, 8);
    }
    
}
