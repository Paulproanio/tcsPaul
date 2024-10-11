																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:12 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity(name = "ptPersona")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Table(name = "ptPersona")
public abstract class ptPersona {
	@Id
	//@GeneratedValue
	//private Long id;
	private String identificacion;
	private String nombre;
	private String genero;
	private Long edad;
	private String direccion;
	private String telefono;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
