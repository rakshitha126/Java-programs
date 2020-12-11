public class Pyramid {

	public static void main(String[] args) {
		System.out.println("To print an pyramid");
		
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0; i<=2; i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
System.out.println("pattern increment");
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
}

System.out.println("pattern decrement");
for(int i=5;i>=1;i--)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
