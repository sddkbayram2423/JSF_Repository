package com.bayram.bean;

import java.io.Serializable;
import java.util.ArrayList;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.bayram.model.Personel;

@Named
@SessionScoped
public class MainBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String personelNo;
	private String adi;
	private String soyadi;
	private double maas;
	
	public MainBean() {
	}
	
	//------------------------------------------
	
	public static final ArrayList<Personel> personels=new ArrayList<Personel>(Arrays.asList(
			new Personel("1234", "Ali", "Kara", 3800),
			new Personel("3245", "Ahmet", "Yapar", 2500),
			new Personel("3124", "Nazli", "Atak", 5400),
			new Personel("8564", "Bahar", "Baran", 6200),
			new Personel("1245", "Suzan", "Savas", 7400)));
	
	public ArrayList<Personel> getPersonels() {
		return personels;
	}
	
	//-------------------------------------------------------
	private static boolean artanSiaralma=true;

	public static void personelSirala() {

		if (artanSiaralma) {
			Collections.sort(personels, new Comparator<Personel>() {

				@Override
				public int compare(Personel o1, Personel o2) {
					return o1.getSoyadi().compareTo(o2.getSoyadi());
				}
			});
			artanSiaralma = false;

		} else {
			Collections.sort(personels, new Comparator<Personel>() {

				@Override
				public int compare(Personel o1, Personel o2) {
					return o2.getSoyadi().compareTo(o1.getSoyadi());
				}
			});
			artanSiaralma = true;
		}
	}
	//-------------------------------------------------------
	public void personelEkle() {
		Personel personel=new Personel(this.personelNo, this.adi, this.soyadi,this.maas);
		personels.add(personel);
		this.personelNo=" ";
		this.adi=" ";
		this.soyadi=" ";
		this.maas=0;
	}
	public String personelSil(Personel personel) {
		personels.remove(personel);
		return null;
	}
	
	//--------------------------------------------

    public String kayitDuzenle(Personel personel) {
    		personel.setDuzenle(true);
    		return null;
    }
    //---------------------------
    public String degisikligiKaydet() {
        for (Personel personel : personels) {
        	personel.setDuzenle(false);;
        }
        return null;
    }   
	//----------------------------------------------
	public String getNo() {
		return personelNo;
	}
	public void setNo(String no) {
		this.personelNo = no;
	}
	public String getAd() {
		return adi;
	}
	public void setAd(String ad) {
		this.adi = ad;
	}
	public String getSoyad() {
		return soyadi;
	}
	public void setSoyad(String soyad) {
		this.soyadi = soyad;
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}

	
}
