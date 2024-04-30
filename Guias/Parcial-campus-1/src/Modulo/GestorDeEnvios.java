package Modulo;
import  Modulo.EnvioTerrestre;
import  Modulo.EnvioAereo;
import  Modulo.EnvioDePaquetes;

import java.util.ArrayList;

public class GestorDeEnvios {

    private ArrayList<EnvioDePaquetes> envioDePaquetes;

    public GestorDeEnvios(){
        this.envioDePaquetes = new ArrayList<>();
    }


    public void agregar(EnvioDePaquetes envio){
        envioDePaquetes.add(envio);
    }

   public String mostrarTodosLosPaquetes(){
        String mensaje = "";
        for(EnvioDePaquetes e: envioDePaquetes){
            mensaje += e.toString() + "\n";

        }
        return mensaje;
   }

   public String enviarPaquete(int id){
        String mensaje = "Paquete no encontrado";
        for(EnvioDePaquetes e: envioDePaquetes){
            if(e.getIdentificador() == id){
                if(!e.isEnviado()){
                    e.setEnviado(true);
                    mensaje = "paquete Ya enviado";
                }
            }
        }
        return mensaje;
   }

   public int cantidadTotalDePaquetes(){
        return envioDePaquetes.size();
   }






}
