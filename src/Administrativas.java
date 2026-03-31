public abstract class Administrativas extends Empleado {
    private String departamento;

    public Administrativas(String nombre, String dni, String contras, String departamento) {
        super(nombre, dni, contras);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
