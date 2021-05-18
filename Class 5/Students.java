import java.util.*;
 class Students{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total;
		System.out.println("Enter Total students:");
		total=sc.nextInt();
		String[] names = new String[total+1];
		int[] age = new int[total];
		System.out.println("Enter name of all students");
		for(int i = 0; i<total+1; i++)
		{	
			names[i]=sc.nextLine();
		}
		for(int i = 0; i<total; i++)
		{	
				System.out.println("Enter Student age:");
				age[i]=sc.nextInt();
		}
			System.out.println("Total students in class is: "+ total);
			for(int i = 1; i<total+1; i++)
			{		
					System.out.print(" Name:>"+names[i]);
					
			}
			System.out.println();
			for(int i = 0; i<total; i++)
			{	
				System.out.print(" Age:>"+age[i]);
			}
}
}