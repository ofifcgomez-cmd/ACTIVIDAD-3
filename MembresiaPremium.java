/** Clase derivada con clases grupales e invitaciones mensuales. */
public class MembresiaPremium extends Membresia {
    private int invitacionesMensuales;
    private boolean incluyeClasesGrupales;

    public MembresiaPremium(String folio, String cliente, double cuota,
                             int invitacionesMensuales, boolean clases) {
        super(folio, cliente, cuota);
        this.invitacionesMensuales = invitacionesMensuales;
        this.incluyeClasesGrupales = clases;
    }

    @Override
    public String getTipo() { return "Membresía premium"; }

    /** Aplica 10 % de descuento por contratación anual. */
    @Override
    public double calcularCosto(int meses) {
        double costo = super.calcularCosto(meses);
        return meses >= 12 ? costo * 0.90 : costo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Invitaciones mensuales: " + invitacionesMensuales);
        System.out.println("Clases grupales: " + (incluyeClasesGrupales ? "Incluidas" : "No incluidas"));
    }

    /** Método exclusivo que informa si el cliente puede llevar invitados. */
    public boolean puedeInvitar() { return invitacionesMensuales > 0; }
}
