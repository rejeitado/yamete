package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Igor");
		cliente1.setTelefone("83 99886-1178");
		cliente1.setEmail("igorfigueiredo@alu.uern.br");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("João");
		cliente2.setTelefone("84 99544-5520");
		cliente2.setEmail("joao@alu.uern.br");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
