package ar.edu.unlp.info.oo2.Ejercicio2P4;

import java.time.LocalDate;

public class FileOO2 implements File{
    private String nombre;
    private String extension;
    private String permisos;
    private double tamaño;
    private LocalDate fechaCreacion;
    
    
	public FileOO2(String nombre, String extension, String permisos, double tamaño) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.permisos = permisos;
		this.tamaño = tamaño;
		this.fechaCreacion = LocalDate.now();
	}
	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return " ";
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.extension;
	}
	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.permisos;
	}
	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}
	@Override
	public double getTamaño() {
		// TODO Auto-generated method stub
		return this.tamaño;
	}
    
    
    
}
