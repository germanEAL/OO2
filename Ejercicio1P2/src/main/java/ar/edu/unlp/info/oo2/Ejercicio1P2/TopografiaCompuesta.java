package ar.edu.unlp.info.oo2.Ejercicio1P2;
import java.util.ArrayList;
public class TopografiaCompuesta implements Topografia {
	
	private ArrayList<Topografia> componentes;
	
	public TopografiaCompuesta() {
		componentes=new ArrayList<>();
	}
	
	public void agregarTopografia(Topografia elem) {
		if(componentes.size()<=4) {
			componentes.add(elem);
		}
	}
	
	public int getTamanio() {
		return this.componentes.size();
	}
		
	public double getProporcion() {
			return componentes.stream().mapToDouble(elem -> elem.getProporcion()).sum()/ getTamanio();
		}
		
	public boolean calcularIgualdad(Topografia elem) {
			return false;
		}
	
	public double totalProporciones() {
		return componentes.stream().mapToDouble(elem -> elem.getProporcion()).sum();
	}
	}

