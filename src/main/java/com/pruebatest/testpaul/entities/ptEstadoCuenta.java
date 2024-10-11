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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "ptEstadoCuenta")
public class ptEstadoCuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstadoCuenta;
	
	private String nombreEstadoCuenta;
	
	public Long getIdEstadoCuenta() {
		return idEstadoCuenta;
	}
	
	public void setIdEstadoCuenta(Long idEstadoCuenta) {
		this.idEstadoCuenta = idEstadoCuenta;
	}
	
	public String getNombreEstadoCuenta() {
		return nombreEstadoCuenta;
	}
	
	public void setNombreEstadoCuenta(String nombreEstadoCuenta) {
		this.nombreEstadoCuenta = nombreEstadoCuenta;
	}
	
}
