package com.hotjee.objectclone.shallow;

public class UserEntity implements Cloneable {

	private int id;
	private String name;
	private int age;
	private RoleEntity role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	@Override
	public Object clone() {
		UserEntity ue = null;
		try {
			ue = (UserEntity) super.clone(); // 浅克隆
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ue;
	}

}
