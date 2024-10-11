																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.services;

import com.pruebatest.testpaul.repositories.ptTipoCuentaRepository;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptTipoCuenta;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ptTipoCuentaService {

	@Autowired
	ptTipoCuentaRepository repo;

	public List<ptTipoCuenta> getAll(){
		List<ptTipoCuenta> ptTipoCuentaList = repo.findAll();
		if(ptTipoCuentaList.size() > 0) {
			return ptTipoCuentaList;
		} else {
			return new ArrayList<ptTipoCuenta>();
		}
	}
     		
	public ptTipoCuenta findByIdTipoCuenta(Long idTipoCuenta) throws RecordNotFoundException{
		Optional<ptTipoCuenta> ptTipoCuenta = repo.findByIdTipoCuenta(idTipoCuenta);
		if(ptTipoCuenta.isPresent()) {
			return ptTipoCuenta.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public ptTipoCuenta createptTipoCuenta(ptTipoCuenta ptTipoCuenta){
		return repo.save(ptTipoCuenta);
	}

	public ptTipoCuenta updateptTipoCuenta(ptTipoCuenta ptTipoCuenta) throws RecordNotFoundException {
		Optional<ptTipoCuenta> ptTipoCuentaTemp = repo.findByIdTipoCuenta(ptTipoCuenta.getIdTipoCuenta());
	
		if(ptTipoCuentaTemp.isPresent()){
			return repo.save(ptTipoCuenta);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteptTipoCuentaByIdTipoCuenta(Long idTipoCuenta) throws RecordNotFoundException{
		Optional<ptTipoCuenta> ptTipoCuenta = repo.findByIdTipoCuenta(idTipoCuenta);
		if(ptTipoCuenta.isPresent()) {
		repo.deleteByIdTipoCuenta(idTipoCuenta);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
