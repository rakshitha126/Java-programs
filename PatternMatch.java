
public class PatternMatch {

	public static void main(String[] args) {
		System.out.println("Pattern match");
		// TODO Auto-generated method stub
		 int rows=5, coef = 1, space, i, j;
		 System.out.println("Enter the number of rows: " +rows);
		   for (i = 0; i < rows; i++) {
		      for (space = 1; space <= rows - i; space++)
		     System.out.print("  ");
		      for (j = 0; j <= i; j++) {
		         if (j == 0 || i == 0)
		            coef = 1;
		         else
		            coef = coef * (i - j + 1) / j;
		         System.out.println("Print coef is: "+coef);
		      }
		     System.out.print("\n");
	}

	}
}
