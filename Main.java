/** Clase principal con las pruebas de herencia y polimorfismo. */
public class Main {
    public static void main(String[] args) {
        MembresiaBasica basica = new MembresiaBasica("MB-101", "Ana López", 450, 7);
        MembresiaPremium premium = new MembresiaPremium("MP-202", "Carlos Méndez", 850, 2, true);

        RegistroGimnasio registro = new RegistroGimnasio();
        registro.agregarMembresia(basica);
        registro.agregarMembresia(premium);

        System.out.println("=== CONTROL DE MEMBRESÍAS ===");
        registro.mostrarMembresias();

        System.out.println("Ana tiene acceso diario: " + basica.tieneAccesoDiario());
        System.out.println("Carlos puede invitar: " + premium.puedeInvitar());

        Membresia referencia = premium;
        System.out.println("Prueba polimórfica: " + referencia.getTipo()
                + " | $" + referencia.calcularCosto(12));
    }
}
