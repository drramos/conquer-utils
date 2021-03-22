package com.conquer.conquerutils.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codigoTurma;
	
	private Long vagasDisponiveis;
	
	private Date dataInicio;
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;
	
}
