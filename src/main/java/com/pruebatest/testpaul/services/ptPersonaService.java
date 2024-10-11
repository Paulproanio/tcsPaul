																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.services;

import com.pruebatest.testpaul.repositories.ptPersonaRepository;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptPersona;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ptPersonaService {

	@Autowired
	ptPersonaRepository repo;

	public List<ptPersona> getAll(){
		List<ptPersona> ptPersonaList = repo.findAll();
		if(ptPersonaList.size() > 0) {
			return ptPersonaList;
		} else {
			return new ArrayList<ptPersona>();
		}
	}
     		
	public ptPersona findByIdPersona(String identificacion) throws RecordNotFoundException{
		Optional<ptPersona> ptPersona = repo.findByIdentificacion(identificacion);
		if(ptPersona.isPresent()) {
			return ptPersona.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public ptPersona createptPersona(ptPersona ptPersona){
		return repo.save(ptPersona);
	}

	public ptPersona updateptPersona(ptPersona ptPersona) throws RecordNotFoundException {
		Optional<ptPersona> ptPersonaTemp = repo.findByIdentificacion(ptPersona.getIdentificacion());
	
		if(ptPersonaTemp.isPresent()){
			return repo.save(ptPersona);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteptPersonaByIdPersona(String identificacion) throws RecordNotFoundException{
		Optional<ptPersona> ptPersona = repo.findByIdentificacion(identificacion);
		if(ptPersona.isPresent()) {
		repo.deleteById(identificacion);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}