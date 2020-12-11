
public class ConstructorOverloading {
	      String firstName;
	      char lastName;
	      int phno; 
	      static long num;

	      ConstructorOverloading(String name,char lname){   // Constructor1
	    	  firstName=name;   //this.fis
	           lastName=lname;
	           }
	      ConstructorOverloading(String name,char lname,int num){   //Constructor2
	    	  firstName=name;
	          lastName=lname;
	          phno=num;

	      }
	      ConstructorOverloading(int m){ 
	    	  this(num);
	    	  phno=m;
	      }
	      ConstructorOverloading(long number){
	    	  num=number;
	      }

	          public static void main(String[] args) {
	        	  ConstructorOverloading identity=new ConstructorOverloading("rakshitha",'N');
	        	  ConstructorOverloading identity1=new ConstructorOverloading("Pooja",'A',736578654);
	        	  // we can use long if int is out of range L or l
	        	  System.out.println("fullName:"+identity.firstName+" "+identity.lastName);
	        	  System.out.println("Name2:"+identity1.firstName);
	        	  System.out.println(identity1.firstName+" "+identity1.lastName+" "+identity1.phno);

	        	  ConstructorOverloading identity2=new ConstructorOverloading(7806345267l);
	        	   System.out.println("for 10 digit no."+identity2.num);


	        	   ConstructorOverloading identity3=new ConstructorOverloading(6776345267l);
	        	   System.out.println("for 10 digit no."+identity3.phno);
	          }
	      }



