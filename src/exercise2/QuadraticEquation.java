package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double a = input.nextInt();
    System.out.println("Enter a value for a" + a);
    double b = input.nextInt();
    System.out.println("Enter a value for b = " + b);
    double c = input.nextInt();
    System.out.println("Enter a value for c = " + c);

     if (a!=0){
      double D = Math.pow (b,2)-(4*a*c);
      System.out.println("D = " + D);
    }

    if (D>=0){

       double x1=(-b+Math.sqrt(D))/(2*a);
       System.out.println("x1 =" + x1);
       double x2=(-b-Math.sqrt(D))/(2*a);
       System.out.println("x2 =" + x2);
  } 
    else {
      System.out.println("Imaginary values");
    }

  }
    else if (b!=0){
      double x=(-c)/b;
      System.out.println("x =" + x);
    }
    else if (b==0 & c!=0) {
      System.out.println("No values");
    }
     else (b==0 & c==0) {
       System.out.println("Many values");
     }
}
}
