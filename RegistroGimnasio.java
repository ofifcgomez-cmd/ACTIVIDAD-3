import java.util.ArrayList;

/** Administra diferentes tipos de membresía mediante una lista de clase base. */
public class RegistroGimnasio {
    private ArrayList<Membresia> membresias = new ArrayList<>();

    public void agregarMembresia(Membresia membresia) {
        membresias.add(membresia);
    }

    /** Demuestra polimorfismo al llamar la versión sobrescrita de cada objeto. */
    public void mostrarMembresias() {
        for (Membresia membresia : membresias) {
            membresia.mostrarInformacion();
            System.out.println("Costo de 12 meses: $" + membresia.calcularCosto(12));
            System.out.println("-----------------------------");
        }
    }
}
