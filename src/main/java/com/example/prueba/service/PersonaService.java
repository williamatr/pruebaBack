package com.example.prueba.service;

import com.example.prueba.model.Persona;
import com.example.prueba.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	public List<Persona> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Persona getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Persona> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return personaRepository.findAll(pageable);
	}

	public <S extends Persona> S save(S entity) {
		// TODO Auto-generated method stub		
		return personaRepository.save(entity);
	}

	public Optional<Persona> findById(Long id) {
		// TODO Auto-generated method stub
		return personaRepository.findById(id);
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		personaRepository.deleteById(id);
	}

	public void delete(Persona entity) {
		// TODO Auto-generated method stub
		personaRepository.delete(entity);
	}
	
}
