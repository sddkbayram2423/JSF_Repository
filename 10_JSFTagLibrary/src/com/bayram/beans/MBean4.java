package com.bayram.beans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class MBean4 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String[] mobilSeverler;
	private static Map<String, Object> mobilSeverlerName;
	
	  static {
	        mobilSeverlerName = new LinkedHashMap<String, Object>();
	        mobilSeverlerName.put("Emre", "1"); 
	        mobilSeverlerName.put("Ahmet", "2"); 
	        mobilSeverlerName.put("Mustafa", "3");
	        mobilSeverlerName.put("Varol", "4");
	        mobilSeverlerName.put("Toprak", "5");
	        mobilSeverlerName.put("Nazli", "6");
	    }
	
	public MBean4() {
	}
	public String[] getMobilSeverler() {
		return mobilSeverler;
	}
	public void setMobilSeverler(String[] mobilSeverler) {
		this.mobilSeverler = mobilSeverler;
	}
	

	public Map<String, Object> getJavaGuiSeverlerAdiSoyadi() {
		return mobilSeverlerName;
	}

	public String getJavaGuiSeverlerSonucu() {
		return Arrays.toString(mobilSeverler);
	}
	    
	
}
