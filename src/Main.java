import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        Medico medico = new Medico("Daniel Guzman", "02312131H", "41441412", "Cardiólogo");
        Enfermero enfermero = new Enfermero("Jorge Gutierrez", "12412214A", "4145515", "Neonatal");
        Recepcionista recepcionista = new Recepcionista("Carlos Sainz", "14451241J", "413waedasd", "Finanzas");
        Contable contable = new Contable("Pedro Porro", "4124124K", "241ewaser", "Marketing");

        empleados.add(medico);
        empleados.add(enfermero);
        empleados.add(recepcionista);
        empleados.add(contable);

        for (Empleado e : empleados) {
            System.out.println(e.descripcion());
            System.out.println(e.ficharEntrada());

            if (e instanceof Medico) {
                System.out.println(((Medico) e).consultarPrueba("Radiografia"));
                System.out.println(((Medico) e).emitirReceta("Pepe", "Ibuprofeno") + "\n");
            }
            if (e instanceof Enfermero) {
                System.out.println(((Enfermero) e).registrarPruebas("Radiografia") + "\n");
            }
            if (e instanceof Recepcionista) {
                System.out.println(((Recepcionista) e).emitirReceta("Juanjo", "Paracetamol") + "\n");
            }
            if (e instanceof Contable) {
                System.out.println(((Contable) e).emitirFactura("1300€ café") + "\n");
            }
            System.out.println(e.ficharSalida());
        }

        /*
        for (Empleado e : empleados) {
            if (e instanceof Medico) {
                System.out.println(e.descripcion());
                System.out.println(e.ficharEntrada());
                System.out.println(((Medico) e).consultarPrueba("Radiografia"));
                System.out.println(((Medico) e).emitirReceta("Pepe", "Ibuprofeno"));
                System.out.println(e.ficharSalida() + "\n");
            }
            if (e instanceof Enfermero) {
                System.out.println(e.descripcion());
                System.out.println(e.ficharEntrada());
                System.out.println(((Enfermero) e).registrarPruebas("Radiografia"));
                System.out.println(e.ficharSalida() + "\n");
            }
            if (e instanceof Recepcionista) {
                System.out.println(e.descripcion());
                System.out.println(e.ficharEntrada());
                System.out.println(((Recepcionista) e).emitirReceta("Juanjo", "Paracetamol"));
                System.out.println(e.ficharSalida() + "\n");
            }
            if (e instanceof Contable) {
                System.out.println(e.descripcion());
                System.out.println(e.ficharEntrada());
                System.out.println(((Contable) e).emitirFactura("1300€ café"));
                System.out.println(e.ficharSalida() + "\n");
            }
        }*/


    }
}
