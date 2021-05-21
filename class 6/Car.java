import java.util.*;


class Car 
{
	public static void main(String[] args) {
		new CarDetails();
	}
}

class CarDetails
{
		//data members
	String name;
	String color;
	float price;
	

	//methods
	CarDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------- Welcome To Car Shop --------------------");
		name = sc.nextLine();
		color = sc.nextLine();
		price = sc.nextFloat();
		

		System.out.println("The specfication of your car is\n"+         
							name+"  "+color+"  "+price);
	}

}
