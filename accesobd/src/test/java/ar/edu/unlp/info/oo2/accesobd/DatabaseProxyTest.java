package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
	private DatabaseProxy proxy;
	private DatabaseAccess database;
	
	@BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy= new DatabaseProxy(database);
    }
	
	@Test
	void testNoAutenticado() {
        try{
        	assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        } catch (Exception e){
            assertEquals("No se ha autenticado en el servidor",e.getMessage());
        }
	}
	@Test
	void testAutenticado() {
        try{
        	proxy.autenticar();
        	assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        } catch (Exception e){
            assertEquals("No se ha autenticado en el servidor",e.getMessage());
        }
	}
}
