package ejercicio3;

public class Mercado {
    
    public static final double VALOR_DESCUENTO = 0.10;

	public void mostrarPrecioFinal(double precio) {
        System.out.println("Precio final: " + calcularPrecio(precio));
    }

	private double calcularPrecio(double precio) {
		double descuento = precio * VALOR_DESCUENTO;
		double total = precio - descuento;
		return total;
	}
    
    public static void main(String[] args) {
		Mercado m = new Mercado();
		m.mostrarPrecioFinal(300);
	}
    
}