package ar.edu.unlp.info.oo2.Ejercicio3P2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Directorio extends FileComponent {
	
	private ArrayList<FileComponent> archivos;

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
		archivos= new ArrayList<>();
	}
	
	public void agregar(FileComponent a) {
		archivos.add(a);
	}


	@Override
	public FileComponent archivoMasGrande() {
		return archivos.stream().max(Comparator.comparing(FileComponent::getTamanio)).orElse(null);
	}

	@Override
	public FileComponent archivoMasNuevo() {
	return archivos.stream().max(Comparator.comparing(FileComponent::getFecha)).orElse(null);
	}
	
	public int getTamanio(){
		return this.tamanoTotalOcupado();
	}
	public int tamanoTotalOcupado() {
		return archivos.stream().mapToInt(arch -> arch.getTamanio()).sum() + this.tamaño;
	}
	
	

}
