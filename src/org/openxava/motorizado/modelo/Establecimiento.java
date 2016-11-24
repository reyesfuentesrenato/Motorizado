package org.openxava.motorizado.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Establecimiento {

	@Id
	@Column(length = 6)
	private int idestablecimiento;

	@Column(length = 32)
	@Required
	private String nombre;

	@Column(length = 16)
	@Required
	private String ciudad;

	@Stereotype("TEXTO_GRANDE")
	private String direccion;

	public int getIdestablecimiento() {
		return idestablecimiento;
	}

	public void setIdestablecimiento(int idestablecimiento) {
		this.idestablecimiento = idestablecimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
