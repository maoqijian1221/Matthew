package com.mqj.chapter7;

public class Object03 {
	
	//编写一个main方法
	public static void main(String[] args) {

		Men p1=new Men();
		p1.age=10;
		p1.name="小明";
		Men p2=p1; //把p1 赋给了 p2 ， 让p2指向p1 
		System.out.println(p2.age); // 10

	}
}

class Men {
	String name;
	int age; 
}