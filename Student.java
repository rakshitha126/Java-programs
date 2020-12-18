package com.xworkz.accessmodifier.defaultmodifier;

public class Student {
	private String name;
	public String Std;
	public Student(String name,String std)
	{
		name="aaa";
		std="puc";

	}
	public void studying()
	{
		System.out.println("studying puc");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("aaa","puc");
		{
			student.name="aaa";
			student.Std="puc";
			student.studying();
		}
	}
}
