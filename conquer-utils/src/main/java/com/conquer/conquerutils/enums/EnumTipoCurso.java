package com.conquer.conquerutils.enums;

import java.lang.reflect.Field;

import com.google.gson.annotations.SerializedName;

public enum EnumTipoCurso {

//	@SerializedName("Curso Digital")
	DIGITAL("Curso Digital"),
	
//	@SerializedName("Curso Presencial")
	PRESENCIAL("Curso Presencial");
	
	private String descricao;
	
	private EnumTipoCurso(String descricao) {
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
