package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author dimobo
 *
 */

@Entity
@Table(name = "almacenes")
public class Almacen {

	// Atributos de la clase.

	@Id
	private int id;

	@Column
	private String lugar;

	@Column
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Caja> numReferencia;

	// Constructores.

	public Almacen() {
	}

	public Almacen(int id, String lugar, int capacidad) {
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	// Getters y Setters.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

}
