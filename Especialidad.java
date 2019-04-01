public class Especialidad{
	private String nombre;
	private Clasificacion clasificacion;
	
	public Especialidad(){
	}
	
	public Especialidad(String nombre,Clasificacion clasificacion){
		this.nombre=nombre;
		this.clasificacion=clasificacion;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public Clasificacion getClasificacion(){
		return clasificacion;
	}
	
	public void setClasificacion(Clasificacion clasificacion){
		this.clasificacion=clasificacion;
	}
}