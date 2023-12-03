package entidades;

import java.time.LocalDate;

public class EmpleadoCargo extends Empleado {
    
    private String cargo;
    private int numeroEmpleados;

    public EmpleadoCargo(String cargo, int numeroEmpleados, String codigo, String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
        super(codigo, nombre, apellido, profesion, dni, inicioOrg);
        this.cargo = cargo;
        this.numeroEmpleados = numeroEmpleados;
    }

    public EmpleadoCargo(String cargo, int numeroEmpleados, String codigo, String nombre, String apellido, String profesion, int dni) {
        super(codigo, nombre, apellido, profesion, dni);
        this.cargo = cargo;
        this.numeroEmpleados = numeroEmpleados;
    }

    public EmpleadoCargo(String cargo, int numeroEmpleados, String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
        super(nombre, apellido, profesion, dni, inicioOrg);
        this.cargo = cargo;
        this.numeroEmpleados = numeroEmpleados;
    }

    public EmpleadoCargo(String cargo, int numeroEmpleados, String nombre, String apellido, String profesion, int dni) {
        super(nombre, apellido, profesion, dni);
        this.cargo = cargo;
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
    
}
