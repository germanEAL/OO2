package ar.edu.unlp.info.oo2.Ejercicio1P2;

public class Tierra implements Topografia {

	public double getProporcion() {
		
		return 0;
	}
	
	public boolean calcularIgualdad(Topografia t) {
		return this.getProporcion()==t.getProporcion();
	}

}
