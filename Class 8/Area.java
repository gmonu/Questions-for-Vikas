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
		System.out.println("You have selected Area of Square");
		// side 
		// side*side
	}

	static void areaRectangle()
	{
		System.out.println("You have selected Area of Rectangle");	
		float length = sc.nextFloat();
		float width = sc.nextFloat();
	}

	static void areaCircle()
	{
		System.out.println("You have selected Area of Circle");
		float pi = 3.14;
		System.out.println("Enter the length and width value");
		float radius = sc.nextFloat();
		float result = pi*(radius * radius);
		System.out.println("The are of circle for given data is:"+ result);
	}

	static void areaTriangle()
	{
		System.out.println("You have selected Area of Triangle");
	}

}