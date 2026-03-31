public final class Contable extends Administrativas {
    public Contable(String nombre, String dni, String contras, String departamento) {
        super(nombre, dni, contras, departamento);
    }

    public String emitirFactura(String factura) {
        return "El contable " + this.getNombre() + " emite la factura: " + factura;
    }

    @Override
    public String descripcion() {
        return "El empleado{" +
                "nombre='" + this.getNombre() + '\'' +
                '}' + " es contable";
    }
}
