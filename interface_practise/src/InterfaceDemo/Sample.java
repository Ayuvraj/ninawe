package InterfaceDemo;

public class Sample implements InterfaceClass {
	
	public void m1()
	{
		System.out.println("Method m1 is completed Implemention class");
	}
	public void m2()
	{
		System.out.println("Method m2 is completed Implemention Class");
	}
	
	
	public static void main(String[] args)
	{
		Sample s= new Sample();
		
		s.m1();
		s.m2();
		
	}

}


