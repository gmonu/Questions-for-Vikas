import java.util.Scanner;
class Datatypes
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value in byte Datatype");
		byte a = sc.nextByte(); //-128 to 127
		short b = 23456; //-32768 to 32767
		double c = 1.4343224243434453f;
		boolean is=true;
		char[] name = {'m', 'o', 'n', 'u'};
		String s = "This is Monu Gupta";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// System.out.println(is);
		System.out.println(name[0]);
		System.out.println(s);
		
		

	}
}