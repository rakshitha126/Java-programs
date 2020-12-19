package com.xworkz.block;

public class TelevisionTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Television lg = new Television();
       System.out.println("Brand : "+lg.brand);
       System.out.println("Price : "+lg.price);
       System.out.println("Size in Inches : "+lg.sizeininches);
       System.out.println("----------------------------------------------------");
       Television mi = new Television("MI",35000.00,50);
       System.out.println("Brand : "+mi.brand);
       System.out.println("Price : "+mi.price);
       System.out.println("Size in Inches : "+mi.sizeininches);
      
	}

}
//output
//Initialization block 1
//Initialization block 2
//Initialization block 3
//No Arg constructor
//Brand : Samsung
//Price : 30000.0
//Size in Inches : 40
//----------------------------------------------------
//Initialization block 1
//Initialization block 2
//Initialization block 3
//Brand : MI
//Price : 35000.0
//Size in Inches : 50
