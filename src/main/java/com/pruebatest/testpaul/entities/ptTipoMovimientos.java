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
@Table(name = "ptTipoMovimientos")
public class ptTipoMovimientos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoMovimiento;
	
	private String nombreTipoMovimiento;
	
	public Long getIdTipoMovimiento() {
		return idTipoMovimiento;
	}
	
	public void setIdTipoMovimiento(Long idTipoMovimiento) {
		this.idTipoMovimiento = idTipoMovimiento;
	}

	public String getNombreTipoMovimiento() {
		return nombreTipoMovimiento;
	}

	public void setNombreTipoMovimiento(String nombreTipoMovimiento) {
		this.nombreTipoMovimiento = nombreTipoMovimiento;
	}
}
