import java.util.*;

class A
{
	A()
	{
		System.out.println("Hello this is class A");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new A();
		B b1 = new B();

	}
}


class B
{

	public static String s;

	B()
	{
		System.out.println("This is class B");
		System.out.println(s);
	}

}


class C
{
	public static void C()
	{
		System.out.println("This is class C");
	}
}