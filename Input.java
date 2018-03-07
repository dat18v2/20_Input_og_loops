import java.util.Scanner;

public class Input{

   public static void main(String[] args){
      
      Scanner s = new Scanner(System.in);   
      System.out.print("Write your name: ");
      String name = s.next();
      System.out.println("Hello " + name + "!");
      
      System.out.print("Write your age: ");
      s.nextLine();
      while (!s.hasNextInt()){
         s.nextLine();
         System.out.print("Please write your age as integer: ");
         
      }
      int age = s.nextInt();
      System.out.println("So you're " + age + " years old. I see!");
   }
}