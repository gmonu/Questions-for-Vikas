//Square Pattern
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		int n = sc.nextInt();
        for(row = 1; row<=n; row++)
        {
            for(col = 1; col<=n; col++)
            {
                System.out.print("*"+" ");
            }
                System.out.println();
            
        }
	}
}


//Right Angle triangle pattern from leftside

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		int n = sc.nextInt();
        for(row = 1; row<=n; row++)
        {
            for(col = 1; col<=row; col++)
            {
                System.out.print("*"+" ");
            }
                System.out.println();
            
        }
	}
}


//Right angled triangle from right side

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		int n = sc.nextInt();
        for(row = 1; row<=n; row++)
        {
            for(col = n-1; col>=row; col--)
            {
                System.out.print(" ");
            }
            
            for(int k = 1; k<=row; k++)
            {
                System.out.print("*");
            }
            
                System.out.println();
            
        }
	}
}

// 1-n counting in each n line


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		int n = sc.nextInt();
        for(row = 1; row<=n; row++)
        {
            for(col = 1; col<=n; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
	}
}

-------------------------------------------------HOMEWORK-------------------------------------------------------
//write code for the following pattern
n = 5
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1



 n = 10
9 7 5 3 1
9 7 5 3 1
9 7 5 3 1
9 7 5 3 1
9 7 5 3 1
	
	
n = 10
1 3 5 7 9
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
	

n =8 
5 10 15 20 25 30 35 40
5 10 15 20 25 30 35 40
5 10 15 20 25 30 35 40 
5 10 15 20 25 30 35 40
5 10 15 20 25 30 35 40 
5 10 15 20 25 30 35 40 
5 10 15 20 25 30 35 40 
5 10 15 20 25 30 35 40 	
	
	
n = 10
2 3 5 7 
2 3 5 7 
2 3 5 7 
2 3 5 7 
2 3 5 7 
2 3 5 7 
2 3 5 7 	
2 3 5 7 
2 3 5 7 
2 3 5 7 
	
n = 5
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E

	


