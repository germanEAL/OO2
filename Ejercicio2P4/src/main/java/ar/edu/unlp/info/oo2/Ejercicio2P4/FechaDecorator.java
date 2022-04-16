package ar.edu.unlp.info.oo2.Ejercicio2P4;

public class FechaDecorator extends FileDecorator {
	public FechaDecorator(File concreteComponent) {
		super(concreteComponent);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint(){
		return super.prettyPrint( this.ConcreteComponent.getFechaCreacion().toString());
	}
		
}
