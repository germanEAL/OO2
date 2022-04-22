package ar.edu.unlp.info.oo2.Ejercicio2P4;

import java.time.LocalDate;

public abstract class FileDecorator implements File{
	
	protected File ConcreteComponent;

	public FileDecorator(File concreteComponent) {
		super();
		this.ConcreteComponent = concreteComponent;
	}
	
	public String prettyPrint(String print) {
		return print + "-" + this.ConcreteComponent.prettyPrint(); 
	}
	public String getNombre() {
		return this.ConcreteComponent.getNombre();
		}
	public String getExtension() {
		return this.ConcreteComponent.getExtension();
	}
	public String getPermisos() {
		return this.ConcreteComponent.getPermisos();
	}
	public LocalDate getFechaCreacion() {
		return this.ConcreteComponent.getFechaCreacion();
	}
	public double getTamaño() {
		return this.ConcreteComponent.getTamaño();
	}
}
