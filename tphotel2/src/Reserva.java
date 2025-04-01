import java.util.Date;

public class Reserva {

    private int id;
    private int cliente_id;
    private  int habitacion_id;
    private Date fecha_entrada;
    private Date fecha_salida;

    public Reserva(int id, int cliente_id, int habitacion_id, Date fecha_entrada, Date fecha_salida) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.habitacion_id = habitacion_id;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }

    public Reserva(int cliente_id, int habitacion_id, Date fecha_entrada, Date fecha_salida) {
        this.id = 0;
        this.cliente_id = cliente_id;
        this.habitacion_id = habitacion_id;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }
}
