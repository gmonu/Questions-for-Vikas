//to check age = 13 and name = Vikas
// if else
// if else ladder
// switch

import java.util.*;
class Ifelse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you name:");
		String name = "Vikas";

		System.out.println("Enter you age:");
		int age = sc.nextInt();
		
		
		if(name == "Vikas")
			{
				System.out.println("Welcome to your System! Vikas");
			}
		
		else
			{
				System.out.println("Sorry! you are not Vikas");	
			}


	}
}