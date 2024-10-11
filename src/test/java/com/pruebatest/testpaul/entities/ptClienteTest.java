package com.pruebatest.testpaul.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ptClienteTest {

	ptCliente ptCliente = new ptCliente();

	@Test
	void validateSetIdentificacion() {
		String identificacionExpected = "1002712857";
		ptCliente.setIdentificacion("1002712857");
		Assertions.assertEquals(ptCliente.getIdentificacion(), identificacionExpected);
	}
	
	@Test
	void validateSetAge() {
		long edad = 25;
		ptCliente.setEdad(25L);
		Assertions.assertEquals(ptCliente.getEdad(), edad);
	}
}
