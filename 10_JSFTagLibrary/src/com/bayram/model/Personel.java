package com.bayram.model;

public class Personel {

	private String numarasi;
	private String adiSoyadi;
	private double maasi;
	private int yasi;

	public Personel(String numarasi, String adiSoyadi, double maasi, int yasi) {
		super();
		this.numarasi = numarasi;
		this.adiSoyadi = adiSoyadi;
		this.maasi = maasi;
		this.yasi = yasi;
	}

	public Personel() {
	}

	public String getNumarasi() {
		return numarasi;
	}

	public void setNumarasi(String numarasi) {
		this.numarasi = numarasi;
	}

	public String getAdiSoyadi() {
		return adiSoyadi;
	}

	public void setAdiSoyadi(String adiSoyadi) {
		this.adiSoyadi = adiSoyadi;
	}

	public double getMaasi() {
		return maasi;
	}

	public void setMaasi(double maasi) {
		this.maasi = maasi;
	}

	public int getYasi() {
		return yasi;
	}

	public void setYasi(int yasi) {
		this.yasi = yasi;
	}

}
