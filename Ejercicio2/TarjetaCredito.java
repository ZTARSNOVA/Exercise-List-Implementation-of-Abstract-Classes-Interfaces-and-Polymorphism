public class TarjetaCredito implements interfazPago {
    private String numeroTarjeta;
    private String nombreTitular;

    public TarjetaCredito(String numeroTarjeta, String nombreTitular) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
    }
    public void realizarPago(double monto) {
        System.out.println("Pago de s/." + monto + " realizado por tarjeta de crédito: " + nombreTitular);
    }
    public void emitirRecibo() {
        System.out.println("Recibo emitido");
    }
}
