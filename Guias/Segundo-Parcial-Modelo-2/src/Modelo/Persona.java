package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Persona implements Serializable {

    private String _id;
    private boolean isActive;
    private String balance;
    private String eyeColor;
    private String name;
    private String gender;
    private int age;
    private ArrayList<String> tags;
    private ArrayList<Amigo> amigos;

    public Persona(String _id, boolean isActive, String balance, String eyeColor, String name, String gender, int age, ArrayList<String> tags, ArrayList<Amigo> amigos) {
        this._id = _id;
        this.isActive = isActive;
        this.balance = balance;
        this.eyeColor = eyeColor;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.tags = tags;
        this.amigos = amigos;
    }

    public String get_id() {
        return _id;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getBalance() {
        return balance;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "_id='" + _id + '\'' +
                ", isActive=" + isActive +
                ", balance='" + balance + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tags=" + tags +
                ", amigos=" + amigos +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object object) {
        boolean rta = false;

        if(object instanceof Persona persona){
            if(this.get_id().equals(persona.get_id())){
                rta = true;
            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
