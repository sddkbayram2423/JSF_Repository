package com.bayram.input;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MainClassInputText implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adi;
	private String soyadi;
	public MainClassInputText() {
		// TODO Auto-generated constructor stub
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	
}
