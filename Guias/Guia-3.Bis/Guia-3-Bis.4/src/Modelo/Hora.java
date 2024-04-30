package Modelo;

public class Hora {

    //Atributos
    private  int hora;
    private int minuto;
    private  int segundo;

    // Constructor

    public Hora (){

    }
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //Metodos

    public Hora ingresarHora(String hora_p){

        boolean flag = true;
        String[] partes = hora_p.split(":");
            int hora = Integer.parseInt(partes[0]);
            int minuto = Integer.parseInt(partes[1]);
            int segund= Integer.parseInt(partes[2]);

        if(hora <= 23 &&  hora >= 0 ){
            if ((minuto <= 59 && minuto >= 0)) {
                if ((segund <= 59 && segund>= 0)) {
                    setSegundo(segund);
                    setHora(hora);
                    setMinuto(minuto);
                }
            } else flag = false;
        } else flag = false;


        return flag ? new Hora(hora, minuto, segund) : null;
    }

    public Hora avanzarSegundo(int p_segundos){

        int segundosAdicionales = p_segundos % 60; // Calculo los segundo que se pasan de 60
        int nuevosSegundos = getSegundo() + segundosAdicionales; // Sumo los segundos adicionales a los actuales
        if(nuevosSegundos>= 60 ) { // Si se pasa
            nuevosSegundos -= 60; // nuevos segundos le resto 60, por el minuto que se pasa
            setMinuto(getMinuto() + 1); // Sumo el minutoq ue reste recien
        }

        setSegundo(nuevosSegundos);

        int minutosAdicionales = p_segundos  / 60; // Devuelve los minutos completos
        minutosAdicionales += getMinuto(); // Sumo los minutos adicionales de los minutos anteriores
        int nuevasHoras = minutosAdicionales / 60; //Calcula cuantas horas adicionales se obtienen
        int nuevosMinutos = minutosAdicionales % 60; // Los minutos que sobran que se pueden considerar horas completas

        setMinuto(nuevosMinutos); // Actualizo los minutos nuevos

        nuevasHoras += getHora(); //Sumo las horas actuales más las adicionales
        int nuevasHorasAjustadas = nuevasHoras % 24; // Caclucla las horas ajustando el modulo
        setHora(nuevasHorasAjustadas); // Actualiza la hora

        return this; //Retorna el objeto actual
    }

    public int getHora() {
        return hora;
    }

    private void setHora(int hora) {
        this.hora = hora;
    }

    private void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    private void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }


    //Sobreescritura


    @Override
    public String toString() {

        //Casteo los atributos de la hora a String
        String hora = String.valueOf(getHora());
        String minutos = String.valueOf(getMinuto());
        String segundos = String.valueOf(getSegundo());

        //Comprubelo la cantidad de deigitos
        // De ser necesario agrego un '0' para darle formato
        if(hora.length() < 2){
            hora = "0" + hora;
        }
        if (minutos.length() < 2){
            minutos = "0" + minutos;
        }
        if (segundos.length() < 2){
            segundos = "0" + segundos;
        }
        //Retorno la hora
        return  hora + ":" + minutos + ":" + segundos;
    }
}
