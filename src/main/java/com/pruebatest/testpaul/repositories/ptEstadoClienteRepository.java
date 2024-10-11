																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Wed Aug 07 21:35:57 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebatest.testpaul.entities.ptEstadoCliente;

import java.util.Optional;

@Repository
public interface ptEstadoClienteRepository extends JpaRepository<ptEstadoCliente, Long> {

	Optional <ptEstadoCliente> findByIdEstadoCliente(Long idEstadoCliente);
	
	@Transactional
	void deleteByIdEstadoCliente(Long idEstadoCliente);
	
}
