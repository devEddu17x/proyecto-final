package entidades;
import complementos.Complementos;
public class Puesto {
    private String codigo;
    private String nombre;
    private final String codigoArea;
    private int maximoEmpleados;
    private int numeroEmpleados;
    
    // constructores

    public Puesto(String codigo, String nombre, String codigoArea, int maximoEmpleados, int numeroEmpleados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoArea = codigoArea;
        this.maximoEmpleados = maximoEmpleados;
        this.numeroEmpleados = numeroEmpleados;
    }
    
    // constructor sin codigo

    public Puesto(String nombre, String codigoArea, int maximoEmpleados, int numeroEmpleados) {
        this.nombre = nombre;
        this.codigoArea = codigoArea;
        this.maximoEmpleados = maximoEmpleados;
        this.numeroEmpleados = numeroEmpleados;
        this.codigo = Complementos.generarCodigo();
    }
    
    // setters 

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaximoEmpleados(int maximoEmpleados) {
        this.maximoEmpleados = maximoEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
    
    // getters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public int getMaximoEmpleados() {
        return maximoEmpleados;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
    
    @Override
    public String toString() {
        return "\nCódigo: " + getCodigo() + 
                "\nNombre: " + getNombre() +
                "\nCódigo de Área: " + getCodigoArea() +
                "\nMáximo de Empleados: " + getMaximoEmpleados() +
                "\nNúmero de Empleados: " + getNumeroEmpleados();
    }
}