																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.controllers;

import com.pruebatest.testpaul.services.ptTipoMovimientosService;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptTipoMovimientos;

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
public class ptTipoMovimientosController {
	@Autowired
	ptTipoMovimientosService service;
	
	@GetMapping("/ptTipoMovimientos")
	public ResponseEntity<List<ptTipoMovimientos>> getAll() {
		List<ptTipoMovimientos> list = service.getAll();
		return new ResponseEntity<List<ptTipoMovimientos>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/ptTipoMovimientos/{id}")
	public ResponseEntity<ptTipoMovimientos> getptTipoMovimientosByIdTipoMovimiento(@PathVariable("id") Long idTipoMovimiento) throws RecordNotFoundException {
		ptTipoMovimientos entity = service.findByIdTipoMovimiento(idTipoMovimiento);
		return new ResponseEntity<ptTipoMovimientos>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/ptTipoMovimientos")
	public ResponseEntity<ptTipoMovimientos> createptTipoMovimientos(@RequestBody ptTipoMovimientos ptTipoMovimientos){
		service.createptTipoMovimientos(ptTipoMovimientos);
		return new ResponseEntity<ptTipoMovimientos>(ptTipoMovimientos, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/ptTipoMovimientos")
	public ResponseEntity<ptTipoMovimientos> updateptTipoMovimientos(@RequestBody ptTipoMovimientos ptTipoMovimientos) throws RecordNotFoundException{
		service.updateptTipoMovimientos(ptTipoMovimientos);
		return new ResponseEntity<ptTipoMovimientos>(ptTipoMovimientos, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/ptTipoMovimientos/{id}")
	public HttpStatus deleteptTipoMovimientosByIdTipoMovimiento(@PathVariable("id") Long idTipoMovimiento) throws RecordNotFoundException {
		service.deleteptTipoMovimientosByIdTipoMovimiento(idTipoMovimiento);
		return HttpStatus.OK;
	}
}				
