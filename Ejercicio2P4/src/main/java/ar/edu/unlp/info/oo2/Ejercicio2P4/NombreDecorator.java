package ar.edu.unlp.info.oo2.Ejercicio2P4;

public class NombreDecorator extends FileDecorator{

	public NombreDecorator(File concreteComponent) {
		super(concreteComponent);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint(){
		return super.prettyPrint(this.ConcreteComponent.getNombre());
	}
		
	
}
