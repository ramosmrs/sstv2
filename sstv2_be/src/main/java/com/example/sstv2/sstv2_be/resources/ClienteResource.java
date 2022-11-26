package com.example.sstv2.sstv2_be.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sstv2.sstv2_be.entities.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@GetMapping
	public ResponseEntity<Cliente> findAll(){
		Cliente c = new Cliente(1L, "marcio", "marcio.rsouza@gmail.com", "12345678900");
		return ResponseEntity.ok().body(c);
	}
}
