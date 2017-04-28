
public class Objeto{
	
	private int pi;
	private int vi;
	private int ci;
	
	public Objeto(int v, int p, int c){
		pi= p;
		vi= v;
		ci= c;
	}

	public void setCantidad(int ci) {
		this.ci = ci;
	}
	public int getCantidad() {
		return ci;
	}
	public int getPeso() {
		return pi;
	}

	public void setPeso(int peso) {
		this.pi = peso;
	}
	
	public int getValor() {
		return vi;
	}

	public void setValor(int valor) {
		this.vi = valor;
	}
	
	public int calcularValorxPeso(){
		return (this.vi /this.pi);
	}
	 
	public boolean equals(Object e1){
		if((((Objeto) e1).getValor()==this.getValor())&&(((Objeto) e1).getPeso()==this.getPeso())){
			return true;
		}
		else{
			return false;
		}
	}
	
}
