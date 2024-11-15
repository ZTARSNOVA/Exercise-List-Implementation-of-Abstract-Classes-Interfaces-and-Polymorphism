import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pago extends JFrame {
    private JTextField monto;
    private JTextArea recibo;
    private JButton realizarPago;
    private JComboBox<String> metodoPago;

    private static final int ANCHO = 500, ALTO = 200;

    public Pago() {
        setTitle("SISTEMA DE PAGO");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new GridLayout(3, 2));
        panelSuperior.add(new JLabel("Método de Pago:"));

        metodoPago = new JComboBox<>(new String[]{"Tarjeta de Crédito", "Transferencia Bancaria", "PayPal"});
        panelSuperior.add(metodoPago);

        panelSuperior.add(new JLabel("Monto:"));
        monto = new JTextField();
        panelSuperior.add(monto);

        realizarPago = new JButton("Realizar Pago");
        panelSuperior.add(realizarPago);

        add(panelSuperior, BorderLayout.NORTH);

        recibo = new JTextArea();
        recibo.setEditable(false);
        add(new JScrollPane(recibo), BorderLayout.CENTER);

        realizarPago.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarPago();
            }
        });
    }

    private void realizarPago() {
        String metodoSeleccionado = (String) metodoPago.getSelectedItem();
        String montoText = monto.getText();

        try {
            double monto = Double.parseDouble(montoText);
            interfazPago pago;

            switch (metodoSeleccionado) {
                case "Tarjeta de Crédito":
                    pago = new TarjetaCredito("1234-5678-9012-3456", "Camila Zúñiga");
                    break;
                case "Transferencia Bancaria":
                    pago = new TransferenciaBancaria("ABC123", "XYZ789");
                    break;
                case "PayPal":
                    pago = new PayPal("camilazuniga2002@hotmail.com");
                    break;
                default:
                    throw new IllegalArgumentException("Método de pago no válido.");
            }

            pago.realizarPago(monto);
            recibo.setText("Pago realizado de S/." + monto + " mediante " + metodoSeleccionado + ".\n");
            pago.emitirRecibo();
            recibo.append("Recibo emitido!");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un monto válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Pago().setVisible(true));
    }
}
