public class Medico extends Trabajador implements IConsultable{
	private int numColegiatura;
	private String especialidad;
	private String apellidoMaterno;
	
	public Medico(){
	}
	
	public Medico(String nombre, String apellidoPaterno, String apellidoMaterno, TipoDedicacion tipo, String especialidad){
		super(nombre,apellidoPaterno,tipo);
		this.apellidoMaterno=apellidoMaterno;
		this.especialidad=especialidad;
	}
	
	public String getApellidoMaterno(){
		return apellidoMaterno;
	}
	
	public String getEspecialidad(){
		return especialidad;
	}
	
	public String consultarDatos(){
		String cad="";
		cad=cad+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno()+ " - "+getEspecialidad()+"\n";
		return cad;
	}
}