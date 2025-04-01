package models;

public class Usuario extends Persona {
    public enum Rol {
        CLIENTE, RECEPCIONISTA, ADMINISTRADOR;
    }
    private Rol rol;


    // constructor


    public Usuario(int id,String nombre, String email, Rol rol) {
        super(id,nombre, email);
        this.rol = rol;
    }
    public Usuario(String nombre, String email, Rol rol) {
        super(nombre, email);
        this.rol = rol;
    }

    public Usuario() {
        super();
        this.rol = null;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "rol=" + rol +
                "} " + super.toString();
    }
}
