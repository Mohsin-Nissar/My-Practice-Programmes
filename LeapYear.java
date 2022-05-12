
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
       
       System.out.println("Enter your year here ");
        double input = sc.nextDouble();

        //Condition for years like 1900 etc
       
       if (input % 4 == 0 && input % 400 == 0) {
            System.out.println("Yes it is a leap year");}

        //Condition for years like 2000, 2004 etc.
       
       else if (input % 4 == 0  && input%100 != 0){
            System.out.println("Yes it is a leap year"); }

       //  All non leap years
       
       else System.out.println("No it is not a leap year");

    }}
