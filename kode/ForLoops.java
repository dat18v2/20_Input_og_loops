public class ForLoops{

   public static void main(String[] args){
      // exercise 1. print 10 linier med 10 stjerner
      System.out.println("exercise 1");
      for (int i = 1; i<=10; i++){
         System.out.println("* * * * * * * * * *");
      }

      // exercie 2. Talliste 
      System.out.println("exercise 2");
      System.out.print("[l");
      // første element er allerede skrevet, så forsæt ved andet
      for (int i=2;i<=10;i++){
         System.out.print(", "+ i);
      }
      System.out.println("]");
      
      // exercise 3
      System.out.println("exercise 3");
      greetings(3);
      
      // exercise 4
      System.out.println("exercise 4");
      print4(3);
      
      // exercise 5. print stjerner vha. function
      System.out.println("exercise 5");
      print5(3);
      
      // exercise 6. Trekant af stjerner
      System.out.println("exercise 6");
      for (int i=1; i<=10; i++){
         System.out.print("*");
         for (int j=2; j<=i; j++){
            System.out.print(" *");
         }
         System.out.println();
      }
  }
  
   public static void greetings(int antal){
       //udskriv antal Hello
       //bemærk static. Så kan den bruges uden at lave et nyt objekt
      for (int i = 1; i <= antal; i++) {
         System.out.println("Hello");
      }
   }
  
   public static void print4(int antalStjerner){
      for (int i = 1; i <= 10; i++) {
         print(antalStjerner);
      }
   }  
  
   public static void print5(int antalStjerner){
      for (int i = 1; i <= antalStjerner; i++) {
         print(i);
      }
   }  
  
   public static void print(int antal){
      //udskriv antal stjerner med mellemrum foran
      if (antal > 0){
         System.out.print("*");
         for (int j = 2; j <= antal; j++) {
            System.out.print(" *");
         }
      }
      System.out.println();
   }
   
}
