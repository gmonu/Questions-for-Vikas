import java.util.*;
class ArrayExamples
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int[] a = new int[size];

		for(int i =0; i<size; i++)
		{
			a[i] = sc.nextInt();	
		}



		for(int i : a)
		{
			System.out.print(i+" ");
		}

		System.out.println("\nevRerse of Array\n");
		for(int i = size-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}

		System.out.print(a[size-1]);
		


	}
}