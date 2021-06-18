import java.util.*;
import java.lang.Math;

class AreaOfHexagon
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of side");
		double side = sc.nextDouble();
		double sidesqrt = side*side;
		double pi = 3.14;
		double pia = pi/6;
		double tanvalue = Math.tan(pia);
		System.out.println(tanvalue);
		double result = (6 * sidesqrt)/(4*tanvalue);
		System.out.println("The area of Hexagon is:"+result);


	}
}
