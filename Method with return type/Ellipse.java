class  Ellipse
{
	static double area()
	{
		final double pi=3.142;
		int a=10;
		int b=2;
		double res=pi*a*b;

		return res;
	}
	public static void main(String[] args) 
	{
		double x=area();
		System.out.println(x);
	}
}
