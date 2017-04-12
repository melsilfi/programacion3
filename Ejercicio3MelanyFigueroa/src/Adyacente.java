class Adyacente {

	double peso;
	int destino;

	Adyacente(int codAdy, double p){
		destino=codAdy; peso = p;
	}

	public String toString(){
		if(peso==0){
			return ("Arista: " + destino);
		}
		else{
			return (destino + "("+ peso + ")");
		}
	}
}
