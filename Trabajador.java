public abstract class Trabajador extends Persona{
	private static int codigo=0;
	private float salario;
	private TipoDedicacion tipo;
	private int anexo;
	private String nombre;
	private String apellidoPaterno;
	
	public Trabajador(){
		codigo++;
	}
	
	public Trabajador(String nombre,String apellidoPaterno, TipoDedicacion tipo){
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.tipo=tipo;
		codigo++;		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getApellidoPaterno(){
		return apellidoPaterno;
	}
	
	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno=apellidoPaterno;
	}
	
	public TipoDedicacion getTipoDedicacion(){
		return tipo;
	}
	
	public String consultarDatos(){
		return "";
	}
	
	
}
