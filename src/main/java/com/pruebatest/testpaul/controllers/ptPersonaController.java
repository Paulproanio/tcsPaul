																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.controllers;

import com.pruebatest.testpaul.services.ptPersonaService;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptPersona;

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
public class ptPersonaController {
	@Autowired
	ptPersonaService service;
	
	@GetMapping("/ptPersona")
	public ResponseEntity<List<ptPersona>> getAll() {
		List<ptPersona> list = service.getAll();
		return new ResponseEntity<List<ptPersona>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/ptPersona/{id}")
	public ResponseEntity<ptPersona> getptPersonaById(@PathVariable("id") String identificacion) throws RecordNotFoundException {
		ptPersona entity = service.findByIdPersona(identificacion);
		return new ResponseEntity<ptPersona>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/ptPersona")
	public ResponseEntity<ptPersona> createptPersona(@RequestBody ptPersona ptPersona){
		service.createptPersona(ptPersona);
		return new ResponseEntity<ptPersona>(ptPersona, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/ptPersona")
	public ResponseEntity<ptPersona> updateptPersona(@RequestBody ptPersona ptPersona) throws RecordNotFoundException{
		service.updateptPersona(ptPersona);
		return new ResponseEntity<ptPersona>(ptPersona, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/ptPersona/{id}")
	public HttpStatus deleteptPersonaById(@PathVariable("id") String identificacion) throws RecordNotFoundException {
		service.deleteptPersonaByIdPersona(identificacion);
		return HttpStatus.OK;
	}
}				
