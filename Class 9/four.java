import java.util.*;
class StringFunctions
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstname = "Vikas ";
		String lastname = "Maurya";
		String result = firstname+lastname;
		System.out.println(firstname+lastname);
		
		// To find the length of String
		int len = firstname.length();
		System.out.println(len);
		
		// to print the desired character
		System.out.println(firstname.charAt(firstname.length()-1));

		for(int i = result.length()-1; i>=0; i--)
		{
			System.out.print(result.charAt(i));
		}
		System.out.println("\n\n\n");

		// UpperCase LowerCase

		String low = "lowercase";
		System.out.println("This is lowercase\t"+low+"\t Now becomes Uppercase \t"+low.toUpperCase());
				System.out.println("This is Uppercase\t"+low.toUpperCase()+"\t Now becomes Lowercase \t"+low.toLowerCase());
	}
}