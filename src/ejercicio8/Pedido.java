package ejercicio8;

public class Pedido {

    private double precio;

    public Pedido(double precio) {
        this.precio = precio;
    }

    public double calcularTotal() {
        return precio * 1.21;
    }

    public double calcularTotalAntiguo() {
        return precio + (precio * 0.21);
    }
}

