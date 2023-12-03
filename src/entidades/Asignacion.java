package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Asignacion implements Serializable, EntidadEmpresa{

    private final LocalDate fechaAsignacion;
    private LocalDate inicioAsignacion;
    private LocalDate finAsignacion;
    private Empleado empleado;
    private Area area;
    private Puesto puesto;

    // constructor con todos los parametros
    public Asignacion(LocalDate fechaAsignacion, LocalDate inicioAsignacion, LocalDate finAsignacion, Empleado empleado, Area area, Puesto puesto) {
        /* Se conoce:
        Cuando llego a la org
        Cuando empieza a trabajar
        Cuando sale de trabajar */
        this.fechaAsignacion = fechaAsignacion;
        this.inicioAsignacion = inicioAsignacion;
        this.finAsignacion = finAsignacion;
        this.empleado = empleado;
        this.area = area;
        this.puesto = puesto;
    }

    // contructor sin fecha de fin de asignacion
    public Asignacion(LocalDate fechaAsignacion, LocalDate inicioAsignacion, Empleado empleado, Area area, Puesto puesto) {
        // Se usa cuando el empleado se mantendra activo indefinidamente
        this.fechaAsignacion = fechaAsignacion;
        this.inicioAsignacion = inicioAsignacion;
        this.empleado = empleado;
        this.area = area;
        this.puesto = puesto;
    }

    // constructor sin fecha de inico ni fin
    public Asignacion(LocalDate fechaAsignacion, Empleado empleado, Area area, Puesto puesto) {
        // Se usa cuando se da una asignacion sin fecha de inicio o fin
        this.fechaAsignacion = fechaAsignacion;
        this.empleado = empleado;
        this.area = area;
        this.puesto = puesto;
    }

    // setters
    public boolean setInicioAsignacion(LocalDate inicioAsignacion) {
        // validar que la fecha de inicio no este antes que la fecha de asignacion
        if (!inicioAsignacion.isBefore(fechaAsignacion)) {
            this.inicioAsignacion = inicioAsignacion;
            return true;
        }
        return false;
    }

    public boolean setFinAsignacion(LocalDate finAsignacion) {
        // validar que el periodo sea al menos de un mes
        Period periodo = inicioAsignacion.until(finAsignacion);
        
        if (periodo.toTotalMonths() >= 1) {
            this.finAsignacion = finAsignacion;
            return true;
        } return false;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    // getters
    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public LocalDate getInicioAsignacion() {
        return inicioAsignacion;
    }

    public LocalDate getFinAsignacion() {
        return finAsignacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Area getArea() {
        return area;
    }

    public Puesto getPuesto() {
        return puesto;
    }

}
