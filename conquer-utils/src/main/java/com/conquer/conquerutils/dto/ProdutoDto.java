package com.conquer.conquerutils.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProdutoDto {

	
	private String codigoProduto;
	
	private String nomeProduto;
	
	private List<CursoDto> cursos;
	
	private boolean ativo;
}
