package banda_musica;
import java.util.List;
import java.util.ArrayList;


public class Banda {
	//creo un atributo de tipo musico List
	private List<musico> listaBanda;
	//constructor de este atributo listaBanda
	public Banda(){
		this.listaBanda= new ArrayList<musico>();
	}
	//añadimos nuevos musicos
	public void addMusicos(musico m){
		listaBanda.add(m);
	}
	//eliminar musico
	public void eliminarMusico(musico m){
		listaBanda.remove(m);
	}
	//saber el musico mas antiguo
	public musico musicoMasAntiguo(){
		double antiguo=0;
		musico musicoMasAntiguo=null;
		for (musico musico : listaBanda) {
			if (musico.getAntiguedad() > antiguo){
				antiguo =musico.getAntiguedad();
				musicoMasAntiguo = musico;
			}
		}
		return musicoMasAntiguo;
	}

	//toString
	@Override
	public String toString() {
		return "Banda [listaBanda=" + listaBanda + "]";
	}
	
}
