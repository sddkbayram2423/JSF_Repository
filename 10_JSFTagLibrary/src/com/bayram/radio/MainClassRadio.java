package com.bayram.radio;


import javax.enterprise.context.SessionScoped;

import javax.inject.Named;


import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@Named
@SessionScoped
public class MainClassRadio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String dersAdi;
	private String egitmen;
	private Ogrenci ogrenci;
	private Map<String, Object> alanlar;
	
	
	public MainClassRadio() {
		alanlar=new LinkedHashMap<String, Object>();
		alanlar.put("Onur Baran", "Spor");
		alanlar.put("Nazli Atak", "Kisisel Gelisim");
		alanlar.put("Bahar Baran", "Sanat");
		alanlar.put("Eda Kara", "Teknoloji");
		alanlar.put("Sevgi Sanri", "Kisisel Bakim");
	}
	
	

	public Ogrenci getOgrenci() {
		return ogrenci;
	}



	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}



	public String getEgitmen() {
		return egitmen;
	}



	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}



	public String getDersAdi() {
		return dersAdi;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	public Map<String, Object> getAlanAdi() {
		return alanlar;
	}


	
	public static class Ogrenci{
		private String adi;
		private String bolumu;
		public Ogrenci(java.lang.String adi, java.lang.String bolumu) {
			super();
			this.adi = adi;
			this.bolumu = bolumu;
		}
		public String getAdi() {
			return adi;
		}
		public void setAdi(String adi) {
			this.adi = adi;
		}
		public String getBolumu() {
			return bolumu;
		}
		public void setBolumu(String bolumu) {
			this.bolumu = bolumu;
		}
		
	}
	public Ogrenci[] ogrenciler() {
		Ogrenci[] genel=new Ogrenci[5];
		genel[0]=new Ogrenci("Ali Kartal", "Muhasebe");
		genel[1]=new Ogrenci("Zahide Yasar", "Bilgisayar");
		genel[2]=new Ogrenci("Onu Bayram", "İngilizce");
		genel[3]=new Ogrenci("Zehra Kartal", "Hukuk");
		genel[4]=new Ogrenci("Dilan Peltek", "Tıp");
		return genel;
	}
	

}
