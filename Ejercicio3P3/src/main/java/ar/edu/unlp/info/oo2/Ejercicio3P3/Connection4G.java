package ar.edu.unlp.info.oo2.Ejercicio3P3;

public class Connection4G {
	public String transmit(String data, int crc) {
		return data+ " "+ crc;
	}
	
	public String symb() {
		return "se ha conectado por 4g";
	}
}
