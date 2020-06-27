package com.bayram.beans;

import java.io.Serializable;
import java.util.Arrays;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class MBean3 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String[] iphoneSeverler;
	
	public MBean3() {
	}
	public String[] getIphoneSeverler() {
		return iphoneSeverler;
	}
	public void setIphoneSeverler(String[] iphoneSeverler) {
		this.iphoneSeverler = iphoneSeverler;
	}
	  public String[] getIphoneSeverlerName() {
	        iphoneSeverler = new String[6];
	        iphoneSeverler[0] = "Ahmet";
	        iphoneSeverler[1] = "Onur";
	        iphoneSeverler[2] = "REyhan";
	        iphoneSeverler[3] = "Serdar";
	        iphoneSeverler[4] = "Meltem";
	        iphoneSeverler[5] = "Huseyin";
	        return iphoneSeverler;
	    }
	    
	    public String getIphoneSeverlerResult() {
	        return Arrays.toString(iphoneSeverler);
	    }
	
}
