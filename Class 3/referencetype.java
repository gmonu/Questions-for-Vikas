import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Human h1 = new Human();	//object datatype variable
		h1.input();
		h1.display();	
	}
}


class Human //Datatype
{
	Scanner sc = new Scanner(System.in);
	String name;
	byte age;
	String color;

	void input()
	{
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Age");
		age = sc.nextByte();
		System.out.println("Enter color");
		color = sc.next();
	}
	void display()
	{
		System.out.println("Your name is: "+ name+"\n Your Age is: "+age+"\n Your color is: "+color);
		
	}
}