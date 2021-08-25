package mainApp.services;

import java.util.List;

import mainApp.dto.Almacen;

/**
 * 
 * @author dimobo
 *
 */

public interface IAlmacenService {

	// Metodos del CRUD
	public List<Almacen> listarAlmacenes(); // List all

	public Almacen almacenID(int id); // List by id

	public Almacen crearAlmacen(Almacen caja); // Create

	public Almacen actualizarAlmacen(Almacen caja); // Update

	public void eliminarAlmacen(int id); // Delete

}
