public class PayPal implements interfazPago {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }
    public void realizarPago(double monto) {
        System.out.println("Pago de S/." + monto + " realizado por PayPal: " + email);
    }
    public void emitirRecibo() {
        System.out.println("Recibo emitido");
    }
}
