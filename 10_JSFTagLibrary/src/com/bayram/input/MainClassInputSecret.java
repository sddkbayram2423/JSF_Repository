package com.bayram.input;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MainClassInputSecret implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String kullaniciAdi;
	private String parola;
	
	public MainClassInputSecret() {
		// TODO Auto-generated constructor stub
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	
	

}
