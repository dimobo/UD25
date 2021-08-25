package mainApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author dimobo
 *
 */

@Entity
@Table(name = "cajas")
public class Caja {

	// Atributos de la clase.

	@Id
	private String numReferencia;

	@Column
	private String contenido;

	@Column
	private double valor;

	@ManyToOne
	@JoinColumn(name = "almacen")
	Almacen almacen;

	// Constructores.

	public Caja() {
	}

	public Caja(String numReferencia, String contenido, double valor, Almacen almacen) {
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	// Getters y Setters.

	public String getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

}
