package ar.edu.unlp.info.oo2.Ejercicio3P3;

import java.util.zip.CRC32;

public class Crc32Calculator implements CrcCalculator {

	@Override
	public int crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		Long result = crc.getValue();
		return result.intValue();
	}

}
