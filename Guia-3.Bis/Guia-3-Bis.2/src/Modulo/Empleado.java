package Modulo;

public class Empleado {

    //Atributos
    private int dni;
    private  String nombre;
    private String apellido;
    private double salario;

    //Constructor

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    //Getters y setters

    private void setSalario(double salario) {
        this.salario = salario;
    }

    private double getSalario(){
        return salario;
    }


    // Metodos

    public float calcularSalarioAnual(){
        return (float)this.salario * 12;
    }

    public void aumentarSalarioXPorcentaje(float porcentaje){
        this.salario += ((porcentaje * this.salario) / 100);
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
