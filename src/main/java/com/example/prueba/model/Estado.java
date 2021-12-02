package com.example.prueba.model;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax. persistence.Table;

import com.example.prueba.repository.EstadoRepository;

@Entity
@Data
@Table (name="estado")
public class Estado implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	
	@ManyToOne
	@JoinColumn (name = "id_pais")
	private Pais pais;

}
