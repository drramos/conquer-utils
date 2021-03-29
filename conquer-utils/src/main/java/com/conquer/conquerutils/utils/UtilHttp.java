package com.conquer.conquerutils.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.conquer.conquerutils.dto.MensagemRetorno;

public class UtilHttp {
	
	public static MensagemRetorno enviarGet(String url) {
		return enviarGet(url, null);
	}
	
	public static MensagemRetorno enviarGet(String url, Map<String, String> properties) {
			
		MensagemRetorno mensagemRetorno = new MensagemRetorno();
		mensagemRetorno.setStatusHttp(HttpStatus.INTERNAL_SERVER_ERROR.value());
		mensagemRetorno.setMensagem("");
		
		try {
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "*/*");
			 
			if(properties != null) {
				for (Map.Entry<String, String> entry : properties.entrySet()) {
					conn.setRequestProperty(entry.getKey(), entry.getValue());
				}
			}
			
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
	
	public static String montarURl(String urlBase, Map<String, String> parametros) {
		String urlRetorno = urlBase;
		boolean remove = false;
		
		if(parametros != null && parametros.size()>0) {
			urlRetorno += "?";
			
			for (Map.Entry<String, String> entry : parametros.entrySet()) {
				urlRetorno += entry.getKey() + "=" + entry.getValue();
				urlRetorno += "&";
				remove = true;
			}
			if(remove) {
				urlRetorno = urlRetorno.substring(0, urlRetorno.length()-1);
			}
			
		}
		
		return urlRetorno;
	}
}
