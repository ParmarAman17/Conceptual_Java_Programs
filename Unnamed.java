
class Unnamed
{
	public static void main(String arg[])
	{
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(11,21);	
	}
}
class Demo
{
	public int i,j;
	public static int x,y;

	{
		System.out.println("Inside unnamed");
		i = 10;
		j = 20;
		// Common logic
	}
	public Demo()
	{	
		System.out.println("Inside default constructor");
	}
	public Demo(int a, int b)
	{
		System.out.println("Inside parametrised constructor");
	}	
	static
	{
		System.out.println("Inside staic block");
		x = 10;
		y = 20;
	}
}