
public class BelowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("below pattern");
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.println("");
        	
        	}
        	for(int k=5;k>=i;k--)
        	{
        		System.out.print("*");
        		
        	}
        	System.out.println("");
        }
	}

}
