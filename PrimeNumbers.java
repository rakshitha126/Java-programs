public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a positive number");
		int n=0, i, flag=0;
		for(i=2; i<=n; i++)
		{
			if(n % i==0) {
				flag=1;
				break;
				// TODO Auto-generated method stub
			}
		}
        if(n==1)
        {
        	System.out.println("9 is prime");
        }
        else
        {
        	if(flag==0)
        	System.out.println("its not an prime");
        	else
        		System.out.println("its an negative number");
        }
        
	}

}
