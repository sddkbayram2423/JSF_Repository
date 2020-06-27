package com.bayram.model3;

import java.io.Serializable;

public class ClassC implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String adi;
	private String soyadi;
	private String deneyim;
	public ClassC() {
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
	public String getDeneyim() {
		return deneyim;
	}
	public void setDeneyim(String deneyim) {
		this.deneyim = deneyim;
	}
	@Override
	public String toString() {
		return "ClassC [adi=" + adi + ", soyadi=" + soyadi + ", deneyim=" + deneyim + "]";
	}
	
	
}
