import java.util.ArrayList;
import java.io.*;

public class Clinica{
	private String nombre;
	private String direccion;
	private Ciudad ciudad;
	private ArrayList<Trabajador> trabajadores;
	
	public Clinica(){
		trabajadores=new ArrayList<Trabajador>();
	}
	
	public Clinica(String nombre, String direccion, Ciudad ciudad){
		this.nombre=nombre;
		this.direccion=direccion;
		this.ciudad=ciudad;
		trabajadores=new ArrayList<Trabajador>();
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getDireccion(){
		return direccion;
	}
	
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	
	public Ciudad getCiudad(){
		return ciudad;
	}
	
	public void setCiudad(Ciudad ciudad){
		this.ciudad=ciudad;
	}		
	
	public ArrayList<Trabajador> getTrabajadores(){
		return trabajadores;
	}
	
	public void setTrabajadores(ArrayList<Trabajador> trabajadores){
		this.trabajadores=trabajadores;
	}
	
	public String mostrarMedyAdmin(){
		String cad = "";		
		cad=cad+"Clínica: "+getNombre() +"\n";
		cad=cad+"Reporte: Lista de médicos y administrativos\n\n";
		for(Trabajador t : getTrabajadores()){
			if(t instanceof Medico || t instanceof Administrativo){
				cad=cad+t.consultarDatos();
			}
		}
		return cad;
	}
}