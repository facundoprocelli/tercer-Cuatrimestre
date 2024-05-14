package Modulo;

import java.util.Objects;

public class Persona {
    private  String DNI;
    private String nombre;

    public Persona(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj != null){
            if(obj instanceof Persona p){
                if(this.getDNI().equals(p.getDNI())){
                    rta = true;
                }
            }
        }

        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
