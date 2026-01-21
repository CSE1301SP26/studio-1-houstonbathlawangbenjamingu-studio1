package studio1;

import java.util.Scanner;
public class LeapYear {

public static void main(String[] args) {
Scanner leap = new Scanner(System.in);
System.out.println("Enter a year: ");
int year = leap.nextInt();
boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
System.out.println("Is the year " + year + " a leap year? " + isLeapYear);

}
}
