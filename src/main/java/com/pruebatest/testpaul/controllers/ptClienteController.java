																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.controllers;

import com.pruebatest.testpaul.services.ptClienteService;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptCliente;

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
public class ptClienteController {
	@Autowired
	ptClienteService service;
	
	@GetMapping("/ptCliente")
	public ResponseEntity<List<ptCliente>> getAll() {
		List<ptCliente> list = service.getAll();
		return new ResponseEntity<List<ptCliente>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/ptCliente/{id}")
	public ResponseEntity<ptCliente> getptClienteByIdCliente(@PathVariable("id") String identificador) throws RecordNotFoundException {
		ptCliente entity = service.findByIdentificador(identificador);
		return new ResponseEntity<ptCliente>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/ptCliente")
	public ResponseEntity<ptCliente> createptCliente(@RequestBody ptCliente ptCliente){
		service.createptCliente(ptCliente);
		return new ResponseEntity<ptCliente>(ptCliente, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/ptCliente")
	public ResponseEntity<ptCliente> updateptCliente(@RequestBody ptCliente ptCliente) throws RecordNotFoundException{
		service.updateptCliente(ptCliente);
		return new ResponseEntity<ptCliente>(ptCliente, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/ptCliente/{id}")
	public HttpStatus deleteptClienteByIdCliente(@PathVariable("id") String identificador) throws RecordNotFoundException {
		service.deleteptClienteByIdentificador(identificador);
		return HttpStatus.OK;
	}
}				
