package com.bayram.beans;

import java.io.Serializable;
import java.util.Arrays;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;



@Named
@SessionScoped
public class MBean5 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String[] webSeverler;
	
	public MBean5() {
	}

	public String[] getWebSeverler() {
		return webSeverler;
	}

	public void setWebSeverler(String[] webSeverler) {
		this.webSeverler = webSeverler;
	}
	
	 public static class Sayi { 
	        public String sayiEtiketi;
	        public String sayiDegeri;
	        
	        public Sayi(String sayiEtiketi, String sayiDegeri) {
	            this.sayiEtiketi = sayiEtiketi;
	            this.sayiDegeri = sayiDegeri;
	        }
	        
	        public String getSayiEtiketi() {
	            return sayiEtiketi;
	        }
	        public String getSayiDegeri() {
	            return sayiDegeri;
	        }
	    }
	
	 private Sayi[] webSeverlerAdiSoyadi;
	    
	    public Sayi[] getJsfSeverlerAdiSoyadi() {
	        webSeverlerAdiSoyadi = new Sayi[6];
	        webSeverlerAdiSoyadi[0] = new Sayi("Faruk Taşbaşı", "1");
	        webSeverlerAdiSoyadi[1] = new Sayi("Mehmet Canker", "2");
	        webSeverlerAdiSoyadi[2] = new Sayi("Can Delibas", "3");
	        webSeverlerAdiSoyadi[3] = new Sayi("Halit Karaçayır", "4");
	        webSeverlerAdiSoyadi[4] = new Sayi("Burak Tungut", "5");
	        webSeverlerAdiSoyadi[5] = new Sayi("Veysel Karani Ece", "6");
	        return webSeverlerAdiSoyadi;
	    }
	    
	    public String getJsfSeverlerSonucu() {
			return Arrays.toString(webSeverler);
		}
}
