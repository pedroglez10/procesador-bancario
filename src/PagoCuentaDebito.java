public class PagoCuentaDebito extends MetodoPago {
    private static final double SALDO_DISPONIBLE = 5000.0;

    @Override
    public void procesarPago(double monto) throws PagoInvalidoException {
        if (monto > SALDO_DISPONIBLE) {
            throw new PagoInvalidoException("Saldo insuficiente en cuenta de débito");
        }

        System.out.println("Pago con débito aprobado por $" + monto);
    }
}
