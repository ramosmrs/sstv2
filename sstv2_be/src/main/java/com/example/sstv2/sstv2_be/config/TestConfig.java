package com.example.sstv2.sstv2_be.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.sstv2.sstv2_be.entities.Cliente;
import com.example.sstv2.sstv2_be.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente(null, "Marcio", "21988554671", "marcio.rsouza@gmail.com", "12345678911", "abcd");
		Cliente c2 = new Cliente(null, "Adamanteus", "21988554671", "adamant@gmail.com", "45678912399", "efgh");
		Cliente c3 = new Cliente(null, "Juquinha", "21988554671", "juquinha@gmail.com", "98765432100", "ijkl");
		
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3));
		
	}
}