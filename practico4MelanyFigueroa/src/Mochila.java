import java.util.ArrayList;

public class Mochila {

	private ArrayList<Objeto> mochila;
	private ArrayList<Objeto> objetos;
	private int pesoTotal;
	private int pesoActual;

	public Mochila(int peso, ArrayList objetos) {
		pesoTotal = peso;
		this.objetos = objetos;
		mochila = new ArrayList<Objeto>();
		pesoActual = 0;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}


	public void mostrarContenido() {
		for (int i = 0; i < mochila.size(); i++) {
			System.out.println("Valor Objeto: " + mochila.get(i).getValor() + " Peso Objeto: "
					+ mochila.get(i).getPeso() + " Cantidad Objeto: " + mochila.get(i).getCantidad());
		}
		System.out.println("Peso obtenido:"+ pesoActual);

	}

	public Objeto seleccionar(ArrayList<Objeto> obj) {
		//Devuelve el objeto con mejor ganancia en base la relación de peso/valor.
		Objeto mayor = null;
		float mayorGanancia = -100000000;
		if (!(obj.isEmpty())) {
			for (int i = 0; i < obj.size(); i++) {
				Objeto o = obj.get(i);
				if (o.getCantidad() > 0) {
					if (getGanancia(o) > mayorGanancia) {
						mayor = o;
						mayorGanancia = getGanancia(o);
					}
				}
			}
		}
		return mayor;
	}

	private float getGanancia(Objeto o) {
		return o.getValor() / o.getPeso();
	}

	public boolean factible(Objeto o) {
		//Retorna true o false si el peso del objeto mas el peso que se va a agregar cumple la condición
		return pesoActual + o.getPeso() <= pesoTotal;
	}

	public void agregarObjetosAMochila() {
		//Agrega los objetos a la mochila si son fatibles
		if (objetos.isEmpty()) {
			System.out.println("No hay objetos a agregar");
		} else {
			while (!objetos.isEmpty()) {
				Objeto o = seleccionar(objetos);
				if (factible(o)) {
					o.setCantidad(o.getCantidad() - 1);
					//Si es factible descuento uno a la cantidad
					if (o.getCantidad() == 0) {
						//Si me quede sin ese objeto lo saco del arreglo
						objetos.remove(o);
					}
					pesoActual += o.getPeso();
					mochila.add(o);
				} else {
					objetos.remove(o);
				}
			}
		}
	}
}
