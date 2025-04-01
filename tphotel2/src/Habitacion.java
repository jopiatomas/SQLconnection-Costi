public class Habitacion {
    public enum Tipo {
        SIMPLE, DOBLE, SUITE;
    }
    private Integer numeroHabitacion;
    private Tipo tipo;
    private Double precio;

    // constructor


    public Habitacion(Integer numeroHabitacion, Tipo tipo, Double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Habitacion() {
        this.numeroHabitacion = 0;
        this.tipo = null;
        this.precio = 0.0;
    }
}
