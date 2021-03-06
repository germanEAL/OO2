package ar.edu.unlp.info.oo2.Ejercicio1P3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ToDoItem {
	
	private Estado e;
	LocalDateTime inicio;
	LocalDateTime fin;
	private String name;
	
	
	public LocalDateTime getInicio() {
		return inicio;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public String getName() {
		return name;
	}

	public Estado getEstado() {
		return e;
	}

	private ArrayList<String> comentarios;
	/**
	 * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	 */
	public ToDoItem(String name) {
		this.name=name;
		this.e= new Pending();
	}

	/**
	 * Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
	 * pending, si se encuentra en otro estado, no hace nada)
	 */
	public void cambiarEstado(Estado e) {
		this.e=e;
	}
	public void start() {
		e.start(this);
	}

	/**
	 * Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
	 * estado es paused. Caso contrario (pending o finished) genera un error
	 * informando la causa específica del mismo
	 */
	public void setInicio(LocalDateTime inicio) {
		this.inicio=inicio;
	}
	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public void togglePause() {
		e.togglePause(this);
	}

	/**
	 * Pasa el ToDoItem a finished (siempre y cuando su estado actual sea
	 * in-progress o pausada, si se encuentra en otro estado, no hace nada)
	 */
	public void finish() {
		e.finish(this);
	}

	/**
	 * Retorna el tiempo que transcurrió desde que se inició la tarea (start) hasta
	 * que se finalizó. En caso de que no esté finalizada, el tiempo que haya
	 * transcurrido hasta el momento actual. Si la tarea no se inició, genera un
	 * error informando la causa específica del mismo.
	 */
	public Duration workedTime() {
		return Duration.between(inicio, fin);
	}

	/**
	 * Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
	 * contrario no hace nada."
	 */
	public void addComment(String comment) {
		if(!(e instanceof Finished)) {
			comentarios.add(comment); 
		}
	}

}
