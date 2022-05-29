package interface_practisedemo;

public class ImpClass implements InterfaceClass {
	
	public void method1()
	{
		System.out.println("yuvraj");
	}
	public void method()
	{
		System.out.println("hello");
	}
	
	public static void main(String [] args)
	{
		ImpClass n=new ImpClass();
		
		n.method();
		n.method1();
		n.sdf();
		
		System.out.println("a");
		System.out.println("b");
	}


}
