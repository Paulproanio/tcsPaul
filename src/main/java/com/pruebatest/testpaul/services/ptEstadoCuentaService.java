																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.services;

import com.pruebatest.testpaul.repositories.ptEstadoCuentaRepository;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptEstadoCuenta;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ptEstadoCuentaService {

	@Autowired
	ptEstadoCuentaRepository repo;

	public List<ptEstadoCuenta> getAll(){
		List<ptEstadoCuenta> ptEstadoCuentaList = repo.findAll();
		if(ptEstadoCuentaList.size() > 0) {
			return ptEstadoCuentaList;
		} else {
			return new ArrayList<ptEstadoCuenta>();
		}
	}
     		
	public ptEstadoCuenta findByIdEstadoCuenta(Long idEstadoCuenta) throws RecordNotFoundException{
		Optional<ptEstadoCuenta> ptEstadoCuenta = repo.findByIdEstadoCuenta(idEstadoCuenta);
		if(ptEstadoCuenta.isPresent()) {
			return ptEstadoCuenta.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public ptEstadoCuenta createptEstadoCuenta(ptEstadoCuenta ptEstadoCuenta){
		return repo.save(ptEstadoCuenta);
	}

	public ptEstadoCuenta updateptEstadoCuenta(ptEstadoCuenta ptEstadoCuenta) throws RecordNotFoundException {
		Optional<ptEstadoCuenta> ptEstadoCuentaTemp = repo.findByIdEstadoCuenta(ptEstadoCuenta.getIdEstadoCuenta());
	
		if(ptEstadoCuentaTemp.isPresent()){
			return repo.save(ptEstadoCuenta);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteptEstadoCuentaByIdEstadoCuenta(Long idEstadoCuenta) throws RecordNotFoundException{
		Optional<ptEstadoCuenta> ptEstadoCuenta = repo.findByIdEstadoCuenta(idEstadoCuenta);
		if(ptEstadoCuenta.isPresent()) {
		repo.deleteByIdEstadoCuenta(idEstadoCuenta);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
