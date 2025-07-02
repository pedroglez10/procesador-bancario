public abstract class MetodoPago {
    public abstract void procesarPago(double monto) throws PagoInvalidoException;
}
