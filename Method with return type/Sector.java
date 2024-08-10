class  Sector
{
	static double area()
	{
		int r=5;
		double t=30.5;
		double res=0.5*r*r*t;

		return res;
	}
	public static void main(String[] args) 
	{
		double x=area();
		System.out.println(x);
	}
}
