package com.bayram.model2;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

public class ClassB implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public String onayVerenMetaot() {
		String sonuc="Sisteme giris onayi verildi";
		System.out.println(sonuc);
		return sonuc;
	}
	public void onayVeractionlistener(ActionEvent event) {
		String adi=(String)event.getComponent().getAttributes().get("p_adi");
		String soyadi=(String)event.getComponent().getAttributes().get("p_soyadi");
		String sonuc="Paramatreler :"+adi+" "+soyadi;
		System.out.println(sonuc);
	}
	
	
	
	
	

}
