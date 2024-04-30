package Modulo;

public class EAsalariado extends Empleado {

    //Atributos
    private int salarioFijo;

    //Constructores
    public EAsalariado(String DNI, String nombre, String apellido, int antiguedad, int salarioFijo) {
        super(DNI, nombre, apellido, antiguedad, 0);
        this.salarioFijo = salarioFijo;
    }

    // Getters y Setters


    public int getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(int salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    //Metodos
    public EAsalariado() {
    }



    @Override
    public double obtenerSalario() {
        double salario = getSalarioFijo();

        if(getAntiguedad() == 3){
            salario = agregarAntiguedad(5);
        } else if (getAntiguedad() >3 && getAntiguedad() < 8) {
            salario = agregarAntiguedad(10);
        } else if (getAntiguedad() > 7 && getAntiguedad() < 16) {
            salario = agregarAntiguedad(15);
        } else if (getAntiguedad() > 15) {
            salario = agregarAntiguedad(20);
        }

        return salario;
    }

    private int  agregarAntiguedad(int porcentaje){

        int monto = (porcentaje * getSalarioFijo()) / 100;
        monto += getSalarioFijo();

        return monto;
    }


    @Override
    public String toString() {
        return super.toString() + "EAsalariado{" +
                "salarioFijo=" + salarioFijo +
                '}' + "\n";
    }
}
