import java.util.Scanner;
class LoopsExample
{
	// while loop, Do-while loop, For loop
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		// while loop example
		while(n<=10)
		{
			System.out.print(n+" ");
			n++;
		}

		//do while loop example
		System.out.println("Do while answer");
		do{
			System.out.println(n);
		}while(n<=10);


		//for loop 
		for(int i = 1; i <=10; )
		{
			System.out.print(i + " ");
			i++;
		}



	}
}