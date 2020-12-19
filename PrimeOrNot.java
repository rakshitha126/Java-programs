
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		boolean flag=false;
		for(int i=2;i<=num;++i)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("the given number is prime number: " +num);
		else
			System.out.println("the given number is not a prime number: " +num);

	}

}
