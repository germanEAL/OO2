package ar.edu.unlp.info.oo2.Ejercicio2P4;

import java.time.LocalDate;

public interface File {
	
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public String getPermisos();
	public LocalDate getFechaCreacion();
	public double getTamaño();
}
