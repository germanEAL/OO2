package ar.edu.unlp.info.oo2.Ejercicio1P3;

public class Finished implements Estado{

	@Override
	public void start(ToDoItem i) {
		
	}

	@Override
	public void togglePause(ToDoItem i) {
		throw new RuntimeException("El objeto ToDoItem ya se encuentra finalizado");
	}

	@Override
	public void finish(ToDoItem i) {
		throw new RuntimeException("El objeto ToDoItem ya se encuentra finalizado");
		
	}

}
