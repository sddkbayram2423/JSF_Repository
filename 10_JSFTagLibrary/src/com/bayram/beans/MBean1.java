package com.bayram.beans;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MBean1 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private boolean dogrumu;
	
	public MBean1() {
	}

	public boolean isDogrumu() {
		return dogrumu;
	}

	public void setDogrumu(boolean dogrumu) {
		this.dogrumu = dogrumu;
	}
	
	

}
