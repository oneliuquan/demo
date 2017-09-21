package com.hotjee.objectclone.deep;

public class Student implements Cloneable {
 
	private int number;
	private Address addre;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Address getAddre() {
		return addre;
	}

	public void setAddre(Address addre) {
		this.addre = addre;
	}

	@Override
	public Object clone() {
		Student newObject = null;
		
		try {
			newObject = (Student) super.clone(); // 浅克隆
			if(addre != null)
				newObject.addre = (Address) addre.clone(); // 深克隆（这种克隆有一个比较不方便的是：引用类都要继承接口Cloneable和实现方法clone）
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newObject;
	}
}
