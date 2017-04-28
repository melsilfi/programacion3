import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		int peso=8;
		
		Objeto o1 = new Objeto(500,1,4);
		Objeto o2 = new Objeto(20,1,3);
		Objeto o3 = new Objeto(60,2,3);
		ArrayList<Objeto> objetos = new ArrayList<Objeto>();
		objetos.add(o1);
		objetos.add(o2);
		objetos.add(o3);
		Mochila m = new Mochila(peso,objetos);
		m.agregarObjetosAMochila();
		m.mostrarContenido();
		
                                                                                                                                                                                                                                                           
	}

}
