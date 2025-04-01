package models;

public abstract class Persona {
    private int id;
    private String nombre;
    private String email;


    // Constructor


    public Persona(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Persona(String nombre, String email) {
        this.id = 0;
        this.nombre = nombre;
        this.email = email;
    }

    public Persona() {
        this.id = 0;
        this.nombre = null;
        this.email = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
