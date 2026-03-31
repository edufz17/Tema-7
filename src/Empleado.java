import java.time.LocalDateTime;

public abstract class Empleado {
    private String nombre;
    private String dni;
    private String contras;

    public Empleado(String nombre, String dni, String contras) {
        this.nombre = nombre;
        this.dni = dni;
        this.contras = contras;
    }

    public String getContras() {
        return contras;
    }

    public void setContras(String contras) {
        this.contras = contras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String cambiarContra(String contras) {
        this.contras = contras;
        return "Contraseña de " + this.nombre + " cambiada correctamente";
    }

    public String ficharEntrada() {
        LocalDateTime horaEntrada = LocalDateTime.now();
        return "El empleado " + this.nombre + ", ha fichado su entrada a las: " + horaEntrada;
    }

    public String ficharSalida() {
        LocalDateTime horaSalida = LocalDateTime.now();
        return "El empleado " + this.nombre + ", ha fichado su salida a las: " + horaSalida;
    }

    protected abstract String descripcion();
}
