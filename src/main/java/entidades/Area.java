package entidades;
import complementos.Complementos;

public class Area {
    private String codigo;
    private String nombre;
    private int empleadosAsignados;
    private int numeroPuestos;

    public Area(String codigo, String nombre, int empleadosAsignados, int numeroPuestos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empleadosAsignados = empleadosAsignados;
        this.numeroPuestos = numeroPuestos;
    }
    
    // constructor sin codigo
    public Area(String nombre, int empleadosAsignados, int numeroPuestos) {
        this.nombre = nombre;
        this.empleadosAsignados = empleadosAsignados;
        this.numeroPuestos = numeroPuestos;
        this.codigo = Complementos.generarCodigo();
    }
    
    // setters
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleadosAsignados(int empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }

    public void setNumeroPuestos(int numeroPuestos) {
        this.numeroPuestos = numeroPuestos;
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

    public int getNumeroPuestos() {
        return numeroPuestos;
    }
    
    

    
    
    
    
    
}
