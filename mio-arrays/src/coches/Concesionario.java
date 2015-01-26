package coches;

import java.util.List;
import java.util.ArrayList;


public class Concesionario {
	//creo el atributo
	private  List<coches> listaConcesionario;
	//constructor
	public Concesionario(){
		this.listaConcesionario = new ArrayList<coches>();
		//estamos inicializando la lista a una arraylist vacío.
	}
	//añadir coche
	public void addCoche(coches c){
		this.listaConcesionario.add(c);
	}
	//eliminar coche
	public void eliminarCoche(coches c){
		this.listaConcesionario.remove(c);
	}
	//toString
	@Override
	public String toString() {
		return "Concesionario [listaConcesionario=" + listaConcesionario + "]";
	}
	

}
