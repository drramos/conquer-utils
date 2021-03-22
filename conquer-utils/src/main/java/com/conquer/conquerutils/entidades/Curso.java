package com.conquer.conquerutils.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	private String nomeCurso;

	private String descricaoCurso;
	
	private Long cargaHoraria;
	
	private Double precoCurso;
	
//	@ManyToMany
//	@JoinColumn(name = "id_curso")
//	private Produto produto;
}
