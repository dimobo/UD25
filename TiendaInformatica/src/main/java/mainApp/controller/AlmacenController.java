package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Almacen;
import mainApp.services.AlmacenServiceImpl;

/**
 * 
 * @author dimobo
 *
 */

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;

	// List all
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes() {
		return almacenServiceImpl.listarAlmacenes();
	}

	// List by id
	@GetMapping("almacenes/{id}")
	public Almacen almacenId(@PathVariable(name = "id") int id) {
		Almacen almacenId = new Almacen();
		almacenId = almacenServiceImpl.almacenID(id);
		System.out.println("Almacen x ID: " + almacenId);
		return almacenId;
	}

	// Create
	@PostMapping("/Almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.crearAlmacen(almacen);
	}

	// Update
	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name = "id") int id, @RequestBody Almacen almacen) {
		Almacen almacenSeleccionado = new Almacen(), almacenActualizado = new Almacen();
		almacenSeleccionado = almacenServiceImpl.almacenID(id);
		almacenSeleccionado.setCapacidad(almacen.getCapacidad());
		almacenSeleccionado.setLugar(almacen.getLugar());
		almacenActualizado = almacenServiceImpl.actualizarAlmacen(almacenSeleccionado);
		System.out.println("El almacen actualizado es: " + almacenActualizado);
		return almacenActualizado;
	}

	// Delete
	@DeleteMapping("/almacen/{id}")
	public void eliminarAlmacen(@PathVariable(name = "id") int id) {
		almacenServiceImpl.eliminarAlmacen(id);
	}

}
