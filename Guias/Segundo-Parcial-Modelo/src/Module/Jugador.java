package Module;

import javax.lang.model.element.Name;
import java.io.Serializable;
import java.util.Objects;

public class Jugador implements Serializable{

    private String _id;
    private String guid;
    private boolean isActive;
    private String balance;
    private int age;
    private String eyeColor;
    private name nombre;
    private String email;
    private String phone;
    private String position;

    public Jugador(String _id, String guid, boolean isActive, String balance, int age, String eyeColor, name nombre, String email, String phone, String position) {
        this._id = _id;
        this.guid = guid;
        this.isActive = isActive;
        this.balance = balance;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
        this.position = position;
    }

    public String get_id() {
        return _id;
    }

    public String getGuid() {
        return guid;
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

    public name getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "_id='" + _id + '\'' +
                ", guid='" + guid + '\'' +
                ", isActive=" + isActive +
                ", balance=" + balance +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", nombre=" + nombre +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Jugador jugador = (Jugador) object;
        return isActive == jugador.isActive && age == jugador.age && Objects.equals(_id, jugador._id) && Objects.equals(guid, jugador.guid) && Objects.equals(balance, jugador.balance) && Objects.equals(eyeColor, jugador.eyeColor) && Objects.equals(nombre, jugador.nombre) && Objects.equals(email, jugador.email) && Objects.equals(phone, jugador.phone) && Objects.equals(position, jugador.position);
    }


    @Override
    public int hashCode() {
        return Objects.hash(_id, guid, isActive, balance, age, eyeColor, nombre, email, phone, position);
    }


}

