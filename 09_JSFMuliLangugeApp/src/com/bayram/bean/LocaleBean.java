package com.bayram.bean;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;



import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

@Named
@SessionScoped
public class LocaleBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 private String locale;
	  private Map<String, Object> countriesMap;
	  
	  public LocaleBean() {
		 countriesMap = new LinkedHashMap<String, Object>();
		countriesMap.put("Turkish", new Locale("tr", "TR"));
		countriesMap.put("English", new Locale("en", "EN"));
		countriesMap.put("Deutch", new Locale("de", "DE"));
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Map<String, Object> getCountriesMap() {
		return countriesMap;
	}

	public void setCountriesMap(Map<String, Object> countriesMap) {
		this.countriesMap = countriesMap;
	}
	
	
	public void changeLocaleContolMetod(ValueChangeEvent e) {

		   String localeCodeValue = e.getNewValue().toString();
		   
	       

	        for (Map.Entry<String, Object> entry : countriesMap.entrySet()) {
	            if (entry.getValue().toString().equals(localeCodeValue)) {
	                Locale locale = (Locale) entry.getValue();
	                FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
	            }
	        }
	    }
	  

}
