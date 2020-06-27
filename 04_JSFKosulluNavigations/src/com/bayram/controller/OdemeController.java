package com.bayram.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named("odemeController")
@SessionScoped
public class OdemeController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int siparisToplam=50;
	boolean siparisOnay=false;
	 
	 public OdemeController() {
	}

	public int getSiparisToplam() {
		return siparisToplam;
	}

	public void setSiparisToplam(int siparisToplam) {
		this.siparisToplam = siparisToplam;
	}

	public boolean isSiparisOnay() {
		return siparisOnay;
	}

	public void setSiparisOnay(boolean siparisOnay) {
		this.siparisOnay = siparisOnay;
	}
	 
	public String odemeAc() {
		siparisToplam=this.getSiparisToplam();
		return "odeme";// outcome odeme
	}

	public String siparisAc() {
		return "sparis"; // outcome sparis
	}

	public String urunlerAc() {
		return "uruler"; // outcome uruler
	}

	public String uyeolAc() {
		return "uyeol"; // outcome uyeol
	}

}
