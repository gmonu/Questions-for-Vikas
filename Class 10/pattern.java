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
//start 
import java.util.*;
class Pattern2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		int n = sc.nextInt();
         
        for(row = 1; row<=n; row++)
        {
            for(col = n; col>=1; col--)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
	}
}
//End 	


 n = 10
9 7 5 3 1
9 7 5 3 1
9 7 5 3 1
9 7 5 3 1
9 7 5 3 1
// start

import java.util.*;
class Add
{
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
     /* 	-----This Is Comment------- 
     for (int i=1; i<=a; i++) 
     */ 
       for (int i=a; i>=1; i--)  	
		
		if(i%2 !=0)
		{
			System.out.print(i);
		}


	}
}

import java.util.*;
class Main
{
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
       for (int j=a; j>=1; j--)  	
		{
        		for (int i=a; i>=1; i--) 
        		if(i%2 !=0)
        		{
        			System.out.print(i+" ");
        		}
            System.out.println();
		}

	}
}

//End 
	
n = 10
1 3 5 7 9
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9
//start	
import java.util.*;
class Add
{
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
       for (int i=1; i<=n; i++) {
		
		if(i%2 !=0)
		{
			System.out.print(i+"");
		}
	}


	}
}	

//End
n =8 
5 10 15 20 25 30 35 40
5 10 15 20 25 30 35 40
5 10 15 20 25 30 35 40 
5 10 15 20 25 30 35 40
5 10 15 20 25 30 35 40 
5 10 15 20 25 30 35 40 
5 10 15 20 25 30 35 40 
5 10 15 20 25 30 35 40 	
//start
	import java.util.*;
 class Pattern1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        int n = sc.nextInt();
        int p = 5;
        for(row = 1; row<=n; row++)
        {
            for(col = 1; col<=n; col++)
            {
                System.out.print(col*p+" ");
            }
            System.out.println();
        }
    }
}
//End
 
	
n = 5
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
import java.util.*;
 class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //101 --> 132
        int total = sc.nextInt();
                for(int j = 1; j<=total; j++)
                {
                        for(char i = 65; i<65+total; i++)
                        {
                            System.out.print(i+" ");
                        }
                        System.out.println();
                }
      
    }
}

import java.util.*;
 class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //101 --> 132
        int total = sc.nextInt();
                for(int j = 1; j<=total; j++)
                {
                        for(char i = 65; i<65+total; i++)
                        
                        {
                            System.out.print(i+" ");
                            
                             
                        }
                         for(char p= 97; p<97+total; p++)
                        {
                            System.out.print(p+" ");
                            
                             
                        }
                        System.out.println();
                }
      
    }
}	

----------------------HomeWork------------------------------
	
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
factorial = 5*4*3*2*1
	
peterson number	
123 = 1 + 2*1 + 3*2*1	

reverse number
1234567890
0987654321


Sunny Number
n = 1
n = n+1
if(n is perfect square)
	
n = 80 
n = 81
if(81 is perfect square)
	9 * 9 = 81
means 80 is Sunny number

for(int i = 1; i<=100; i++)
	int r = i * i;
	if(r==80)
		Sunny number
		break;
	
