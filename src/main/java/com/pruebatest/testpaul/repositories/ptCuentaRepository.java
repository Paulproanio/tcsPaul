																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.pruebatest.testpaul.entities.ptCuenta;
import com.pruebatest.testpaul.entities.dto.ptCuentaReporteDto;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ptCuentaRepository extends JpaRepository<ptCuenta, Long> {

	Optional <ptCuenta> findByNumeroCuenta(Long numeroCuenta);
	
	@Transactional
	void deleteByNumeroCuenta(Long numeroCuenta);
	
	/*@Query(value = "SELECT PT_MOVIMIENTOS.FECHA_MOVIMIENTO AS fecha, PT_CLIENTE.NOMBRE , PT_CUENTA.NUMERO_CUENTA, PT_TIPO_CUENTA.NOMBRE_TIPO_CUENTA , PT_CUENTA.SALDO_INICIAL, PT_ESTADO_CUENTA.NOMBRE_ESTADO_CUENTA, PT_MOVIMIENTOS.VALOR_MOVIMIENTO, PT_MOVIMIENTOS.SALDO_MOVIMIENTO\r\n"
			+ "FROM PT_CUENTA INNER JOIN PT_MOVIMIENTOS \r\n"
			+ "ON PT_MOVIMIENTOS.NUMERO_CUENTA = PT_CUENTA.NUMERO_CUENTA INNER JOIN PT_CLIENTE \r\n"
			+ "ON PT_CLIENTE.IDENTIFICACION = PT_CUENTA.IDENTIFICACION INNER JOIN PT_TIPO_CUENTA \r\n"
			+ "ON PT_TIPO_CUENTA.ID_TIPO_CUENTA = PT_CUENTA.ID_TIPO_CUENTA INNER JOIN PT_ESTADO_CUENTA \r\n"
			+ "ON PT_ESTADO_CUENTA.ID_ESTADO_CUENTA = PT_CUENTA.ID_ESTADO_CUENTA\r\n"
			+ "WHERE PT_CUENTA.IDENTIFICACION = ?1 AND FECHA_MOVIMIENTO BETWEEN ?2 AND ?3 ", nativeQuery = true)
	List <ptCuenta> getReporteEstadoCuenta(String cedulaCliente, Date fechaInicial,Date fechaFinal);*/
	
}
