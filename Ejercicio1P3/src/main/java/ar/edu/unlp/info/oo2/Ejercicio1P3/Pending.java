package ar.edu.unlp.info.oo2.Ejercicio1P3;

import java.time.LocalDateTime;

public class Pending implements Estado {

	@Override
	public void start(ToDoItem i) {
		i.cambiarEstado((new InProgress()));
		i.setInicio(LocalDateTime.now());
		
	}

	@Override
	public void togglePause(ToDoItem i) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra iniciado");
	}

	@Override
	public void finish(ToDoItem i) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra iniciado");
		
	}
	
}
