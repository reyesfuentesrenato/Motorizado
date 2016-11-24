package org.openxava.motorizado.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Grupo {

	@Id
	@Column(length = 6)
	private int idgrupo;

	@Column(length = 128)
	@Required
	private String nombre;

	@Stereotype("TEXTO_GRANDE")
	private String descripcion;

	public int getIdgrupo() {
		return idgrupo;
	}

	public void setIdgrupo(int idgrupo) {
		this.idgrupo = idgrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
