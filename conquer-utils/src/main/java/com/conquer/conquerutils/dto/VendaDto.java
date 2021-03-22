package com.conquer.conquerutils.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class VendaDto {

	private AlunoDto aluno;
	
	private Double valorVenda;
	
	private List<ProdutoDto> produtos;
	
	private Date dataVenda;
}
