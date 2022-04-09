package ar.edu.unlp.info.oo2.Ejercicio3P3;

public class Connection4GAdapter implements Connection {
	private Connection4G adapter;
	
	public Connection4GAdapter(Connection4G adapter) {
		super();
		adapter = new Connection4G();
	}

	@Override
	public String sendData(String data, int crc) {
		// TODO Auto-generated method stub
		return adapter.transmit(data, crc);
	}

	@Override
	public String pict(String img) {
		// TODO Auto-generated method stub
		return adapter.symb();
	}

}
