package com.example.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.prueba.model.Pais;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
