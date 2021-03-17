package fp.daw.examen2ev;

final public class coche extends vehiculo {
	
	private int numPlazas;

	//constructor de la superclase
	public coche() {
		super(matricula);
	}
	//constructor que añade los parametros propios de coche

	public coche(String matricula, int numPlazas) {
		super(matricula);
		this.numPlazas = numPlazas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	@Override
	//Sobreescribimos metodo getPrecioAlquiler para cumplir la condicion para los coches
	public double getPrecioAlquiler(int numDias) {
		return super.getPrecioAlquiler(numDias)+(this.getNumPlazas()*1.5);
	}

	@Override
	public String toString() {
		return "coche [numPlazas=" + numPlazas + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
