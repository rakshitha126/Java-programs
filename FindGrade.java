
public class FindGrade {

	public static void main(String[] args) {
		System.out.println("Find greade for percentage");
		float percentage = 78.9f;
		if(percentage >= 85)
		{
			System.out.println("you have got A");
		}else if(percentage >= 65 && percentage <= 84) {
			System.out.println("you have got B");
		}else if(percentage >= 35 && percentage <= 64) {
			System.out.println("you have got C");
		}
		else
			System.out.println("you have got D");
	
			
	}
}
