
public class Operators1 {

	public static void main(String[] args) {
		int a = 34;
		int b = 21;
		int c = a++ + ++b;
		System.out.println(+c);
		int d = --a + --b + c--;
			System.out.println(+d);
		int e = a + +b + +c + d--;
			System.out.println(+e);
		int f = -a + b-- + -c - d++;
			System.out.println(+f);
		int sum = a + b + c + d + e + f;
			System.out.println("sum = " + sum);
		// TODO Auto-generated method stub

	}

}
