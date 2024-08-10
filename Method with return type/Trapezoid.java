class  Trapezoid
{
	static double area()
	{
		
		int a=10;
		int b=20;
		int h=80;
		double res=0.5*(a+b)*h;

		return res;
	}
	public static void main(String[] args) 
	{
		double x=area();
		System.out.println(x);
	}
}
