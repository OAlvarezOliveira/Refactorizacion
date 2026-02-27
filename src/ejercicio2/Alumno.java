package ejercicio2;

public class Alumno {
	
    private String nombre;
    private int edad;
    
    
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad >=0 ) {		
			this.edad = edad;
			}
	}
    
	public static void main(String[] args){
		
		Alumno a = new Alumno();
		System.out.println("Edad: "+ a.getEdad());
		a.setEdad(-1);
		System.out.println("Edad: "+ a.getEdad());
		a.setEdad(22);
		System.out.println("Edad: "+ a.getEdad());

	}
    
	
}
