package fp.daw.examen2ev;

public class Vehiculo implements Alquiler {

	protected static String matricula;

	public Vehiculo(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "vehiculo [matricula=" + matricula + "]";
	}

	@Override
	public double getPrecioAlquiler(int numDias) {
		int precioAlquiler = numDias * 50;
		return precioAlquiler;

	}

}
