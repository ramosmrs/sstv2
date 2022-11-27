package com.example.sstv2.sstv2_be.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sstv2.sstv2_be.entities.Cliente;
import com.example.sstv2.sstv2_be.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}
	
	public Cliente findByID(Long id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.get();
	}
	
}
