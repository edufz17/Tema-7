public final class Enfermero extends Sanitarias {

    public Enfermero(String nombre, String dni, String contras, String especialidad) {
        super(nombre, dni, contras, especialidad);

    }

    public String registrarPruebas(String tipoPrueba) {
        return "El enfermero " + this.getNombre() + " ha registrado una prueba del tipo " + tipoPrueba;
    }

    @Override
    public String descripcion() {
        return "El empleado{" +
                "nombre='" + this.getNombre() + '\'' +
                '}' + " es enfermero";
    }
}
