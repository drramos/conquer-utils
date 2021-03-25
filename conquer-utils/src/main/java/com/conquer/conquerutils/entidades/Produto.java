package com.conquer.conquerutils.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigo_produto", unique = true)
	private String codigoProduto;
	
	private String nomeProduto;
	
//	@OneToMany(mappedBy = "produto")
	@ManyToMany
	private List<Curso> cursos;
	
	private boolean ativo;
}
