package ar.edu.unlp.info.oo2.Ejercicio3P2;

import java.time.LocalDate;

public abstract class FileComponent {

	protected String nombre;
	protected LocalDate fecha;
	protected int tamaño;
	
	public FileComponent(String nombre, LocalDate fecha, int tamaño) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamaño = tamaño;
	}
	
	public abstract int getTamanio();
	
	public abstract FileComponent archivoMasGrande();
	
	public abstract FileComponent archivoMasNuevo();

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	
	
	
	
	
	
}
