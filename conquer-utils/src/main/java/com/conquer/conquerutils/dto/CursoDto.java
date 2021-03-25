package com.conquer.conquerutils.dto;

import com.conquer.conquerutils.enums.EnumTipoCurso;

import lombok.Data;

@Data
public class CursoDto {
	
	private String codigoCurso;

	private String nomeCurso;

	private String descricaoCurso;
	
	private Long cargaHoraria;
	
	private Double precoCurso;
	
//	private EnumTipoCurso tipoCurso;
}
