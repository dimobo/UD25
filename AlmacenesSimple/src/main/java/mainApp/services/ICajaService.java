package mainApp.services;

import java.util.List;

import mainApp.dto.Caja;

/**
 * 
 * @author dimobo
 *
 */

public interface ICajaService {

	// Metodos del CRUD
	public List<Caja> listarCajas(); // List all

	public Caja cajaID(String numReferencia); // List by id

	public Caja crearCaja(Caja caja); // Create

	public Caja actualizarCaja(Caja caja); // Update

	public void eliminarCaja(String numReferencia); // Delete

}
