/** Clase base que representa una membresía general del gimnasio. */
public class Membresia {
    private String folio;
    private String nombreCliente;
    private double cuotaMensual;
    private boolean activa;

    public Membresia(String folio, String nombreCliente, double cuotaMensual) {
        if (cuotaMensual <= 0) {
            throw new IllegalArgumentException("La cuota mensual debe ser mayor que cero.");
        }
        this.folio = folio;
        this.nombreCliente = nombreCliente;
        this.cuotaMensual = cuotaMensual;
        this.activa = true;
    }

    /** Calcula el costo de varios meses de membresía. */
    public double calcularCosto(int meses) {
        validarMeses(meses);
        return cuotaMensual * meses;
    }

    protected void validarMeses(int meses) {
        if (meses <= 0) {
            throw new IllegalArgumentException("Los meses deben ser mayores que cero.");
        }
    }

    protected double getCuotaMensual() { return cuotaMensual; }
    public String getFolio() { return folio; }
    public String getNombreCliente() { return nombreCliente; }
    public String getTipo() { return "Membresía general"; }

    public void cancelar() { activa = false; }

    public void mostrarInformacion() {
        System.out.println("Folio: " + folio);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo: " + getTipo());
        System.out.println("Cuota mensual: $" + cuotaMensual);
        System.out.println("Estado: " + (activa ? "Activa" : "Cancelada"));
    }
}
