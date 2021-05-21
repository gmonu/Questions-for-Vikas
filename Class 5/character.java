import java.util.*;
class Chara{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total;
		System.out.println("enter total students");
		total = sc.nextInt();
		char[] names = new char[20];
		for(int i = 0; i<20; i++)
		{
			System.out.println("Enter your name");
			names[i] = sc.next().charAt(i);
		}

	}
}