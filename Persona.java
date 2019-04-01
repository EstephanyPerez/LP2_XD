public abstract class Persona{
	private char sexo;
	private String DNI;
	private int edad;
	private EstadoCivil estadoCivil;
	
	public Persona(){
	}
	
	public Persona(char sexo, String DNI, int edad, EstadoCivil estadoCivil){
		this.sexo=sexo;
		this.DNI=DNI;
		this.edad=edad;
		this.estadoCivil=estadoCivil;
	}
	
	public char getSexo(){
		return sexo;
	}
	
	public void setSexo(char sexo){
		this.sexo=sexo;
	}
	
	public String getDNI(){
		return DNI;
	}
	
	public void setDNI(String DNI){
		this.DNI=DNI;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	public EstadoCivil getEstadoCivil(){
		return estadoCivil;
	}
	
	public void setEstadoCivil(EstadoCivil estadoCivil){
		this.estadoCivil=estadoCivil;
	}
		
}