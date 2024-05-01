package Modulo;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorDeZoo {

    //Atributos
    private ArrayList<Animal> animalArrayList;


    //Constructor

    public GestorDeZoo(){
        animalArrayList = new ArrayList<Animal>();
    }

    //Metodos

    public void agregar(Animal animal){
        animalArrayList.add(animal);
    }

    public int contar(){
        return  animalArrayList.size();
    }

    @Override
    public String toString() {
        return "GestorDeZoo{" +
                "animalArrayList=" + animalArrayList +
                '}';
    }

    public void eliminarXNombre(String nombre){

        Iterator<Animal> it = animalArrayList.iterator();


        while(it.hasNext()){
            Animal e = it.next();
            if(e.getNombre().equals(nombre)){
                it.remove();
            }

        }
    }

    public String buscarXEspecie(String especie){
        String mensaje = "";

        for(Animal e: animalArrayList){
            if(e.getEspecie().equals(especie)){
                mensaje += e.toString();
            }
        }
        return mensaje;
    }


}
