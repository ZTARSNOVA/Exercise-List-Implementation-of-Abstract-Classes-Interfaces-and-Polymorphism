public class TransferenciaBancaria implements interfazPago {
    private String cuentaOrigen;
    private String cuentaDestino;

    public TransferenciaBancaria(String cuentaOrigen, String cuentaDestino) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }
    public void realizarPago(double monto) {
        System.out.println("Pago de S/." + monto + " realizado por transferencia: " + cuentaOrigen + " - " + cuentaDestino);
    }
    public void emitirRecibo() {
        System.out.println("Recibo emitido");
    }
}
