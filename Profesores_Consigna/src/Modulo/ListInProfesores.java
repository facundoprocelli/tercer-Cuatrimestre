package Modulo;
import Modulo.Profesor;
import Modulo.Persona;
import Modulo.ProfesorInterin;
import Modulo.ProfesorTitular;

import java.util.ArrayList;

public class ListInProfesores {


    //Este seria el atributo: Esto tiene un atributo que en lugar de ser de tipo INT
    // Es de tipo arraylist
    private  ArrayList<Profesor> profesores;


    // Tengo que crear el constructor porque porque tiene atributos
    //Como es un array, instancio como un array
    public ListInProfesores() {
        profesores = new ArrayList<Profesor>();
    }


    public void cargarProfesores(Profesor profesor){

        profesores.add(profesor);


    }


    public String getInfo(){
String dato = " ";
        for(Profesor e: profesores){
            dato += e.getInfo() + "\n";
        }

        return dato;
    }

    public int importeTotalNominaProfesorado(){
        int dato = 0;
        for(Profesor e: profesores){
            dato += e.calcularSueldo();
        }
        return dato;
    }





}
