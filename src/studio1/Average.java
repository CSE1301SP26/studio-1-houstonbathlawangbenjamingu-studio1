package studio1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter value for a: ");
      int a = in.nextInt();
      System.out.print("Enter value for b: ");
    double b = in.nextDouble();
    double average = (a+b) /2.0;
    System.out.println(" The average of " + a + " and " + b + " is " + average);

}
}