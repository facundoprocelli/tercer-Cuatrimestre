package Modulo;

import java.util.Objects;

public abstract class Empleado  {

    //Atributos
    private String DNI;
    private String nombre;
    private String apellido;
    private int antiguedad;
    private double sueldo;

    //Constructores
    public Empleado(String DNI, String nombre, String apellido, int antiguedad, double sueldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    public Empleado() {
        this.DNI = "No hay DNI";
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.antiguedad = -1;
        this.sueldo = 0;
    }

    // Getters y Setters

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Metodos

    public void agregar(Empleado empleado){

    }

    public abstract double obtenerSalario();

    //Sobreescrituras


    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", antiguedad=" + antiguedad +
                ", sueldo=" + sueldo +
                '}';
    }




}
