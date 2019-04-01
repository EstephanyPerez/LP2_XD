public class Administrativo extends Trabajador implements IConsultable{
	private RegimenTrabajo regimen;
	private String funcion;
	private String apellidoMaterno;
	
	public Administrativo(){
	}
	
	public Administrativo(String nombre, String apellidoPaterno, String apellidoMaterno, TipoDedicacion tipo, RegimenTrabajo regimen){
		super(nombre, apellidoPaterno,tipo);
		this.apellidoMaterno=apellidoMaterno;
		this.regimen=regimen;		
	}
	
	public String getApellidoMaterno(){
		return apellidoMaterno;
	}
	
	public RegimenTrabajo getRegimen(){
		return regimen;
	}
	
	public String consultarDatos(){
		String cad="";
		cad=cad+getNombre()+" "+getApellidoPaterno()+" "+ getApellidoMaterno()+ " - "+getTipoDedicacion()+ "-"+getRegimen()+"\n";
		return cad;
	}
}