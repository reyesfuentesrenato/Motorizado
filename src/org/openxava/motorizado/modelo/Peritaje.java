package org.openxava.motorizado.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Peritaje {

	@Id
	@Column(length = 6)
	private int idperitaje;

	@Column(length = 16)
	@Required
	private String estadomotor;

	@Column(length = 16)
	@Required
	private String estadochasis;

	@Column(length = 16)
	@Required
	private String estadoplaqueta;

	@Column(length = 32)
	@Required
	private String motor;

	@Column(length = 32)
	@Required
	private String chasis;

	@Column(length = 16)
	@Required
	private String placa;

	@Column(length = 4)
	@Required
	private int anio;

	@Column(length = 16)
	@Required
	private String color;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList
	private Policia idpolicia;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList
	private Cliente idcliente;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList
	private Establecimiento idestablecimiento;

	public int getIdperitaje() {
		return idperitaje;
	}

	public void setIdperitaje(int idperitaje) {
		this.idperitaje = idperitaje;
	}

	public String getEstadomotor() {
		return estadomotor;
	}

	public void setEstadomotor(String estadomotor) {
		this.estadomotor = estadomotor;
	}

	public String getEstadochasis() {
		return estadochasis;
	}

	public void setEstadochasis(String estadochasis) {
		this.estadochasis = estadochasis;
	}

	public String getEstadoplaqueta() {
		return estadoplaqueta;
	}

	public void setEstadoplaqueta(String estadoplaqueta) {
		this.estadoplaqueta = estadoplaqueta;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Policia getIdpolicia() {
		return idpolicia;
	}

	public void setIdpolicia(Policia idpolicia) {
		this.idpolicia = idpolicia;
	}

	public Cliente getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Cliente idcliente) {
		this.idcliente = idcliente;
	}

	public Establecimiento getIdestablecimiento() {
		return idestablecimiento;
	}

	public void setIdestablecimiento(Establecimiento idestablecimiento) {
		this.idestablecimiento = idestablecimiento;
	}

}
