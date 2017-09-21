package com.hotjee.objectclose;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.hotjee.objectclone.shallow.RoleEntity;
import com.hotjee.objectclone.shallow.UserEntity;

/**
 * 浅克隆 -- 测试类
 * 
 * 浅克隆  
 *      只能针对基本数据类型
 *      引用类型包括类、接口、数组等复杂类型不行
 */
public class ShallowTest {

	@Test // 基本数据类型
	public void demoOne(){
		UserEntity ue = new UserEntity();
		ue.setId(10);
		ue.setName("xiaoming");
		ue.setAge(16);
		
		// 克隆（复制）
		UserEntity ueClone = (UserEntity) ue.clone();
		// 修改克隆后的属性--查看克隆是否成功
		ueClone.setId(20);
		ueClone.setName("xiaoli");
		ueClone.setAge(26);
		 
		System.out.println("before json: " + JSON.toJSONString(ue));
		System.out.println("after  json: " + JSON.toJSONString(ueClone));
	}
	
	@Test // 引用类型包括类、接口、数组等复杂类型不行
	public void demoTwo(){
		RoleEntity re = new RoleEntity();
		re.setId(1);
		re.setName("System");
		
		UserEntity ue = new UserEntity();
		ue.setId(10);
		ue.setName("xiaoming");
		ue.setAge(16);
		ue.setRole(re);
		
		// 克隆（复制）
		UserEntity ueClone = (UserEntity) ue.clone();
		
		re.setId(2);
		re.setName("admin");
		// 修改克隆后的属性--查看克隆是否成功
		ueClone.setId(20);
		ueClone.setName("xiaoli");
		ueClone.setAge(26);
		ueClone.setRole(re);
		
		System.out.println("before json: " + JSON.toJSONString(ue));
		System.out.println("after  json: " + JSON.toJSONString(ueClone));
	}
}
