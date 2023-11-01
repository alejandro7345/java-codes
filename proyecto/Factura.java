public class Factura {
    String cliente;
    String fecha;
    
    private LineaFactura[] lineaFacturas;

    public Factura(String cliente, String fecha, LineaFactura[] lineaFacturas) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineaFacturas = lineaFacturas;
        
    }

    public double getTotal() {
        double total = 0.0;
        for (LineaFactura linea : lineaFacturas) {
            total += linea.getSubtotal();
        }
        return total;
    }
}

