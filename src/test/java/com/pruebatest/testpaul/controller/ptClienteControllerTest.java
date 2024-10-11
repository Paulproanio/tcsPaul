package com.pruebatest.testpaul.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ptClienteControllerTest {
	
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void getAllClientesReturnEmptyList() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/tp/ptCliente",
				String.class)).isNotEmpty(); //.contains("[{}]")
		//.andExpect(jsonPath("$.numeroCuenta").value(expectedNumeroCuenta));
	}
}
