																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Wed Aug 07 21:35:57 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "ptEstadoCliente")
public class ptEstadoCliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstadoCliente;
	
	private String nombreEstadoCliente;
	
	public Long getIdEstadoCliente() {
		return idEstadoCliente;
	}
	
	public void setIdEstadoCliente(Long idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}
	
	public String getNombreEstadoCliente() {
		return nombreEstadoCliente;
	}
	
	public void setNombreEstadoCliente(String nombreEstadoCliente) {
		this.nombreEstadoCliente = nombreEstadoCliente;
	}
	
}
