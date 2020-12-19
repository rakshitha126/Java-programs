
public class SkipFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i=1;
		while(i<=10)
		{
			if(i%n==0)
			{
				i++;
				continue;
				
			}
			System.out.println(i);
			i++;
		}
		System.out.println("end of pgm");

	}

}
