package coches;

public class coches {
	//atributos de cada coche
	private String matricula;
	private int caballos;
	private int puertas;
	private double precio;
	//constructor
	public coches(String matricula, int caballos, int puertas, double precio) {
		this.matricula = matricula;
		this.caballos = caballos;
		this.puertas = puertas;
		this.precio=precio;
	}
	//getter y setter
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	//
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	//
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	//
	public double getPrecio(){
		return precio;
	}
	//toString
	@Override
	public String toString() {
		return "coches [matricula=" + matricula + ", caballos=" + caballos
				+ ", puertas=" + puertas + "]";
	}
	
	
	
	
}
