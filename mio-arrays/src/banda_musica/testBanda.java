package banda_musica;

public class testBanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creo un objeto 
		Banda listaBanda= new Banda();
		//a�ado musico
		listaBanda.addMusicos(new musico("Martin", 21, 14));
		//a�ado de otra manera, creando un objeto musico y a�adiendolo
		musico m1=new musico("juan",16,8);
		listaBanda.addMusicos(m1);
		System.out.println(listaBanda);
		System.out.println("El musico mas antiguo es: "+listaBanda.musicoMasAntiguo());

	}

}
