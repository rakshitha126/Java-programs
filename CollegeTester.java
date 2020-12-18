package com.xworkz.accessmodifier.defaultmodifier;

public class CollegeTester {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			College college = new College("gsssietw", 2006);

			{
				college.name = "gsssietw";
				college.est = 2006;
				college.teaching();
			}

		}
}
