package com.xworkz.memorymanagement.defaultmanagement;

public class AreaOfSphere {
	public static void main(String[] args)
	{
	System.out.println("Begin of the Program");

	AreaOfSphere area = new AreaOfSphere();
	double result = area.findspherearea(5);
	System.out.println("Area of the sphere with radius 5 is " + result);

	System.out.println("End of the Program");

}

public double findspherearea(double r) {
	// A = 4 * pi * radiussquare(rs)
	double area;
	double pi = findPi(); // method calling
	System.out.println("Value of Pi is: " + pi);
	double rs = findRS(r); // method calling
	System.out.println("Value of radius-square is: " + rs);
	area = 4 * pi * rs;
	return area;
}

double findPi() {
	double pi = 22d / 7d;
	return pi;
}

double findRS(double r) {
	double rs = Math.pow(r, 2); // rs = r*r
	return rs;
}
}