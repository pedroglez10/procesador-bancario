import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<MetodoPago> metodosPago = new ArrayList<>();
        metodosPago.add(new PagoTarjetaCredito());
        metodosPago.add(new PagoCuentaDebito());

        double[] montos = {11000.0, 5000.0, 6000.0};

        for (double monto : montos) {
            System.out.println("Procesando pago de $" + monto + "...");
            for (MetodoPago metodo : metodosPago) {
                try {
                    metodo.procesarPago(monto);
                } catch (PagoInvalidoException e) {
                    System.out.println("Pago rechazado: " + e.getMessage());
                }
            }
        }
    }
}
