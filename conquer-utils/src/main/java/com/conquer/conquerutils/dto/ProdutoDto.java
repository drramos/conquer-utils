package com.conquer.conquerutils.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProdutoDto {

	private String nomeProduto;
	
	private List<CursoDto> cursos;
}
