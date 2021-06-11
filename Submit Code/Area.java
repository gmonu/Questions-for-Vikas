import java.util.*;
class Area
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, In this program you can find the different shape's area");
		System.out.println("Select your choice");
		System.out.println("1. Area of Square");
		System.out.println("2. Area of Rectangle");
		System.out.println("3. Area of Circle");
		System.out.println("4. Area of Triangle");
		System.out.println("5. Exit");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1: 
			{
				areaSquare();
				break;
			}
			case 2: 
			{
				areaRectangle();
				break;
			}
			case 3: 
			{
				areaCircle();
				break;
			}
			case 4: 
			{
				areaTriangle();
				break;
			}

			case 5:
			{
				System.exit(0);
			}
			default :
			{
				System.out.println("Wrong choice");
			}
		}
	}


	static void areaSquare()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("You have selected Area of Square");
		double side = sc.nextDouble();
      	System.out.println("Area of Square is: "+side*side);

	}

	static void areaRectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("You have selected Area of Rectangle"   );
		System.out.println("Enter Length:");	
		float length = sc.nextFloat();
		System.out.println("Enter Width:");
		float width = sc.nextFloat();
			System.out.println("The are of circle for given data is:" +length*width);
	}

	static void areaCircle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("You have selected Area of Circle"+"   ");
		double pi = 3.14;
		System.out.println("Enter the length and width value");
		double radius = sc.nextDouble();
		double result = pi*(radius * radius);
		System.out.println("The are of circle for given data is:"+ result);
	}

	static void areaTriangle()
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("You have selected Area of Triangle"+ "  ");
		System.out.println("Enter the width of the Triangle");
		double base = sc.nextDouble();
		System.out.println("Enter the height of the Triangle:");
      	double height = sc.nextDouble();
      	System.out.println("The are of circle for given data is:"+ base * height/2);
	}

}