package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double a = input.nextInt();
    double b = input.nextInt();
    double c = input.nextInt();
    double x1;
    double x2;
    double x;
    double D = Math.pow (b,2)-4*a*c;

    if (a!=0){
      System.out.println("Berechnung:" + D);
    }

    if (D>=0){

       x1=-b+Math.sqrt(D)/2*a;
       x2=-b-Math.sqrt(D)/2*a;
       System.out.println("x1 =" + x1);
       System.out.println("x2 =" + x2);
    } else if (D<0) {
      System.out.println("Imaginary values");
    }
    else if (b!=0){
      x= -c/a*x+b;
      System.out.println("Berechnung:" + x);
    }
    
  
}  