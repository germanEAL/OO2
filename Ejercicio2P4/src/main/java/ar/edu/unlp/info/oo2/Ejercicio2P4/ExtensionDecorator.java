package ar.edu.unlp.info.oo2.Ejercicio2P4;

public class ExtensionDecorator extends FileDecorator {
	public ExtensionDecorator(File concreteComponent) {
		super(concreteComponent);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint(){
		return super.prettyPrint(this.ConcreteComponent.getExtension());
	}
		
	
}
