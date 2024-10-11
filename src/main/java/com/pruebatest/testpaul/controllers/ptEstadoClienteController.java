																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Wed Aug 07 21:35:57 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.controllers;

import com.pruebatest.testpaul.services.ptEstadoClienteService;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptEstadoCliente;

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
public class ptEstadoClienteController {
	@Autowired
	ptEstadoClienteService service;
	
	@GetMapping("/ptEstadoCliente")
	public ResponseEntity<List<ptEstadoCliente>> getAll() {
		List<ptEstadoCliente> list = service.getAll();
		return new ResponseEntity<List<ptEstadoCliente>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/ptEstadoCliente/{id}")
	public ResponseEntity<ptEstadoCliente> getptEstadoClienteByIdEstadoCliente(@PathVariable("id") Long idEstadoCliente) throws RecordNotFoundException {
		ptEstadoCliente entity = service.findByIdEstadoCliente(idEstadoCliente);
		return new ResponseEntity<ptEstadoCliente>(entity, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/ptEstadoCliente")
	public ResponseEntity<ptEstadoCliente> createptEstadoCliente(@RequestBody ptEstadoCliente ptEstadoCliente){
		service.createptEstadoCliente(ptEstadoCliente);
		return new ResponseEntity<ptEstadoCliente>(ptEstadoCliente, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/ptEstadoCliente")
	public ResponseEntity<ptEstadoCliente> updateptEstadoCliente(@RequestBody ptEstadoCliente ptEstadoCliente) throws RecordNotFoundException{
		service.updateptEstadoCliente(ptEstadoCliente);
		return new ResponseEntity<ptEstadoCliente>(ptEstadoCliente, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/ptEstadoCliente/{id}")
	public HttpStatus deleteptEstadoClienteByIdEstadoCliente(@PathVariable("id") Long idEstadoCliente) throws RecordNotFoundException {
		service.deleteptEstadoClienteByIdEstadoCliente(idEstadoCliente);
		return HttpStatus.OK;
	}
}				
