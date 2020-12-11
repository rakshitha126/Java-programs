import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

			int num=23;
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			
			System.out.println("Enter a number :: ");
			
			if (num > 0)
			{
				System.out.println("Given number is a positive integer");
			}
			else if(num < 0)
			{
				System.out.println("Given number is a negative integer");
			
			}
			else 
			{
				System.out.println("Given number is neither positive nor negative");
			}
				
		}


		// TODO Auto-generated method stub

	}


