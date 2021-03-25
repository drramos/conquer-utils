package com.conquer.conquerutils.dto;

import java.util.Date;

import com.conquer.conquerutils.enums.EnumSituacaoMatricula;

import lombok.Data;

@Data
public class MatriculaDto {
	
	private AlunoDto aluno;
	
	private TurmaDto turma;
	
	private CursoDto curso;
	
	private Date dataMatricula;
	
	private String codigoMatricula;
	
	private EnumSituacaoMatricula situacaoMatricula;
	
	private VendaDto vendaDto;
	
}
