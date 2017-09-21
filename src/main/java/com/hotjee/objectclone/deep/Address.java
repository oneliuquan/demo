package com.hotjee.objectclone.deep;

public class Address implements Cloneable {
 
	private String adre;

	public String getAdre() {
		return adre;
	}

	public void setAdre(String adre) {
		this.adre = adre;
	}

	@Override
	public Object clone() {
		Address newObject = null;
		
		try {
			newObject = (Address) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newObject;
	}
 
}
