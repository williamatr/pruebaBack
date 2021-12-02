package com.example.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.prueba.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
