																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.controllers;

import com.pruebatest.testpaul.services.ptTipoCuentaService;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptTipoCuenta;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;	
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
@RequestMapping("/api/tp")
public class ptTipoCuentaController {
	@Autowired
	ptTipoCuentaService service;
	
	@GetMapping("/ptTipoCuenta")
	public ResponseEntity<List<ptTipoCuenta>> getAll() {
		List<ptTipoCuenta> list = service.getAll();
		return new ResponseEntity<List<ptTipoCuenta>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/ptTipoCuenta/{id}")
	public ResponseEntity<ptTipoCuenta> getptTipoCuentaByIdTipoCuenta(@PathVariable("id") Long idTipoCuenta) throws RecordNotFoundException {
		ptTipoCuenta entity = service.findByIdTipoCuenta(idTipoCuenta);
		return new ResponseEntity<ptTipoCuenta>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/ptTipoCuenta")
	public ResponseEntity<ptTipoCuenta> createptTipoCuenta(@RequestBody ptTipoCuenta ptTipoCuenta){
		service.createptTipoCuenta(ptTipoCuenta);
		return new ResponseEntity<ptTipoCuenta>(ptTipoCuenta, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/ptTipoCuenta")
	public ResponseEntity<ptTipoCuenta> updateptTipoCuenta(@RequestBody ptTipoCuenta ptTipoCuenta) throws RecordNotFoundException{
		service.updateptTipoCuenta(ptTipoCuenta);
		return new ResponseEntity<ptTipoCuenta>(ptTipoCuenta, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/ptTipoCuenta/{id}")
	public HttpStatus deleteptTipoCuentaByIdTipoCuenta(@PathVariable("id") Long idTipoCuenta) throws RecordNotFoundException {
		service.deleteptTipoCuentaByIdTipoCuenta(idTipoCuenta);
		return HttpStatus.OK;
	}
}				
