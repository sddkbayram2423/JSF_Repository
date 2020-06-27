package com.bayram.controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MyBoxList implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String[] dersler;
	private String[] alanlar;
	private String[] ogrenciler;

	public MyBoxList() {
	}
	
	public String[] getDersler() {
		return dersler;
	}
	public void setDersler(String[] dersler) {
		this.dersler = dersler;
	}
	public String[] getAlanlar() {
		return alanlar;
	}
	public void setAlanlar(String[] alanlar) {
		this.alanlar = alanlar;
	}
	public String[] getOgrenciler() {
		return ogrenciler;
	}
	public void setOgrenciler(String[] ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	
	

}
