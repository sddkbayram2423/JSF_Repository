package com.bayram.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("mainContoller")
@SessionScoped
public class MainPageController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public MainPageController() {
	}
	
	public String openaPage() {
		
		return "page";
		
	}

}
