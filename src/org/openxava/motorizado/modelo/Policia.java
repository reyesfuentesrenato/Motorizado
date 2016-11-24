package org.openxava.motorizado.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Policia {

	@Id
	@Column(length = 6)
	private int idpolicia;

	@Column(length = 16)
	@Required
	private String nombre;

	@Column(length = 32)
	@Required
	private String apellido;

	@Column(length = 7)
	@Required
	private int cardex;

	@Column(length = 16)
	@Required
	private String grado;

	@Column(length = 16)
	@Required
	private String anteriord;

	@Column(length = 16)
	@Required
	private String nuevod;

	@Stereotype("TEXTO_GRANDE")
	private String observacion;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList
	private Grupo idgrupo;

	public int getIdpolicia() {
		return idpolicia;
	}

	public void setIdpolicia(int idpolicia) {
		this.idpolicia = idpolicia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCardex() {
		return cardex;
	}

	public void setCardex(int cardex) {
		this.cardex = cardex;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getAnteriord() {
		return anteriord;
	}

	public void setAnteriord(String anteriord) {
		this.anteriord = anteriord;
	}

	public String getNuevod() {
		return nuevod;
	}

	public void setNuevod(String nuevod) {
		this.nuevod = nuevod;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Grupo getIdgrupo() {
		return idgrupo;
	}

	public void setIdgrupo(Grupo idgrupo) {
		this.idgrupo = idgrupo;
	}

}
