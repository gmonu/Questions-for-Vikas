import java.util.*;
class CheckSame
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//for taking inputs from user
		System.out.println("Enter any two numbers");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int result1 = n-m; 
		int result2 = m-n;

		if(result1 == result2)
			{
				System.out.println("Both results are same");
			}
		else
			{
				System.out.println("Both results are not same");					
			}


	}
}