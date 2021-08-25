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
	@JoinColumn(name = "cajero")
	Caja caja;

	// Constructores.

	public Caja() {
	}

	public Caja(String numReferencia, String contenido, double valor, Caja caja) {
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.caja = caja;
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

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

}
