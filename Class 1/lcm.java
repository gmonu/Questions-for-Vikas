import java.util.Scanner;
class LCM
{
	public static void main(String[] args) {
		//for taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i;
		// n = 1, 2, 3
		for(i = 2; i<=n; i++)
		{
			if(n%i == 0)
			{
				System.out.println("LCM of   "+n+"is   "+i);
				break;
			}
		}
	}
}