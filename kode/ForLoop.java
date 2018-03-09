import java.util.Scanner;

public class ForLoop{

   public static void main(String[] args){
      // Fence problemet
      for (int i=1;i<=5;i++){
         System.out.print("l=");
      }
      System.out.println();
      
      for (int i=1;i<=5;i++){
         System.out.print("l=");
      }
      System.out.print("l");
      System.out.println();
      
      System.out.print("l");
      for (int i=1;i<=5;i++){
         System.out.print("=l");
      }
      System.out.println();
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Hvor mange stykker stakit? ");
      int antal = scan.nextInt();
      if (antal>0){
         System.out.print("l");
         for (int i=1;i<=antal;i++){
            System.out.print("=l");
         }
      }
      System.out.println();     
   }
}