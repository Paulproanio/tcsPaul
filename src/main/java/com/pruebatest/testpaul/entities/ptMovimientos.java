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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Date;
import javax.persistence.Basic;
	
@Entity
@Table(name = "ptMovimientos")
public class ptMovimientos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMovimiento;
	
	@Basic
	private Date fechaMovimiento;
	private Float valorMovimiento;
	private Float saldoMovimiento;
	private Long idTipoMovimiento;
	
	@ManyToOne
	@JoinColumn(name = "numeroCuenta")
	public ptCuenta ptCuenta;
	
	public Long getIdMovimiento() {
		return idMovimiento;
	}
	
	public void setIdMovimiento(Long idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	
	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	
	public Float getValorMovimiento() {
		return valorMovimiento;
	}
	
	public void setValorMovimiento(Float valorMovimiento) {
		this.valorMovimiento = valorMovimiento;
	}
	
	public Float getSaldoMovimiento() {
		return saldoMovimiento;
	}
	
	public void setSaldoMovimiento(Float saldoMovimiento) {
		this.saldoMovimiento = saldoMovimiento;
	}
	
	public Long getIdTipoMovimiento() {
		return idTipoMovimiento;
	}
	
	public void setIdTipoMovimiento(Long idTipoMovimiento) {
		this.idTipoMovimiento = idTipoMovimiento;
	}

	public ptCuenta getPtCuenta() {
		return ptCuenta;
	}

	public void setPtCuenta(ptCuenta ptCuenta) {
		this.ptCuenta = ptCuenta;
	}

	@Override
	public String toString() {
		return "ptMovimientos [idMovimiento=" + idMovimiento + ", fechaMovimiento=" + fechaMovimiento
				+ ", valorMovimiento=" + valorMovimiento + ", saldoMovimiento=" + saldoMovimiento
				+ ", idTipoMovimiento=" + idTipoMovimiento + ", ptCuenta=" + ptCuenta + "]";
	}
	
	
}
