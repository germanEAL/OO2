package ar.edu.unlp.info.oo2.Ejercicio1P3;

import java.time.LocalDateTime;

public class Paused implements Estado {

	@Override
	public void start(ToDoItem i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void togglePause(ToDoItem i) {
		i.cambiarEstado((new InProgress()));		
	}

	@Override
	public void finish(ToDoItem i) {
		i.cambiarEstado(new Finished());
		i.setFin(LocalDateTime.now());
		
	}

}
