import java.util.*;
class OddEven 
{
	public static void main(String[] args) {
		//We do code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		if(n%2 == 0)
		{
			System.out.println("The number is Even Number");
		}
		else
		{
			System.out.println("The number is Odd Number");
		}

	}
}