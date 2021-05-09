import java.util.Scanner;
class Table
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = sc.nextInt(); // 2
		System.out.println("Enter Second number");
		int b = sc.nextInt(); //3
		int c;
		int i;

		for(i = 1; i <= 10; i++)
		{
			System.out.print(i*a+" ");	
		}
		System.out.println();
		for(i = 1; i <= 10; i++)
		{
			System.out.print(i*b+" ");	
		}
		System.out.println();
		for(i = 1; i <= 10; i++)
		{
			System.out.print((i*a)+(i*b)+" ");
		}

	}
}