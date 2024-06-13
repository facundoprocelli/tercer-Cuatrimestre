package Modulo;

import java.io.Serializable;

public class Trabajador implements Serializable {
    private String _id;
    private String name;
    private boolean isActive;
    private String balance;
    private int age;
    private String eyeColor;
    private String job;
    private Contacto contacts;


    public Trabajador(String _id, String name, boolean isActive, String balance, int age, String eyeColor, String job, Contacto contacts) {
        this._id = _id;
        this.name = name;
        this.isActive = isActive;
        this.balance = balance;
        this.age = age;
        this.eyeColor = eyeColor;
        this.job = job;
        this.contacts = contacts;
    }

    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getJob() {
        return job;
    }

    public Contacto getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", balance='" + balance + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", job='" + job + '\'' +
                ", contacts=" + contacts +
                '}' + "\n";
    }


    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj instanceof Trabajador t) {
            if (this.get_id().equals(t.get_id())) {
                rta = true;
            }
        }
        return rta;
    }
}
