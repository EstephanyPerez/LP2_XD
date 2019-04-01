public class Ejecutivo extends Trabajador{
	private int pasaporte;
	private int SSN;
	
	public Ejecutivo(){
	}
	
	public Ejecutivo(String nombre, String apellidoPaterno, TipoDedicacion tipo){
		super(nombre, apellidoPaterno,tipo);
	}
}