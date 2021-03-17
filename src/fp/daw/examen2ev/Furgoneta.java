package fp.daw.examen2ev;

final public class Furgoneta extends Vehiculo {

	private int PMA;

	public Furgoneta(String matricula) {
		super(matricula);

	}

	public Furgoneta(String matricula, int pMA) {
		super(matricula);
		PMA = pMA;
	}

	public int getPMA() {
		return PMA;
	}

	public void setPMA(int pMA) {
		PMA = pMA;
	}

	@Override
	public double getPrecioAlquiler(int numDias) {
		return super.getPrecioAlquiler(numDias) + 20 * this.getPMA();
	}

	@Override
	public String toString() {
		return "Furgoneta [PMA=" + PMA + ", toString()=" + super.toString() + "]";
	}

}
