package fp.daw.examen2ev;

final public class furgoneta extends vehiculo {

	private int PMA;

	public furgoneta(String matricula) {
		super(matricula);

	}

	public furgoneta(String matricula, int pMA) {
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
		return "furgoneta [PMA=" + PMA + ", toString()=" + super.toString() + "]";
	}

}
