/** Clase derivada para clientes con acceso a áreas básicas. */
public class MembresiaBasica extends Membresia {
    private int accesosSemanales;

    public MembresiaBasica(String folio, String cliente, double cuota,
                            int accesosSemanales) {
        super(folio, cliente, cuota);
        this.accesosSemanales = accesosSemanales;
    }

    @Override
    public String getTipo() { return "Membresía básica"; }

    /** Aplica 5 % de descuento por contratar seis meses o más. */
    @Override
    public double calcularCosto(int meses) {
        double costo = super.calcularCosto(meses);
        return meses >= 6 ? costo * 0.95 : costo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Accesos semanales: " + accesosSemanales);
    }

    /** Método exclusivo de la membresía básica. */
    public boolean tieneAccesoDiario() { return accesosSemanales >= 7; }
}
