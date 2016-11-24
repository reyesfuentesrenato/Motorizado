package org.openxava.motorizado.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Cliente {

	@Id
	@Column(length = 6)
	private int idcliente;

	@Column(length = 16)
	@Required
	private String nombre;

	@Column(length = 32)
	@Required
	private String apellido;

	@Column(length = 7)
	@Required
	private int ci;

	@Column(length = 32)
	@Required
	private String lugarnac;

	@Column(length = 8)
	@Required
	private String civil;

	@Column(length = 32)
	@Required
	private String ocupacion;

	@Stereotype("TEXTO_GRANDE")
	private String domicilio;

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
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

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getLugarnac() {
		return lugarnac;
	}

	public void setLugarnac(String lugarnac) {
		this.lugarnac = lugarnac;
	}

	public String getCivil() {
		return civil;
	}

	public void setCivil(String civil) {
		this.civil = civil;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

}
