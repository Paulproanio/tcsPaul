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
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebatest.testpaul.entities.ptEstadoCuenta;

import java.util.Optional;

@Repository
public interface ptEstadoCuentaRepository extends JpaRepository<ptEstadoCuenta, Long> {

	Optional <ptEstadoCuenta> findByIdEstadoCuenta(Long idEstadoCuenta);
	
	@Transactional
	void deleteByIdEstadoCuenta(Long idEstadoCuenta);
	
}
