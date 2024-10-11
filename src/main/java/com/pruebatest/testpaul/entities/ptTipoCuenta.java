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
@Table(name = "ptTipoCuenta")
public class ptTipoCuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoCuenta;
	
	private String nombreTipoCuenta;
	
	public Long getIdTipoCuenta() {
		return idTipoCuenta;
	}
	
	public void setIdTipoCuenta(Long idTipoCuenta) {
		this.idTipoCuenta = idTipoCuenta;
	}
	
	public String getNombreTipoCuenta() {
		return nombreTipoCuenta;
	}
	
	public void setNombreTipoCuenta(String nombreTipoCuenta) {
		this.nombreTipoCuenta = nombreTipoCuenta;
	}
	
}
