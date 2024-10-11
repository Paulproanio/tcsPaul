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

import com.pruebatest.testpaul.entities.ptTipoCuenta;

import java.util.Optional;

@Repository
public interface ptTipoCuentaRepository extends JpaRepository<ptTipoCuenta, Long> {

	Optional <ptTipoCuenta> findByIdTipoCuenta(Long idTipoCuenta);
	
	@Transactional
	void deleteByIdTipoCuenta(Long idTipoCuenta);
	
}
