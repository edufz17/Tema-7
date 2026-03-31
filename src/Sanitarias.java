public abstract class Sanitarias extends Empleado {
    private String especialidad;

    public Sanitarias(String nombre, String dni, String contras, String especialidad) {
        super(nombre, dni, contras);
        this.especialidad=especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
