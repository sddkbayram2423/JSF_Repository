package com.bayram.controller;


import java.io.Serializable;

import java.util.LinkedHashMap;

import java.util.Locale;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named
@SessionScoped
public class LanguageBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String localeCode;
	    private static Map<String, Object> countries;

	    static {
	    	
	    	Locale locale=new Locale("tr","TR");
	        countries = new LinkedHashMap<String, Object>();
	        countries.put("Turkish", locale); 
	        countries.put("Deutsch", Locale.GERMANY); 
	        countries.put("United Kingdom", Locale.UK);
	    }

	    public Map<String, Object> getCountriesMap() {
	        return countries;
	    }

	    public String getlocaleCode() {
	        return localeCode;
	    }

	    public void setlocaleCode(String localeCode) {
	        this.localeCode = localeCode;
	    }

	
	    public void countriesLocaleCodeChanged(ValueChangeEvent e) {

	        String localeCodeValue = e.getNewValue().toString();

	        for (Map.Entry<String, Object> entry : countries.entrySet()) {

	            if (entry.getValue().toString().equals(localeCodeValue)) {
	                FacesContext.getCurrentInstance().
	                        getViewRoot().
	                        setLocale((Locale) entry.getValue());
	            }
	        }
	    }

}
