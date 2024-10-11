																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.services;

import com.pruebatest.testpaul.repositories.ptClienteRepository;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptCliente;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ptClienteService {

	@Autowired
	ptClienteRepository repo;
	
	

	public List<ptCliente> getAll(){
		List<ptCliente> ptClienteList = repo.findAll();
		if(ptClienteList.size() > 0) {
			return ptClienteList;
		} else {
			return new ArrayList<ptCliente>();
		}
	}
     		
	public ptCliente findByIdentificador(String identificador) throws RecordNotFoundException{
		Optional<ptCliente> ptCliente = repo.findByIdentificacion(identificador);
		if(ptCliente.isPresent()) {
			return ptCliente.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public ptCliente createptCliente(ptCliente ptCliente){
		return repo.save(ptCliente);
	}

	public ptCliente updateptCliente(ptCliente ptCliente) throws RecordNotFoundException {
		Optional<ptCliente> ptClienteTemp = repo.findByIdentificacion(ptCliente.getIdentificacion());
	
		if(ptClienteTemp.isPresent()){
			return repo.save(ptCliente);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteptClienteByIdentificador(String identificador) throws RecordNotFoundException{
		Optional<ptCliente> ptCliente = repo.findByIdentificacion(identificador);
		if(ptCliente.isPresent()) {
		repo.deleteByIdentificacion(identificador);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
