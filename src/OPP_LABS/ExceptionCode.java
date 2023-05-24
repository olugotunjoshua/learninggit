package OPP_LABS;

import java.util.Scanner;



  class ArithException {
      void displayError(){
        int a= 8,b = 0;
        int c = a/b;
       System.out.println(c);
   }

 }

 class NullpointerException{

   public void DisplayError() {
      String name = null;

      if (name.equals("Joshua"))
          System.out.println("Same");
          else
              System.out.println("not same");

     }
 }

 class IndexOutOfBounds{

     void DisplayError() {
      String quote = "If you can't fly run , if you cant't run,walk," +
              "if you can't walk Crawl, but by all means Keep moving forward" ;

      System.out.println(quote.substring(7,8));
     }
 }
 class NegativeSizeArray{
Scanner sc = new Scanner(System.in);


     void DisplayError() {
         int n = sc.nextInt();
         int arr [] = new int [n];
         for (int i = 0; i<n; i++){
             System.out.println(arr[i]);
         }
     }
 }