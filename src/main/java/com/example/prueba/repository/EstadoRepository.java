package com.example.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.prueba.model.Estado;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
