package fp.daw.examen2ev;

public class vehiculo implements alquiler {

	protected static String matricula;

	public vehiculo(String matricula) {
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
