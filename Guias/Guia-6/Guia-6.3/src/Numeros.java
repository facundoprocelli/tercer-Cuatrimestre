public class Numeros implements Relaciones{
    private int dato;

    public Numeros(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    @Override
    public boolean esIgual(Object object) {
        boolean rta = false;

        if(object instanceof Numeros){
            Numeros num = (Numeros) object;

            if(getDato() == num.getDato()){
                rta = true;
            }

        }

        return rta;
    }

    @Override
    public boolean esMayor(Object object) {
        boolean rta = false;

        if(object instanceof Numeros){
            Numeros num = (Numeros) object;

            if(getDato() > num.getDato()){
                rta = true;
            }

        }

        return rta;
    }

    @Override
    public boolean esMenor(Object object) {
        boolean rta = false;

        if(object instanceof Numeros){
            Numeros num = (Numeros) object;

            if(getDato() < num.getDato()){
                rta = true;
            }

        }

        return rta;
    }
}
