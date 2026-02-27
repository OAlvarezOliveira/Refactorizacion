package ejercicio4;

public class Cliente {

	public static double calcularDescuento(String tipo) {
		double descuento = 0;

		if (tipo.equals("NORMAL")) {
			descuento = 0;
		} else if (tipo.equals("VIP")) {

			descuento = 0.20;
		} else if (tipo.equals("PREMIUM")) {
			descuento = 0.30;
		}

		return descuento;
	}

	public static void main(String[] args) {

		System.out.println(Cliente.calcularDescuento("VIP"));

	}
}


