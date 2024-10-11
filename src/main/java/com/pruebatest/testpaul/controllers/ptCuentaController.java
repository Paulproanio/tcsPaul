																/*
 -------------------------------------------------------------------
| Test
| Author: Victor Paúl Proaño Abalco
| File Date: Tue Aug 06 21:08:13 ECT 2024
| 
 -------------------------------------------------------------------
																*/
package com.pruebatest.testpaul.controllers;

import com.pruebatest.testpaul.services.ptCuentaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.pruebatest.testpaul.RecordNotFoundException;
import com.pruebatest.testpaul.entities.ptCuenta;
import com.pruebatest.testpaul.entities.dto.ptCuentaReporteDto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.Date;
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
public class ptCuentaController {
	@Autowired
	ptCuentaService service;
	
	@GetMapping("/ptCuenta")
	public ResponseEntity<List<ptCuenta>> getAll() {
		List<ptCuenta> list = service.getAll();
		return new ResponseEntity<List<ptCuenta>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/ptCuenta/{id}")
	public ResponseEntity<ptCuenta> getptCuentaByNumeroCuenta(@PathVariable("id") Long numeroCuenta) throws RecordNotFoundException {
		ptCuenta entity = service.findByNumeroCuenta(numeroCuenta);
		return new ResponseEntity<ptCuenta>(entity, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/ptCuenta/reporte/{id}")
	public ResponseEntity<List<ptCuentaReporteDto>> getReporteEstadoCuenta(@PathVariable("id") String cedulaCliente, @RequestParam(required = true, name = "fechaInicial") Date fechaInicial,  @RequestParam(required = true, name = "fechaFinal") Date fechaFinal ) throws RecordNotFoundException, JsonProcessingException {
		List<ptCuentaReporteDto> entity = service.getReporteEstadoCuenta(cedulaCliente,fechaInicial,fechaFinal );
		return new ResponseEntity<List<ptCuentaReporteDto>>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/ptCuenta")
	public ResponseEntity<ptCuenta> createptCuenta(@RequestBody ptCuenta ptCuenta){
		service.createptCuenta(ptCuenta);
		return new ResponseEntity<ptCuenta>(ptCuenta, new HttpHeaders(), HttpStatus.CREATED);
	}

	@PutMapping("/ptCuenta")
	public ResponseEntity<ptCuenta> updateptCuenta(@RequestBody ptCuenta ptCuenta) throws RecordNotFoundException{
		service.updateptCuenta(ptCuenta);
		return new ResponseEntity<ptCuenta>(ptCuenta, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/ptCuenta/{id}")
	public HttpStatus deleteptCuentaByNumeroCuenta(@PathVariable("id") Long numeroCuenta) throws RecordNotFoundException {
		service.deleteptCuentaByNumeroCuenta(numeroCuenta);
		return HttpStatus.OK;
	}
}				
