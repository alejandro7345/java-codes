public class LineaFactura {
    private int cantidad;
    String producto;
    private double precioUnitario;

    public LineaFactura(int cantidad, String producto, double precioUnitario) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return cantidad * precioUnitario;
    }
}