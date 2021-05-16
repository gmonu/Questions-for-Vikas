import java.util.*;
class Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b; //a<=50000, b<=50000
		int choice;
		System.out.println("Enter two numbers:");
		a = sc.nextFloat();
		b = sc.nextFloat();

		if(a<=50000 && b<=50000)


		{
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
	System.out.println("Inputs are not in range of 50000");
	}

	static float add(float x, float y)
	{
		return x+y; 
	}
	static float sub(float x, float y)
	{
		return x-y;
	}
	static float mul(float x, float y)
	{
		return x*y;
	}
	static float div(float x, float y)
	{
		return x/y;
	}
}