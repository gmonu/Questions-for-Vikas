import java.util.*;
import java.lang.Math;

class DistanceBetweenTwoPoints
{
	public static void main(String[] args) {
		double radius = 6371.01;	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1 and y1");
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		System.out.println("Enter the value of x2 and y2");
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();	
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("Distance between two points is:"+d);
		

	}
}