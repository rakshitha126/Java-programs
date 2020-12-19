
public class SumOfNumber {

	public static void main(String[] args) {
		System.out.println("To print an sum of numbers");
		{
		int n=123,sum=0,m;    
		System.out.println("Enter a number: " +n);    
		while(n>0)    
		{    
	       	m=n%10;    
		    sum=sum+m;    
		    n=n/10;
		}
		System.out.println("print sum value is: " +sum);
	}
}
}
		// TODO Auto-generated method stub
      