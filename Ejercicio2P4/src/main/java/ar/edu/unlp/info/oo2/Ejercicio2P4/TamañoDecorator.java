package ar.edu.unlp.info.oo2.Ejercicio2P4;

public class TamañoDecorator extends FileDecorator{
	public TamañoDecorator(File concreteComponent) {
		super(concreteComponent);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint(){
		return super.prettyPrint( Double.toString(this.ConcreteComponent.getTamaño()));
	}
		
	
}
