import java.util.*;
class School
{
	// Variables
		static String schoolName = "Modern Public School";
		static int schoolId = 12345;


		static String name;
		static int age;
		static long phone;


//methods main, first, second, third, fourth, fifth

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------WELCOME----------------");
		System.out.println("1. Class 1st");
		System.out.println("2. Class 2nd");
		System.out.println("3. Class 3rd");
		System.out.println("4. Class 4th");
		System.out.println("5. Class 5th");
		System.out.println("6. EXIT");
		System.out.println("Enter your desired class in you want to go");

		int choice = sc.nextInt();

		switch(choice)
		{
			case 1:
			{
				first();
				break;
			}
			case 2:
			{
				second();
				break;
			}
			case 3:
			{
				third();
				break;
			}
			case 4:
			{
				fourth();
				break;
			}
			case 5:
			{
				fifth();
				break;
			}
			case 6:
			{
				System.exit(0);
				break;
			}	
			default:
			{
				System.out.println("wrong choice");
				break;
			}
		}

	}

	public static void input()
	{
		//Making object of sports class
		Sports sp = new Sports();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name/age/phone with space between");
		name = sc.nextLine();
		age = sc.nextInt();
		phone = sc.nextLong();	

		if(age>=15)
		{
				sp.sportin();
		}
	}

	public static void output()
	{
		//Making object of sports class
		Sports sp = new Sports();
		System.out.println("Your details:");
		System.out.println("Name: \t"+name);
		System.out.println("Age:\t"+age);
		System.out.println("Phone:\t"+phone);
		System.out.println("School Name\t:"+schoolName);
		System.out.println("School ID:\t"+schoolId);
		if(sp.sportname != null)
		{
		sp.sportout();
		}	
	}
	public static void first()
	{
		input();
		output();
	}
	public static void second()
	{
		input();
		output();
	}
	public static void third()
	{
		input();
		output();
	}
	public static void fourth()
	{
		input();
		output();
	}
	public static void fifth()
	{
		input();
		output();
	}
}


class Sports
{
	static String sportname;

	public static void sportin()
	{	
			System.out.println("Enter your desired sports");
			Scanner sc = new Scanner(System.in);
			sportname = sc.nextLine();
	}

	public static void sportout()
	{	
			System.out.println("Selected desired Sports name is : "+sportname);
	}


}


// phone number should be of 10 digits
// Yoga Teacher --> 
// Class Yoga --> Want to join Yoga --> if Yes then Yoga class Yes if No Yoga class No
// Computer class --> Enter your desired programming language -- > output 