package com.hotjee.objectclone.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentTwo implements Serializable {
 
	private static final long serialVersionUID = -6571231505779510498L;
	private int number;
	private AddressTwo addre;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public AddressTwo getAddre() {
		return addre;
	}

	public void setAddre(AddressTwo addre) {
		this.addre = addre;
	}

	public Object clone() {
		StudentTwo newObject = null;
		
		try { 
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			newObject = (StudentTwo) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newObject;
	}
}
