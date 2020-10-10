package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
  public static void main(String[] args){
   Scanner input = new Scanner (System.in);
   int c = input.nextInt();
   if (c%2==0){
     System.out.println("Number is even");
   } else if (c%2==1){
     System.out.println("Number is odd");
   }
   
  }
     
}