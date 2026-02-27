package ejercicio6;

public class Factura {

	public static final double IVA = 0.21;

	public double calcular(double precio) {
	    return precio + (precio * IVA);
	}

	public static void main(String[] args) {
		Factura f = new Factura();
		System.out.println("Precio con IVA: " + f.calcular(100));
	}
}
