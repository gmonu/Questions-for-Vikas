import java.util.Scanner;
class Dog {
  
   public static String breed;
   public static int age;
   public static String color;

   public static void barking() {
   		System.out.println("Dog is barking");
   }

   public static int hungry() {
   			return 5;
   }

   void sleeping() {
   }
   public static void main(String[] args) {
   		Scanner sc = new Scanner(System.in);
   		System.out.println("Enter breed");
   		breed = sc.nextLine();
   		System.out.println("Enter age");
   		age = sc.nextInt();
   		System.out.println("Enter color");
   		color = sc.next();	
   		System.out.println(breed+"  "+age+"  "+color);	
   		barking();
   		System.out.print(hungry());
   }
}