package ar.edu.unlp.info.oo2.Ejercicio3P2;

import java.time.LocalDate;

public class Archivo extends FileComponent{
	
	public Archivo(String nombre, LocalDate fecha, int tamaño) {
		super(nombre,fecha,tamaño);
	}
	
	public int getTamanio() {
		return this.tamaño;
	}

	@Override
	public FileComponent archivoMasGrande() {
		return this;
	}

	@Override
	public FileComponent archivoMasNuevo() {
		return this;
	}
	
	
	
	
}
