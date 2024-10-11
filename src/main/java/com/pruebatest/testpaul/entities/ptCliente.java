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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
//@Table(name = "ptCliente")
//@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
public class ptCliente extends ptPersona{
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long idCliente;
	
	private String contraseniaCliente;
	private Long estadoCliente;
	
	public String getContraseniaCliente() {
		return contraseniaCliente;
	}
	
	public void setContraseniaCliente(String contraseniaCliente) {
		this.contraseniaCliente = contraseniaCliente;
	}
	
	public Long getEstadoCliente() {
		return estadoCliente;
	}
	
	public void setEstadoCliente(Long estadoCliente) {
		this.estadoCliente = estadoCliente;
	}
	
}
