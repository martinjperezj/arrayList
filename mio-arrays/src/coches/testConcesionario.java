package coches;

public class testConcesionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un objeto
		Concesionario listaconce=new Concesionario();
		//añado coches
		listaconce.addCoche(new coches("'6592 pgk'",100,5,1500));
		System.out.println(listaconce);
		//otra forma
		coches c1=(new coches("'5858 asd'",120, 3, 1455));
		listaconce.addCoche(c1);
		System.out.println(listaconce);
		

	}

}
