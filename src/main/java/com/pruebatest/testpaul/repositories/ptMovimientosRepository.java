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

import com.pruebatest.testpaul.entities.ptMovimientos;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ptMovimientosRepository extends JpaRepository<ptMovimientos, Long> {

	Optional <ptMovimientos> findByIdMovimiento(Long idMovimiento);
	
	@Transactional
	void deleteByIdMovimiento(Long idMovimiento);
	
	@Query(value = "SELECT * FROM PT_MOVIMIENTOS INNER JOIN PT_CUENTA ON PT_MOVIMIENTOS.NUMERO_CUENTA = PT_CUENTA.NUMERO_CUENTA \r\n"
			+ " WHERE PT_CUENTA.IDENTIFICACION = ?1 AND PT_MOVIMIENTOS.FECHA_MOVIMIENTO BETWEEN ?2 AND ?3", nativeQuery = true)
	List <ptMovimientos> getReporteEstadoCuenta(String cedulaCliente, Date fechaInicial,Date fechaFinal);
}
