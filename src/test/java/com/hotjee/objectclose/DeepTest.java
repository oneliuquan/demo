package com.hotjee.objectclose;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.hotjee.objectclone.deep.Address;
import com.hotjee.objectclone.deep.AddressTwo;
import com.hotjee.objectclone.deep.Student;
import com.hotjee.objectclone.deep.StudentTwo;

/**
 * 深克隆 -- 测试类
 */
public class DeepTest {

	@Test // 第一种（深克隆）
	public void demoOne(){
		Address addre = new Address();
		addre.setAdre("sicuang chengdu gaoxin");
		
		Student stu = new Student();
		stu.setNumber(10);
		stu.setAddre(addre);
		
		// 克隆
		Student stuClone = (Student) stu.clone();
		
		System.out.println("before json: " + JSON.toJSONString(stu));
		System.out.println("after  json: " + JSON.toJSONString(stuClone));
		System.out.println();
		
		// 修改属性
		stuClone.setNumber(20);
		addre.setAdre("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("before json: " + JSON.toJSONString(stu));
		System.out.println("after  json: " + JSON.toJSONString(stuClone));
	}
	
	@Test // 第二种（深克隆）  ***推荐使用***
	public void demoTwo(){
		AddressTwo addre = new AddressTwo();
		addre.setAdre("sicuang chengdu gaoxin");
		
		StudentTwo stu = new StudentTwo();
		stu.setNumber(10);
		stu.setAddre(addre);
		
		// 克隆
		StudentTwo stuClone = (StudentTwo) stu.clone();
		
		System.out.println("before json: " + JSON.toJSONString(stu));
		System.out.println("after  json: " + JSON.toJSONString(stuClone));
		System.out.println();
		
		// 修改属性
		stuClone.setNumber(20);
		addre.setAdre("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("before json: " + JSON.toJSONString(stu));
		System.out.println("after  json: " + JSON.toJSONString(stuClone));
	}
}
