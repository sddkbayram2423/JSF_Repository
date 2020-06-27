package com.bayram.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class MainClass implements Serializable {

	private static final long serialVersionUID = 1L;
	private String ad;
	private String soyad;
	public MainClass(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}
	public MainClass() {
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	
	
}
