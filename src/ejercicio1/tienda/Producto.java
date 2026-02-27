package ejercicio1.tienda;

public class Producto {
	
	private static final double IVA = 0.21;
    
	public double precioProducto;

    public void mostrarPrecio() {
        double precioProductoIVA = calculaPrecioNeto();
		System.out.println(precioProductoIVA);
    }

	private double calculaPrecioNeto() {
		double precioProductoIVA = precioProducto * IVA;
		return precioProductoIVA;
	}
    
    public static void main(String[] args) {
    	
    	Producto p = new Producto();
		p.mostrarPrecio();
	}
}