package models;

import models.Persona;

public class Cliente extends Persona {

    public Cliente(String nombre, String email) {
        super(nombre, email);
    }

    public Cliente(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    public Cliente() {
    }
}
