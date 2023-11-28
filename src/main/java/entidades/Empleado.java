package entidades;

import java.time.LocalDate;
import complementos.Complementos;
public class Empleado {
    
    private String codigo;
    private String nombre;
    private String apellido;
    private String profesion;
    private int dni;
    private LocalDate inicioOrg;
    private boolean activo;

    // todos los parametros
    public Empleado(String codigo, String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.dni = dni;
        this.inicioOrg = inicioOrg;
    }
    
    // sin fecha
    public Empleado(String codigo, String nombre, String apellido, String profesion, int dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.dni = dni;
        this.inicioOrg = LocalDate.now();
    }
    
    // los mismmos constructores pero sin codigo
    
    // con fecha
    public Empleado(String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
        this.codigo = Complementos.generarCodigo();
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.dni = dni;
        this.inicioOrg = inicioOrg;
    }
    
    // sin fecha
    public Empleado(String nombre, String apellido, String profesion, int dni) {
        this.codigo = Complementos.generarCodigo();
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.dni = dni;
        this.inicioOrg = LocalDate.now();
    }
    
    
    // setters 

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setInicioOrg(LocalDate inicioOrg) {
        this.inicioOrg = inicioOrg;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    
    // getters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getDni() {
        return dni;
    }

    public LocalDate getInicioOrg() {
        return inicioOrg;
    }
    
    public boolean getActivo(){
        return activo;
    }
    
    @Override
    public String toString() {
        return "\nCódigo: " + getCodigo() +
                "\nDNI: " + getDni() +
                "\nNombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nProfesión: " + getProfesion() +
                "\nInicio en la Organización: " + getInicioOrg();
    }
}
