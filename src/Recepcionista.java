public final class Recepcionista extends Administrativas implements EmitirRecetas {


    public Recepcionista(String nombre, String dni, String contras, String departamento) {
        super(nombre, dni, contras, departamento);
    }

    @Override
    public String descripcion() {
        return "El empleado{" +
                "nombre='" + this.getNombre() + '\'' +
                '}' + " es recepcionista";
    }

    @Override
    public String emitirReceta(String nombre, String medicamento) {
        return "Receta del recepcionista: " + this.getNombre() + ", para el paciente " + nombre + " de " + medicamento;
    }
}
