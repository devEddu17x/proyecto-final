package complementos;

import java.util.UUID;

public class Complementos {

 public static String generarCodigo(){ // gg
        UUID codigoUID = UUID.randomUUID();
        String fragmento = Long.toHexString(codigoUID.getMostSignificantBits());
        return fragmento.substring(0, 8);
    }
    
}
