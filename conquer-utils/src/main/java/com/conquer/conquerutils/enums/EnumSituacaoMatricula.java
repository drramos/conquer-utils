package com.conquer.conquerutils.enums;

import java.lang.reflect.Field;

public enum EnumSituacaoMatricula {
	
	RESERVADA("Matricula Reservada"),
	
	EFETUADA("Matricula Efetuada");
	
	private String status;
	
	private EnumSituacaoMatricula(String status) {
		try {
			Field field = this.getClass().getSuperclass().getDeclaredField("name");
			field.setAccessible(true);
			field.set(this, status);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
