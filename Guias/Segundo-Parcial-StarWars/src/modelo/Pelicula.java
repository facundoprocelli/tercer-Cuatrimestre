package modelo;

import java.io.Serializable;

public class Pelicula implements Serializable {

  private   StarWarsRegistro<Personaje> personajes;

    public Pelicula() {
        this.personajes = new StarWarsRegistro<>();
    }

    public void setPersonajes(StarWarsRegistro<Personaje> personajes) {
        this.personajes = personajes;
    }

    public StarWarsRegistro<Personaje> getPersonajes() {
        return personajes;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "personajes=" + personajes +
                '}';
    }
}
