import java.util.*;
class Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, result=0, choice;
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter you choice");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		choice = sc.nextInt();

		switch(choice)
		{
			case 1: 
			{
				System.out.print(add(a, b));
				break;
			}
			case 2:
			{
				System.out.print(sub(a, b));
				break;
			}
			case 3:
			{
				System.out.print(mul(a, b));
				break;
			}
			case 4:
			{
				System.out.print(div(a, b));
				break;
			}
		}
	}

	static int add(int x, int y)
	{
		return x+y;
	}
	static int sub(int x, int y)
	{
		return x-y;
	}
	static int mul(int x, int y)
	{
		return x*y;
	}
	static int div(int x, int y)
	{
		return x/y;
	}
}