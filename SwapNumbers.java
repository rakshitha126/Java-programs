import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		//Scanner class to read value
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of a: ");
		{
		a=sc.nextInt();
		System.out.print("Enter value of b: ");
		b=sc.nextInt();
		System.out.println("Before swapping - a: "+ a +", b: " + b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping  - a: "+ a +", b: " + b);
	}

	}

}
