package ar.edu.unlp.info.oo2.Ejercicio1P2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	private TopografiaCompuesta tmC;
	private TopografiaCompuesta tmD;

    @BeforeEach
    public void setUp(){
    	tmD = new TopografiaCompuesta();
        tmC = new TopografiaCompuesta();
        this.tmC.agregarTopografia(new Agua());
        this.tmC.agregarTopografia(new Tierra());
        this.tmC.agregarTopografia(new Agua());
        this.tmC.agregarTopografia(new Tierra());
        
        this.tmD.agregarTopografia(new Agua());
        this.tmD.agregarTopografia(new Tierra());
        this.tmD.agregarTopografia(new Agua());
        this.tmD.agregarTopografia(this.tmC);
        //tmD = new TopografiaMixta();
    }

    @Test
    public void topografiaTest(){
        //assertEquals(this.tmC.getProporcion(), 0d);

        //topografia mixta ejemplo c
        assertEquals(this.tmC.getProporcion(), 0.5d);
 
        
        //topografia mixta ejemplo d
    }
    @Test
    public void topografiaDTest() {
        assertEquals(this.tmD.getProporcion(), 0.625d);

	}
}
