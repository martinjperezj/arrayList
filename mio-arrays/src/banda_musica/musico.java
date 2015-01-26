package banda_musica;

public class musico {
//atributos del musico
	private String nombre;
	private int edad;
	private double antiguedad;
	//constructor
	public musico(String nombre, int edad, double antiguedad) {
		this.nombre = nombre;
		this.edad = edad;
		this.antiguedad = antiguedad;
	}
	//getter
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getAntiguedad() {
		return antiguedad;
	}
	//toString
	@Override
	public String toString() {
		return "músico [nombre=" + nombre + ", edad=" + edad + ", antiguedad="
				+ antiguedad + "]";
	}
	
}
