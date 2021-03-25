package com.conquer.conquerutils.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TurmaDto {

	private String codigoTurma;
	
	private Long vagasDisponiveis;
	
	private Date dataInicio;
	
	private CursoDto curso;
	
}
