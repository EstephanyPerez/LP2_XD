import java.io.*;
import java.util.ArrayList;

public class Principal{
	public static void main(String[] args){
		Clinica clinica = new Clinica();
		clinica.setNombre("HCM SAN MIGUEL");
		Especialidad esp1 = new Especialidad("DERMATOLOGIA",Clasificacion.C);
		Especialidad esp2 = new Especialidad("PEDIATRIA",Clasificacion.C);
		Medico med1 = new Medico("JUAN","PEREZ","ORTIZ",TipoDedicacion.TC,esp1.getNombre());
		Medico med2 = new Medico("MARIA","ALVARADO","MENDOZA",TipoDedicacion.TC,esp2.getNombre());
		Administrativo adm = new Administrativo("KARLA","CORDOVA","ARELLANO",TipoDedicacion.TP,RegimenTrabajo.CAS);
		Ejecutivo ejec = new Ejecutivo("KATY","PEREZ",TipoDedicacion.TC);
		clinica.getTrabajadores().add(med1);
		clinica.getTrabajadores().add(med2);
		clinica.getTrabajadores().add(adm);
		clinica.getTrabajadores().add(ejec);
		String reporte=clinica.mostrarMedyAdmin();
		System.out.println(reporte);
	}
}