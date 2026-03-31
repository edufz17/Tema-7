public final class Medico extends Sanitarias implements EmitirRecetas {

    public Medico(String nombre, String dni, String contras, String especialidad) {
        super(nombre, dni, contras, especialidad);
    }

    public String consultarPrueba(String tipoPrueba) {
        return "El médico " + this.getNombre() + " ha consultado una prueba del tipo " + tipoPrueba;
    }

    @Override
    public String descripcion() {
        return "El empleado{" +
                "nombre='" + this.getNombre() + '\'' +
                '}' + " es médico";
    }

    @Override
    public String emitirReceta(String nombre, String medicamento) {
        return "Receta del médico: " + this.getNombre() + ", para el paciente " + nombre + " de " + medicamento;
    }


}
