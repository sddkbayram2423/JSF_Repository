package com.bayram.controller;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import com.bayram.model.Personel;

@Named
@SessionScoped
public class MainBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Personel[] personelListesi = new Personel[]{
        new Personel("571", "Melek Celik", 1900.00, 28),
        new Personel("1299", "Erim Karakaya", 1500.00, 22),
        new Personel("632", "Ayse Kuskapan", 1600.00, 26),
        new Personel("1453", "Mert Turkman", 1300.00, 23),
        new Personel("1918", "Musa Baran", 1100.00, 27),
        new Personel("1915", "Ada Kaya", 1050.00, 21),
        new Personel("1517", "Merve Arpa", 1140.00, 24)
    };

    public Personel[] getPersonelListesi() {
        return personelListesi;
    }

}
