package Modulo;

import java.util.ArrayList;

public class Gestora {

    private ArrayList<Empleado> empleados;

    public Gestora(){
        empleados = new ArrayList<>();
    }


public void agregar(Empleado empleado){
        empleados.add(empleado);
}

public  void actualizarSueldos(){

    for(Empleado empleado: empleados){
        if(empleado instanceof EAsalariado trabajador){
            trabajador.setSueldo(empleado.obtenerSalario());
        }
        else if(empleado instanceof EComision trabajador){
            trabajador.setSueldo(empleado.obtenerSalario());

        }
    }
}


    public double sueldoMayor(){
        double mayor = empleados.get(0).obtenerSalario() ;

        for(Empleado e: empleados){
            if(mayor < e.getSueldo()){
                mayor = e.getSueldo();
            }
        }

return mayor;
    }
    @Override
    public String toString() {
        return "Gestora{" +
                "empleados=" + empleados +
                '}';
    }
}
