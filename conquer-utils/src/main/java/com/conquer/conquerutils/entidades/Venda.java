package com.conquer.conquerutils.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.modelmapper.ModelMapper;

import com.conquer.conquerutils.dto.VendaDto;

import lombok.Data;

@Data
@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
	
	@ManyToMany
	@JoinColumn(name = "produto_id")
	private List<Produto> produto;
	
	private Double valorVenda;
	
	private Date dataVenda;
	
	public static Venda from(VendaDto vendaDto) {
		Venda venda = new Venda();
		
		ModelMapper modelMapper = new ModelMapper();
		venda = modelMapper.map(vendaDto, Venda.class);
		
		return venda;
	}
}
