package ar.edu.unlp.info.oo2.Ejercicio3P3;

public class WifiConnection implements Connection{

	@Override
	public String sendData(String data, int crc) {
		return data+" "+crc;
	}

	@Override
	public String pict(String img) {
		// TODO Auto-generated method stub
		return img;
	}

}
