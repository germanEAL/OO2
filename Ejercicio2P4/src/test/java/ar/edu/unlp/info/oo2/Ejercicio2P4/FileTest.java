package ar.edu.unlp.info.oo2.Ejercicio2P4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileTest {
	private FileOO2 file;
	
	@BeforeEach
	void setUp() {
		file= new FileOO2("archivito",".exe","usuario",64);
	}
	
	@Test
	void testOrden() {
		NombreDecorator nombreD = new NombreDecorator(file);
		TamañoDecorator tamañoD = new TamañoDecorator(nombreD);
		PermisosDecorator permisosD = new PermisosDecorator(tamañoD);
		assertEquals(" usuario - 64.0 - archivito - ",permisosD.prettyPrint());
	}
	
}
