class BitwiseOperation
{
	public static void main(String args[])
	{
		int a = 2;
		int b = 4;
		System.out.println("a&b = " + (a & b));
		System.out.println("a|b = " + (a | b));
		System.out.println("a^b = " + (a ^ b));
		a &= b;
		System.out.println("a = " +a);
	}
}