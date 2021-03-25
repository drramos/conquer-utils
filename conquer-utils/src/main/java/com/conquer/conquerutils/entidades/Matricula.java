package com.conquer.conquerutils.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.conquer.conquerutils.dto.VendaDto;
import com.conquer.conquerutils.enums.EnumSituacaoMatricula;

import lombok.Data;

@Data
@Entity
@Table(
		name = "matricula",
		uniqueConstraints =
		@UniqueConstraint(columnNames = {"aluno_id", "curso_id"})
		)
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;

//	@ColumnDefault(value = "")
//	@Column(name = "codigo_turma", nullable = false, columnDefinition = "")
	@ManyToOne
	@JoinColumn(name = "turma_id")
	private Turma turma;
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;
	
	private Date dataMatricula;
	
	@Column(name = "codigo_matricula", unique = true)
	private String codigoMatricula;
	
	@Enumerated(EnumType.STRING)
	private EnumSituacaoMatricula situacaoMatricula;
	
	@ManyToOne
	@JoinColumn(name = "venda")
	private Venda venda;
	
}
