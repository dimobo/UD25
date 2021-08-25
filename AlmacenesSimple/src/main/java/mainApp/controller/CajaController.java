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

import mainApp.dto.Caja;
import mainApp.services.CajaServiceImpl;

/**
 * 
 * @author dimobo
 *
 */

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;

	// List all
	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServiceImpl.listarCajas();
	}

	// List by id
	@GetMapping("cajas/{numReferencia}")
	public Caja cajaId(@PathVariable(name = "numReferencia") String numReferencia) {
		Caja cajaId = new Caja();
		cajaId = cajaServiceImpl.cajaID(numReferencia);
		System.out.println("Caja x ID: " + cajaId);
		return cajaId;
	}

	// Create
	@PostMapping("/cajas")
	public Caja crearCaja(@RequestBody Caja caja) {
		return cajaServiceImpl.crearCaja(caja);
	}

	// Update
	@PutMapping("/cajas/{numReferencia}")
	public Caja actualizarCaja(@PathVariable(name = "numReferencia") String numReferencia, @RequestBody Caja caja) {
		Caja cajaSeleccionada = new Caja(), cajaActualizada = new Caja();
		cajaSeleccionada = cajaServiceImpl.cajaID(numReferencia);
		cajaSeleccionada.setContenido(caja.getContenido());
		cajaSeleccionada.setValor(caja.getValor());
		cajaSeleccionada.setAlmacen(null);
		System.out.println("La caja actualizada es: " + cajaActualizada);
		return cajaActualizada;
	}

	// Delete
	@DeleteMapping("/cajas/{numReferencia}")
	public void eliminarCaja(@PathVariable(name = "numReferencia") String numReferencia) {
		cajaServiceImpl.eliminarCaja(numReferencia);
	}
}
