package com.bayram.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class PageController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public String goPage1() {
		return "basarili";
	}

	public String goPage2() {
		return "basarili";
	}

	public String goPage3() {
		return "olumlu";
	}
}
