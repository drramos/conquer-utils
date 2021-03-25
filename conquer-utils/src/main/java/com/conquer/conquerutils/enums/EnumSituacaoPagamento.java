package com.conquer.conquerutils.enums;

import java.lang.reflect.Field;

public enum EnumSituacaoPagamento {
	
	EM_ANALISE("Pagamento em Análise"),
	
	CONFIRMADO("Pagamento Confirmado"),
	
	NEGADO("Pagamento negado");
	
	private String descricao;
	
	private EnumSituacaoPagamento(String descricao) {
		try {
			Field field = this.getClass().getSuperclass().getDeclaredField("name");
			field.setAccessible(true);
			field.set(this, descricao);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
