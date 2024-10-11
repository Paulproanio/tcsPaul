package com.pruebatest.testpaul.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pruebatest.testpaul.entities.ptCliente;
import com.pruebatest.testpaul.repositories.ptClienteRepository;


@SpringBootTest
class ptClienteServiceTest {
	@Autowired
	ptClienteService ptClienteService;
	
	ptCliente ptCliente = new ptCliente();
	
	
	@Mock
    ptClienteRepository ptClienteRepository;

	
	@BeforeEach
	 void setUp() {
		
		ptCliente.setContraseniaCliente("123");
		ptCliente.setEstadoCliente(1L);
		ptCliente.setIdentificacion("2001478524");
		ptCliente.setNombre("maria");
		ptCliente.setGenero("sucre y cuba");
		ptCliente.setEdad(18L);
		ptCliente.setDireccion("sucre y cuba");
		ptCliente.setTelefono("0984567892");
		
		Mockito.when(this.ptClienteRepository.save(ptCliente)).thenReturn(ptCliente);

	}
	
	@Test
	 void validateClienteServiceCreate() 
	{
		ptCliente aaResp = new ptCliente();

	    String indent = "2001478524";
	    aaResp =   this.ptClienteService.createptCliente(ptCliente);
	    
	    Assertions.assertEquals(aaResp.getIdentificacion(), indent);	
	}
	
}
