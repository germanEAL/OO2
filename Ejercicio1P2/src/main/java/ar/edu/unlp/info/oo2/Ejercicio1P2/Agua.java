package ar.edu.unlp.info.oo2.Ejercicio1P2;

public class Agua implements Topografia {

	public double getProporcion() {
		
		return 1;
	}
	
	public boolean calcularIgualdad(Topografia t) {
		return this.getProporcion()==t.getProporcion();
	}
}
