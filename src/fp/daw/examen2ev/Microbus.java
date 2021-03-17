package fp.daw.examen2ev;

final public class Microbus extends Vehiculo {
private int numPlazas;

////constructor de la superclase
public Microbus() {
	super(matricula);
}

public Microbus(String matricula, int numPlazas) {
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
public double getPrecioAlquiler(int numDias) {

	return super.getPrecioAlquiler(numDias)+2*numDias*this.getNumPlazas();
}

@Override
public String toString() {
	return "microbus [numPlazas=" + numPlazas + ", toString()=" + super.toString() + "]";
}



}
