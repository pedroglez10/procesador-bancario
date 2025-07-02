public class PagoTarjetaCredito extends MetodoPago {
    private static final double LIMITE = 10000.0;

    @Override
    public void procesarPago(double monto) throws PagoInvalidoException {
        if (monto > LIMITE) {
            throw new PagoInvalidoException("Límite de tarjeta excedido");
        }

        System.out.println("Pago con tarjeta aprobado por $" + monto);
    }
}
