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
	
@Entity
@Table(name = "ptCuenta")
public class ptCuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroCuenta;
	
	private Float saldoInicial;
	@ManyToOne
	@JoinColumn(name = "idEstadoCuenta")
	private ptEstadoCuenta ptEstadoCuenta;
	
	@ManyToOne
	@JoinColumn(name = "idTipoCuenta")
	private ptTipoCuenta ptTipoCuenta;
	
	@ManyToOne
	@JoinColumn(name = "identificacion")
	public ptCliente ptCliente;
	
	public Long getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(Long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public Float getSaldoInicial() {
		return saldoInicial;
	}
	
	public void setSaldoInicial(Float saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public ptEstadoCuenta getPtEstadoCuenta() {
		return ptEstadoCuenta;
	}

	public void setPtEstadoCuenta(ptEstadoCuenta ptEstadoCuenta) {
		this.ptEstadoCuenta = ptEstadoCuenta;
	}

	public ptTipoCuenta getPtTipoCuenta() {
		return ptTipoCuenta;
	}

	public void setPtTipoCuenta(ptTipoCuenta ptTipoCuenta) {
		this.ptTipoCuenta = ptTipoCuenta;
	}

	public ptCliente getPtCliente() {
		return ptCliente;
	}

	public void setPtCliente(ptCliente ptCliente) {
		this.ptCliente = ptCliente;
	}


	
}
