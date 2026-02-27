package ejercicio5;

public class CentroEducativo {

    public void imprimirInfo(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

	private void imprimirAlumno(String nombre, int edad) {
		System.out.println("La información del alumno es:");
    	imprimirInfo(nombre,edad);
	}

    public void imprimirProfesor(String nombre, int edad) {
    	System.out.println("La información del profesor es:");
    	imprimirInfo(nombre,edad);

    }
    
    public static void main(String[] args) {
		CentroEducativo ce = new CentroEducativo();
		ce.imprimirProfesor("Dani", 29);
		ce.imprimirAlumno("Oscar", 42);
	}
    
    
}

