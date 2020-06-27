package com.bayram.input;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MainClassInputHidden implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String massage="Hello World";
	
	public MainClassInputHidden() {
		// TODO Auto-generated constructor stub
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}
	

}
