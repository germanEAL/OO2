package ar.edu.unlp.info.oo2.Ejercicio1P3;


public interface Estado {
	
	public void start(ToDoItem i);
	public void togglePause(ToDoItem i);
	public void finish(ToDoItem i);
}
