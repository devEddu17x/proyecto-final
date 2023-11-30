package entidades;
import complementos.Complementos;

public class Area {
    private final String codigo;
    private String nombre;
    private int empleadosAsignados;
    
    public Area(String codigo, String nombre, int empleadosAsignados, int numeroPuestos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empleadosAsignados = empleadosAsignados;
    }
    
    // constructor sin codigo
    public Area(String nombre, int empleadosAsignados, int numeroPuestos) {
        this.nombre = nombre;
        this.empleadosAsignados = empleadosAsignados;
        this.codigo = Complementos.generarCodigo();
    }
    
    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleadosAsignados(int empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }
    
    // getters
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEmpleadosAsignados() {
        return empleadosAsignados;
    }
}