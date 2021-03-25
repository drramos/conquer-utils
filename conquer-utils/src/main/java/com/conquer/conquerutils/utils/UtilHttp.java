package com.conquer.conquerutils.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.springframework.http.HttpStatus;

import com.conquer.conquerutils.dto.MensagemRetorno;

public class UtilHttp {
	
	private String method;
	
	private String url;
	

	public static MensagemRetorno enviarGet(String url) {
			
		MensagemRetorno mensagemRetorno = new MensagemRetorno();
		mensagemRetorno.setStatusHttp(HttpStatus.INTERNAL_SERVER_ERROR.value());
		mensagemRetorno.setMensagem("");
		
		try {
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			
			mensagemRetorno.setStatusHttp(conn.getResponseCode());
			
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
		
			String output = "";
			String line;
			while ((line = br.readLine()) != null) {
				output += line;
			}
			
			mensagemRetorno.setMensagem(output);
			
			conn.disconnect();
			
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mensagemRetorno;
	}
}
