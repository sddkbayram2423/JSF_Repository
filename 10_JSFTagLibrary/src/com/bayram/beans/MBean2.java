package com.bayram.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class MBean2 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String[] yazilimSevenler;
	
	public MBean2() {
	}

	public String[] getYazilimSevenler() {
		return yazilimSevenler;
	}

	public void setYazilimSevenler(String[] yazilimSevenler) {
		this.yazilimSevenler = yazilimSevenler;
	}
	

}
