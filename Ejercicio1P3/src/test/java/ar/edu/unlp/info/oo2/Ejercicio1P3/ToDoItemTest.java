package ar.edu.unlp.info.oo2.Ejercicio1P3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.*;

public class ToDoItemTest {

	private ToDoItem item;
	
	@BeforeEach
	public void SetUp() {
		item = new ToDoItem("jorgito");
	}
	
	@Test
	void verNombre() {
		assertEquals("jorgito", item.getName());
	}
	
	@Test
	void inicio() {
		assertTrue(item.getEstado() instanceof Pending);
		item.start();
		assertTrue(item.getEstado() instanceof InProgress);
	}
	
	@Test
	void pausar() {
		item.start();
		assertTrue(item.getEstado() instanceof InProgress);
		item.togglePause();
		assertTrue(item.getEstado() instanceof Paused);
	}
}
