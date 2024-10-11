																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.controllers;

import com.pruebatest.testpaul.services.ptMovimientosService;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptMovimientos;
import com.pruebatest.testpaul.exception.ptCuentaException;

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
public class ptMovimientosController {
	@Autowired
	ptMovimientosService service;
	
	@GetMapping("/ptMovimientos")
	public ResponseEntity<List<ptMovimientos>> getAll() {
		List<ptMovimientos> list = service.getAll();
		return new ResponseEntity<List<ptMovimientos>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/ptMovimientos/{id}")
	public ResponseEntity<ptMovimientos> getptMovimientosByIdMovimiento(@PathVariable("id") Long idMovimiento) throws RecordNotFoundException {
		ptMovimientos entity = service.findByIdMovimiento(idMovimiento);
		return new ResponseEntity<ptMovimientos>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/ptMovimientos")
	public ResponseEntity<ptMovimientos> createptMovimientos(@RequestBody ptMovimientos ptMovimientos) throws ptCuentaException{
		service.createptMovimientos(ptMovimientos);
		return new ResponseEntity<ptMovimientos>(ptMovimientos, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/ptMovimientos")
	public ResponseEntity<ptMovimientos> updateptMovimientos(@RequestBody ptMovimientos ptMovimientos) throws RecordNotFoundException{
		service.updateptMovimientos(ptMovimientos);
		return new ResponseEntity<ptMovimientos>(ptMovimientos, new HttpHeaders(), HttpStatus.OK);
	}
	

	@DeleteMapping("/ptMovimientos/{id}")
	public HttpStatus deleteptMovimientosByIdMovimiento(@PathVariable("id") Long idMovimiento) throws RecordNotFoundException {
		service.deleteptMovimientosByIdMovimiento(idMovimiento);
		return HttpStatus.OK;
	}
}				
