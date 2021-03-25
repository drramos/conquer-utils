package com.conquer.conquerutils.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.ManyToAny;

import com.conquer.conquerutils.enums.EnumTipoCurso;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	@Column(name = "codigo_curso", unique = true)
	private String codigoCurso;
	
	private String nomeCurso;

	private String descricaoCurso;
	
	private Long cargaHoraria;
	
	private Double precoCurso;
	
	@Enumerated(EnumType.STRING)
	private EnumTipoCurso tipoCurso;
	
//	@ManyToMany
//	@JoinColumn(name = "id_curso")
//	private Produto produto;
}
