package ar.edu.unlp.info.oo2.Ejercicio1P3;


import java.time.LocalDateTime;

public class InProgress implements Estado {

	@Override
	public void start(ToDoItem i) {
	}

	@Override
	public void togglePause(ToDoItem i) {
	i.cambiarEstado(new Paused());;
	}

	@Override
	public void finish(ToDoItem i) {
		i.cambiarEstado(new Finished());
		i.setFin(LocalDateTime.now());
	}


}
