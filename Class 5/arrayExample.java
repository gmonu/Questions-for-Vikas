import java.util.*;
class ArrayExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];
		String[] s = new String[5];

		System.out.println("Enter 5 numbers");
		for(int i = 0; i<5; i++)
		{
			n[i] = sc.nextInt();
		}
		System.out.print("Enter 5 strings");
		for(int i = 0; i<s.length; i++)
		{
			s[i] = sc.nextLine();
		}
		
		for(int i = 0; i<5; i++)
		{
			System.out.print(n[i]+" ");
		}
		for(int i = 0; i<s.length; i++)
		{
			System.out.print(s[i]+" ");
		}	
	}
}




// Homework
// main -->
// 		Total students 
// 		names
// 		age
// 		display