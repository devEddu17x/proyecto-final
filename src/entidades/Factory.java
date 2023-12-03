package entidades;

import java.time.LocalDate;

public class Factory {
    
    public static EntidadEmpresa crearArea(String codigo, String nombre, int empleadosAsignados) {
        return new Area(codigo, nombre, empleadosAsignados);
    }

    public static EntidadEmpresa crearArea(String nombre, int empleadosAsignados, int numeroPuestos) {
        return new Area(nombre, empleadosAsignados);
    }
    
    public static EntidadEmpresa crearAsignacion(LocalDate fechaAsignacion, LocalDate inicioAsignacion, LocalDate finAsignacion, Empleado empleado, Area area, Puesto puesto) {
        return new Asignacion(fechaAsignacion, inicioAsignacion, finAsignacion, empleado, area, puesto);
    }
    
    public static EntidadEmpresa crearAsignacion(LocalDate fechaAsignacion, LocalDate inicioAsignacion, Empleado empleado, Area area, Puesto puesto) {
        return new Asignacion(fechaAsignacion, inicioAsignacion, empleado, area, puesto);
    }
    
    public static EntidadEmpresa crearAsignacion(LocalDate fechaAsignacion, Empleado empleado, Area area, Puesto puesto) {
        return new Asignacion(fechaAsignacion, empleado, area, puesto);
    }
    
    public static EntidadEmpresa crearEmpleado(String codigo, String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
        return new Empleado(codigo, nombre, apellido, profesion, dni, inicioOrg);
    }
    
    public static EntidadEmpresa crearEmpleado(String codigo, String nombre, String apellido, String profesion, int dni) {
        return new Empleado(codigo, nombre, apellido, profesion, dni);
    }
    
    public static EntidadEmpresa crearEmpleado(String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
        return new Empleado(nombre, apellido, profesion, dni, inicioOrg);
    }
    
    public static EntidadEmpresa crearEmpleado(String nombre, String apellido, String profesion, int dni) {
        return new Empleado(nombre, apellido, profesion, dni);
    }
    
    public static EntidadEmpresa crearEmpleadoCargo(String cargo, int numeroEmpleados, String codigo, String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
        return new EmpleadoCargo(cargo, numeroEmpleados, codigo, nombre, apellido, profesion, dni, inicioOrg);
    }
    
    public static EntidadEmpresa crearEmpleadoCargo(String cargo, int numeroEmpleados, String codigo, String nombre, String apellido, String profesion, int dni) {
        return new EmpleadoCargo(cargo, numeroEmpleados, codigo, nombre, apellido, profesion, dni);
    }
    
    public static EntidadEmpresa crearEmpleadoCargo(String cargo, int numeroEmpleados, String nombre, String apellido, String profesion, int dni, LocalDate inicioOrg) {
        return new EmpleadoCargo(cargo, numeroEmpleados, nombre, apellido, profesion, dni, inicioOrg);
    }
    
    public static EntidadEmpresa crearEmpleadoCargo(String cargo, int numeroEmpleados, String nombre, String apellido, String profesion, int dni) {
        return new EmpleadoCargo(cargo, numeroEmpleados, nombre, apellido, profesion, dni);
    }
    
    public static EntidadEmpresa crearPuesto(String codigo, String nombre, String codigoArea, int maximoEmpleados, int numeroEmpleados) {
        return new Puesto(codigo, nombre, codigoArea, maximoEmpleados, numeroEmpleados);
    }
    
    public static EntidadEmpresa crearPuesto(String nombre, String codigoArea, int maximoEmpleados, int numeroEmpleados) {
        return new Puesto(nombre, codigoArea, maximoEmpleados, numeroEmpleados);
    }
}
