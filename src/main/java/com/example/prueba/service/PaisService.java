package com.example.prueba.service;

import com.example.prueba.model.Pais;
import com.example.prueba.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService{
	
	@Autowired
	private PaisRepository paisRepository;

	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return paisRepository.findAll();
	}
	
}
