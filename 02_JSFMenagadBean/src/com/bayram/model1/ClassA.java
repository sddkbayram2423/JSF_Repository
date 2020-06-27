package com.bayram.model1;

import java.io.Serializable;


//@Named
//@SessionScoped
public class ClassA implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String adi;
	private String soyadi;
	
	public ClassA() {
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

	@Override
	public String toString() {
		return "ClassA [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	
	

}
