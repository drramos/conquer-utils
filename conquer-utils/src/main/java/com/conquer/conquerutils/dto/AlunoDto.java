package com.conquer.conquerutils.dto;

import java.util.List;

import com.conquer.conquerutils.entidades.Turma;

import lombok.Data;

@Data
public class AlunoDto {

	private String cpf;
	
	private String nome;
	
	private List<Turma> turma;
	
}
