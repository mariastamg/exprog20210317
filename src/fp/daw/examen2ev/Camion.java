package fp.daw.examen2ev;

final public class Camion extends Vehiculo {
	
	private int PMA;
	public Camion(String matricula) {
		super(matricula);
		
	}
	public Camion(String matricula, int pMA) {
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
		return super.getPrecioAlquiler(numDias) + (20 * this.getPMA())+40;
	}
	@Override
	public String toString() {
		return "camion [PMA=" + PMA + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
