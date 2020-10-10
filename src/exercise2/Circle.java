package exercise2;

import java.util.Scanner;

public class Circle {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int radius = input.nextInt();
    double c = 2*Math.PI*radius;
    System.out.println("Circumference: " + c);
    double a= Math.PI*Math.pow(radius,2);
    System.out.println("Area: " + a);


  }

  }