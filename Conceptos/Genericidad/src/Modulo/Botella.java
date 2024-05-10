package Modulo;

import Interfaces.IValorable;

public class Botella implements IValorable {

    private int capacidad;
    @Override
    public String valorar() {
        return null;
    }

    public Botella() {
        this.capacidad = 10;
    }

    @Override
    public String toString() {
        return "Botella{" +
                "capacidad=" + capacidad +
                '}';
    }
}
