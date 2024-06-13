package Modulo;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String email;
    private String phone;

    public Contacto(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
