import java.util.*;
class Table
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=10; i++)
		{
			System.out.println(a*i);
			if((a*i)%2==0)
			{
				count++;
			}
		}

		System.out.println("Total multiples of 2 is:"+count);






	}
}