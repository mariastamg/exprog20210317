package fp.daw.examen2ev;

final public class camion extends vehiculo {
	
	private int PMA;
	public camion(String matricula) {
		super(matricula);
		
	}
	public camion(String matricula, int pMA) {
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
		return super.getPrecioAlquiler(numDias) + 20 * this.getPMA()+40;
	}
	@Override
	public String toString() {
		return "camion [PMA=" + PMA + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
