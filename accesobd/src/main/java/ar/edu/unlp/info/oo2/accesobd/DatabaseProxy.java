package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
	private DatabaseAccess realDatabase;
	private boolean autenticador = false;
	
	public DatabaseProxy(DatabaseAccess realDatabase) {
		super();
		this.realDatabase = realDatabase;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!this.verificarAutenticacion()) {
			throw new RuntimeException("No se ha autenticado en el servidor");
		}
		return realDatabase.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(!this.verificarAutenticacion()) {
			throw new RuntimeException("No se ha autenticado en el servidor");
		}
		return realDatabase.insertNewRow(rowData);
	}
	
	public void autenticar() {
		this.autenticador=true;
	}
	
	public boolean verificarAutenticacion() {
		return autenticador;
	}
}
