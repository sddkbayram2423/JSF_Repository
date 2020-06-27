package com.bayram.model;

public class Personel {
	
	private String personelNo;
	private String adi;
	private String soyadi;
	private double maas;
	private boolean duzenle;
	
	public Personel() {
	}

	public Personel(String personelNo, String adi, String soyadi, double maas) {
		super();
		this.personelNo = personelNo;
		this.adi = adi;
		this.soyadi = soyadi;
		this.maas = maas;
	}

	public String getPersonelNo() {
		return personelNo;
	}

	public void setPersonelNo(String personelNo) {
		this.personelNo = personelNo;
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

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public boolean isDuzenle() {
		return duzenle;
	}

	public void setDuzenle(boolean duzenle) {
		this.duzenle = duzenle;
	}

	
	
}
